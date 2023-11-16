package com.example.thuc_hanh1.controller;

import com.example.thuc_hanh1.model.Login;
import com.example.thuc_hanh1.model.User;
import com.example.thuc_hanh1.model.UserDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @GetMapping("/home")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("/login/home");
        modelAndView.addObject("login", new Login());
        return modelAndView;
    }
    @PostMapping("/login")
    public ModelAndView login(@ModelAttribute("login") Login login){
        User user = UserDao.checkLogin(login);
        ModelAndView modelAndView;
        if(user == null){
            modelAndView = new ModelAndView("/login/error");
        } else {
            modelAndView = new ModelAndView("/login/user");
            modelAndView.addObject("user", user);
        }
        return modelAndView;
    }
}
