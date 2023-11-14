package com.example.dictionary.controller;

import com.example.dictionary.service.IDictionaryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {

    private final IDictionaryService dictionaryService;

    public DictionaryController(IDictionaryService dictionaryService) {
        this.dictionaryService = dictionaryService;
    }

    @GetMapping("/dictionary")
    public String showForm(){
        return "/dictionary";
    }
    @PostMapping("/dictionary")
    public String result(@RequestParam String eng, Model model){
        String result="";
        if(dictionaryService.getAll().get(eng.trim().toLowerCase())==null){
            result+="Không tìm thấy kết quả";
        }else {
            result=dictionaryService.getAll().get(eng.trim().toLowerCase());
        }
        model.addAttribute("result",result);
        model.addAttribute("eng",eng);
        return "/dictionary";
    }
}
