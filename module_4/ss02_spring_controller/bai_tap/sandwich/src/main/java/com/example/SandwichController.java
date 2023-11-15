package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {
    @GetMapping("/")
    public String showForm(){
        return "/index";
    }
    @GetMapping("/save")
    public String showResult(@RequestParam("condiment") String[] condiment, Model model){
        model.addAttribute("condimentList",condiment);
        return "/result";
    }
}
