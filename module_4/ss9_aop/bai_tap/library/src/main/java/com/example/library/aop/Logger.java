package com.example.library.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {
    @After("execution(* com.example.library.controller.BookController.borrowBook())")
    public void historyBorrowBook(JoinPoint joinPoint) {
        Object[] object = joinPoint.getArgs();
        int id = (int) object[1];
        System.out.println("Book borrow id" + id);
    }

    @After("execution(* com.example.library.controller.BookController.backBook())")
    public void historyBackBook() {

    }
}
