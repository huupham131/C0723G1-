package com.example.convertcurrency;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertController {
    @GetMapping("/convert")
    public String form(){
        return "/convert";
    }
    @PostMapping("/convert")
    public String convert(@RequestParam double usd, Model model){
        double result = usd * 24000;
        model.addAttribute("result",result);
        return "/convert";
    }
}
