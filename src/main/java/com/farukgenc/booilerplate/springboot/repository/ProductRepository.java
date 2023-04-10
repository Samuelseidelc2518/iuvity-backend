package com.farukgenc.booilerplate.springboot.repository;

import com.farukgenc.booilerplate.springboot.model.Product;
import com.farukgenc.booilerplate.springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {


        List<Product> findAll();

}
