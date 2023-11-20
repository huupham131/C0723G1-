package com.example.controller;

import com.example.model.Product;
import com.example.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping("")
    public String showList(Model model) {
        model.addAttribute("productList", productService.getAll());
        return "/list";
    }

    @GetMapping("/create")
    public String formAdd(Model model) {
        model.addAttribute("product", new Product());
        return "/create";
    }

    @PostMapping("/create")
    public String createNewProduct(@ModelAttribute Product product) {
        productService.createNew(product);
        return "redirect:/product";
    }

    @GetMapping("/update")
    public String updateForm(int id, Model model) {
        model.addAttribute("product", productService.getProduct(id));
        return "/update";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Product product) {
        productService.update(product.getId(), product);
        return "redirect:/product";
    }

    @GetMapping("/delete")
    public String delete(int id) {
        productService.delete(id);
        return "redirect:/product";
    }

    @GetMapping("/detail")
    public String detailForm(int id, Model model) {
        model.addAttribute("product", productService.getProduct(id));
        return "/detail";
    }

    @GetMapping("/search")
    public String searchByName(String name, Model model) {
        model.addAttribute("productList", productService.searchByName(name));
        model.addAttribute("name",name);
        return "/list";
    }
}
