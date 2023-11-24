package com.example.register_form.controller;

import com.example.register_form.dto.UserDto;
import com.example.register_form.model.User;
import com.example.register_form.service.IUserService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("")
    public String showForm(Model model) {
        model.addAttribute("userDto", new UserDto());
        return "/register/form";
    }

    @PostMapping("/signIn")
    public String register(@Valid @ModelAttribute UserDto userDto, BindingResult bindingResult , RedirectAttributes redirectAttributes, Model model) {
        User user = new User();
        new UserDto().validate(userDto,bindingResult);
        if (bindingResult.hasFieldErrors()) {
            return "/register/form";
        }
        BeanUtils.copyProperties(userDto,user);
            userService.addUser(user);
            return "/register/result";

    }
}
