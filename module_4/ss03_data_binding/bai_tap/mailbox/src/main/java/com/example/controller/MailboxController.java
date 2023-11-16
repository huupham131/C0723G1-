package com.example.controller;

import com.example.model.Mailbox;
import com.example.service.IMailboxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mailbox")
public class MailboxController {
    @Autowired
    private IMailboxService mailboxService;

    @GetMapping("")
    public String showForm(Model model) {
        model.addAttribute("mailbox",mailboxService.getMailbox());
        model.addAttribute("languageList",new String[]{"English", "Vietnamese", "Japanese", "Chinese"});
        model.addAttribute("pageSizeList",new int[]{5, 10, 15, 25, 50, 100});
        return "/form";
    }
    @PostMapping("/update")
    public String update(@ModelAttribute Mailbox mailbox, Model model){
        mailboxService.updateMailbox(mailbox);
        model.addAttribute("mailbox",mailboxService.getMailbox());
        model.addAttribute("mess","update complete");
        return "/result";
    }
}
