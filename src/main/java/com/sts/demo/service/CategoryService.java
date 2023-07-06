package com.sts.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sts.demo.entity.Category;
import com.sts.demo.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired 
	
	public CategoryRepository categoryRepository;
	
	public List<Category> getCategories(){
		List<Category> category = new ArrayList<Category>();  
		categoryRepository.findAll().forEach(category1 -> category.add(category1));  
		return category;  
	}
	public List<Category> getCategoryByName(String nameCategory)   
	{  List<Category> category = new ArrayList<Category>(); 
		  categoryRepository.findByName(nameCategory).forEach(name1 -> category.add(name1));
		  return category;
	} 
}
