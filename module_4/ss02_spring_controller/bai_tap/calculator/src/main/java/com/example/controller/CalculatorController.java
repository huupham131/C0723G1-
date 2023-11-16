package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping("/")
    public String showForm(){
        return "/index";
    }
    @GetMapping("/cal")
    public String calculator(@RequestParam double num1,
                             @RequestParam double num2,
                             @RequestParam String cal,
    Model model){
        double result =0;
        String mess="";
        switch (cal){
            case "Addition":
             result = num1 + num2;
             break;
            case "Subtraction":
                result = num1 - num2;
                break;
            case "Multiplication":
                result = num1 * num2;
                break;
            case "Division":
                if(num2==0){
                    mess = "Can't divide zero";
                    break;
                }
                result =num1/num2;
                break;
        }
        model.addAttribute("cal",cal);
        model.addAttribute("num1",num1);
        model.addAttribute("num2",num2);
        model.addAttribute("result",result);
        model.addAttribute("mess",mess);
        return "/index";
    }
}
