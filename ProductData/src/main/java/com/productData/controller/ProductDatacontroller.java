package com.productData.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.productData.model.Product;
import com.productData.service.ProductDataService;

@RestController
public class ProductDatacontroller {
 
	@Autowired
	ProductDataService proService;
	@GetMapping("/showproduct")
	public List<Product>getAllProduct(){
	         List<Product>proList=proService.getAllProduct();
	       return proList;
	}
    @PostMapping("/SaveProduct")
    public Product saveProductData(@RequestBody Product p)
    {
    	return proService.saveProduct(p);
}
    @PutMapping("/updateproduct")
    public Product updateProductData(@RequestBody Product p)
    {
    	return proService.updateProduct(p);	
    }
    @DeleteMapping("/deleteProduct/{id}")
    public String deleteProductData (@PathVariable("id")int id)
    {
         proService.deleteProduct(id);
         return "Deleted successfully";
         
    }
}
