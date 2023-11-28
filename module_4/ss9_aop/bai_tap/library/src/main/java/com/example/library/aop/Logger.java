package com.example.library.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {
    @After("execution(* com.example.library.controller.BookController.*)")
    public void history(){

    }
}
