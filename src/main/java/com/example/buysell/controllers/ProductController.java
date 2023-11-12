package com.example.buysell.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller//контролирует обращение нас как пользователя к приложению
public class ProductController {
    @GetMapping("/")
    public String products(){
        return "products";//название представления в теле документа
    }
}
