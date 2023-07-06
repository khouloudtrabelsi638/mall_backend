package com.sts.demo.control;

 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sts.demo.entity.Category;
import com.sts.demo.service.CategoryService;

@RestController
@RequestMapping(path="api/mall-1/Catgeory")
public class CategoryControl {

	@Autowired
	private final CategoryService categoryservice;
	
	
	public CategoryControl(CategoryService categoryservice) {
		 
		this.categoryservice = categoryservice;
	}


	@GetMapping("/categories")
	public List<Category> getCategories(){
		return categoryservice.getCategories();
	}
	
	
	@GetMapping("/{nameCategory}")  
	private List<Category> getCategory(@PathVariable("nameCategory") String nameCategory)   
	{  
		return categoryservice.getCategoryByName(nameCategory);  
	}  
	
	
}
