package com.productData.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productData.dao.ProductRepository;
import com.productData.model.Product;

@Service
public class ProductDataService {
@Autowired
    ProductRepository repo;
	public List<Product>getAllProduct()
	{
		List<Product> proList=repo.findAll();
		return proList;
	}
	public Product saveProduct(Product p)
	{
		Product obj=repo.save(p);
		return obj;
	}
	public Product updateProduct(Product p)
	{
		Product obj = repo.save(p);
		return obj;
	}
	public void deleteProduct(int id)
	{
		repo.deleteById(id);
	}
	public Optional<Product> getProductbyId(int id)
	{
		return repo.findById(id);
	}
}
