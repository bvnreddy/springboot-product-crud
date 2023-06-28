package com.example.product_management.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.product_management.beans.Product;
import com.example.product_management.repository.ProductRepo;

@Service
public class ProductServices {
	
	@Autowired
	private ProductRepo repo;

	
	public List<Product> allProducts(){	
		return repo.findAll();
	}
	
	public Optional<Product> getProduct(long pId) {		
		return repo.findById(pId);		
	}
	
	public Product addProduct(Product product) {
		return repo.save(product);
	}
	
	public String deleteProduct(@PathVariable("pId") long pId) {
		repo.deleteById(pId);
		return "Product is Deleted";		
	}
	
	public Product updateProduct(@PathVariable("pId") long pId,@Validated Product product) {
		product.setpId(pId);	
		return repo.save(product);		
	}

}
