package com.sts.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sts.demo.entity.Category;
import com.sts.demo.entity.Product;
import com.sts.demo.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired 
	public   ProductRepository productRepository;

	
	 


	public List<Product> getProducts(){
		List<Product> product = new ArrayList<Product>();  
		productRepository.findAll().forEach(product1 -> product.add(product1));  
		return product;  
	}
	
	
	
	public List<Product> getProductByName(String nameProduct)   
	{  List<Product> product = new ArrayList<Product>(); 
	productRepository.findByName(nameProduct).forEach(name1 -> product.add(name1));
		  return product;
	} 
}
