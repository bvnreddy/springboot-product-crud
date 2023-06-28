package com.example.product_management.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.product_management.beans.Product;
import com.example.product_management.services.ProductServices;

@RestController
@RequestMapping("product_management")
public class ProductController {
	
	@Autowired
	private ProductServices service;
	
	@GetMapping("/getAll")
	public List<Product> getAllProducts(){
		return service.allProducts();		
	}
	
	@GetMapping("/product/{pId}")
	public Optional<Product> getProduct(@PathVariable("pId") long pId) {
		return service.getProduct(pId);		
	}
	
	@PostMapping("/add")
	public Product add(@RequestBody Product product) {
		return service.addProduct(product);		
	}
	
	@PutMapping("/update/{pId}")
	public Product updatePro(@PathVariable("pId") long pId,@RequestBody Product product) {		
		return service.updateProduct(pId, product);		
	}
	@DeleteMapping("/delete/{pId}")
	public String deletepro(@PathVariable("pId") long pId){
		return service.deleteProduct(pId);		
	}
	
	
	

}
