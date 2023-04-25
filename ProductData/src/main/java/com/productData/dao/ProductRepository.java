package com.productData.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productData.model.Product;
public interface ProductRepository extends JpaRepository<Product,Integer> {

}
