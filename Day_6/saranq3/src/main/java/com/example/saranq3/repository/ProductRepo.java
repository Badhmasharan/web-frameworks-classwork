package com.example.saranq3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.saranq3.model.Product;

public interface ProductRepo extends JpaRepository<Product,Integer> {

}
