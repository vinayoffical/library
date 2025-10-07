package com.library.demo.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.library.demo.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping
    private ResponseEntity<List<Product>> getProducts(){
       List<Product> response= restTemplate.getForEntity("https://fakestoreapi.com/products",List.class).getBody();

        return new ResponseEntity<>(response,HttpStatus.OK);
    }
}
