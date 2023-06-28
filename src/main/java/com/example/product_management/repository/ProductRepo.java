package com.example.product_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.product_management.beans.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

}
