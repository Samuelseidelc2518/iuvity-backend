package com.farukgenc.booilerplate.springboot.service;

import com.farukgenc.booilerplate.springboot.model.Product;
import com.farukgenc.booilerplate.springboot.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;


    //FindAll

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
