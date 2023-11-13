package com.example.buysell.controllers;

import com.example.buysell.models.Product;
import com.example.buysell.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller//контролирует обращение нас как пользователя к приложению
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/")
    public String products(Model model){
        model.addAttribute("products", productService.listProducts());
        return "products";//название представления в теле документа
    }
    @GetMapping("/product/{id}")
    public String productInfo(@PathVariable Long id,Model model){
        model.addAttribute("product",productService.getProductById(id));
        return "product-info";
    }
    //Добавляем товар,обновляем страницу и в списки добавляется товар
    @PostMapping("/product/create")
    public String createProduct(Product product){
        productService.saveProduct(product);
        return "redirect:/";//обновить страницу
    }
    @PostMapping("/product/delete/{id}")
    public String deleteProduct(@PathVariable Long id){//в параметре получает и преобразовывает в переменную типа Long
        productService.deleteProduct(id);
        return "redirect:/";
    }
}
