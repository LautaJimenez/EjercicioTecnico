package com.lautaro.Ejercicio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lautaro.Ejercicio.services.ProductService;
import com.lautaro.Ejercicio.models.Product;

@RestController
@RequestMapping("productos")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("")
    public String saveProduct(@RequestBody Product ProductRequest){
        return service.saveProduct(ProductRequest);
    }

    @GetMapping("/id/{id}")
    public Product getProductById(@PathVariable Long id){
        return service.getProductById(id);
    }

    @GetMapping("/name/{name}")
    public Product getProductByName(@PathVariable String name){
        return service.getProductByName(name);
    }

    @GetMapping("")
    public Iterable <Product> getProductOrderByPrice(){
        return service.getProductOrderByPrice();
    }

    @PostMapping("/{id}")
    public String updateProductById(@PathVariable Long id, @RequestBody Product ProductRequest){
        return service.updateProductById(id,ProductRequest);
    }

    @DeleteMapping("/{id}")
    public String deleteProductByID(@PathVariable Long id){
        return service.deleteProductByID(id);
    }

}
