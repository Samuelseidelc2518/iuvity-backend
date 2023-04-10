package com.farukgenc.booilerplate.springboot.controller;

import com.farukgenc.booilerplate.springboot.model.Product;
import com.farukgenc.booilerplate.springboot.security.dto.LoginRequest;
import com.farukgenc.booilerplate.springboot.security.dto.LoginResponse;
import com.farukgenc.booilerplate.springboot.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;
    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {

        final List<Product> products = productService.getAllProducts();

        return ResponseEntity.ok(products);
    }
}
