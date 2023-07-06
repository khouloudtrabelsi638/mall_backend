package com.sts.demo.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sts.demo.entity.Category;
import com.sts.demo.entity.Product;
import com.sts.demo.service.ProductService;

@RestController
@RequestMapping(path="api/mall-1/Product")
public class ProductControl {

	
	@Autowired 
	public final ProductService productservice;

	public ProductControl(ProductService productservice) {
		 
		this.productservice = productservice;
	}

	@GetMapping("/products")
	public List<Product> getProducts(){
		return  productservice.getProducts();
	}
	@GetMapping("/{nameProduct}")  
	private List<Product> getProduct(@PathVariable("nameProduct") String nameProduct)   
	{  
		return productservice.getProductByName(nameProduct);  
	} 
}
