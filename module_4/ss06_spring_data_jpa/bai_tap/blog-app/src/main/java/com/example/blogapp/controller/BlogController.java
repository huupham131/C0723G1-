package com.example.blogapp.controller;

import com.example.blogapp.model.Blog;
import com.example.blogapp.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private IBlogService blogService;

    @GetMapping("")
    public String showList(Model model) {
        model.addAttribute("blogList", blogService.getAllBlog());
        return "blog/list";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("blog", new Blog());
        return "blog/create";
    }

    @PostMapping("/create")
    public String createBlog(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes) {
        blogService.createNewBlog(blog);
        redirectAttributes.addFlashAttribute("mess","Add blog success !");
        return "redirect:/blog";
    }

    @PostMapping("/delete")
    public String deleteBlog(@RequestParam int id) {
        blogService.delete(id);
        return "redirect:/blog";
    }
    @GetMapping("/detail")
    public String showDetail(Model model, int id){
        model.addAttribute("blog",blogService.getBlog(id));
        return "/blog/detail";
    }
    @GetMapping ("/update")
    public String updateForm(int id, Model model){
        model.addAttribute("blog",blogService.getBlog(id));
        return "/blog/update";
    }
    @PostMapping("/update")
    public String updateBlog(@ModelAttribute Blog blog){
        blogService.update(blog);
        return "redirect:/blog";
    }
}
