package com.example.library.controller;

import com.example.library.aop.MyException;
import com.example.library.model.Book;
import com.example.library.model.BorrowCode;
import com.example.library.service.IBookService;
import com.example.library.service.IBorrowCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;

@Controller
@RequestMapping("")
public class BookController {
    @Autowired
    private IBorrowCodeService borrowCodeService;
    @Autowired
    private IBookService bookService;
    @GetMapping("")
    public String showList(Model model){
        model.addAttribute("bookList",bookService.getAllBook());
        return "/list";
    }
    @GetMapping("/detail")
    public String showDetail(Model model, int id){
        model.addAttribute("book",bookService.getBook(id));
        return "/detail";
    }
    @GetMapping("/borrow")
    public String borrowBook(Model model, int id){
        String code ="";
        while (borrowCodeService.checkCode(code)) {
            code=String.valueOf(new Random().nextInt(90000) + 10000);
        }
        Book book =bookService.getBook(id);
        if(book.getQuantity()==0){
            return "/detail";
        }
        book.setQuantity(book.getQuantity()-1);
        bookService.update(book);
        BorrowCode borrowCode = new BorrowCode();
        borrowCode.setCode(code);
        borrowCode.setStatus(true);
        borrowCode.setBook(book);
        borrowCodeService.createBorrowCode(borrowCode);
        model.addAttribute("borrowCode",borrowCode);
        return "/result";
    }
    @GetMapping("/returnBook")
    public String backBook(String code,Model model){
        if(borrowCodeService.checkCode(code)){
            BorrowCode borrowCode = borrowCodeService.getBorrowCodeByCode(code);
            borrowCode.setStatus(false);
            borrowCodeService.updateBorrowCode(borrowCode);
            Book book = borrowCode.getBook();
            book.setQuantity(book.getQuantity()+1);
            bookService.update(book);
            return "redirect:";
        }
        model.addAttribute("code",code);
        return "errors";
    }
    @ExceptionHandler(MyException.class)
    public String handleException(){
        return "error";
    }
}
