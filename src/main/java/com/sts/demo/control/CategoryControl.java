package com.sts.demo.control;

 
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.sts.demo.entity.Category;
import com.sts.demo.service.CategoryService;

@RestController
@RequestMapping(path="api/mall-1/Category")

@CrossOrigin(origins = "http://localhost:4200")
public class CategoryControl {

	@Autowired
	private final CategoryService categoryservice;
	
	
	public CategoryControl(CategoryService categoryservice) {
		 
		this.categoryservice = categoryservice;
	}

	@PostMapping("/add")
    public ResponseEntity<Category> addCategory(@RequestBody Category category) {
        Category addedCategory = categoryservice.addCategory(category);
        return ResponseEntity.ok(addedCategory);
    }
	@GetMapping("/categories")
	public List<Category> getCategories(){
		return categoryservice.getCategories();
	}
	
	@GetMapping("/categories/{nameCategory}")  
	private List<Category> getCategory(@PathVariable("nameCategory") String nameCategory)   
	{  
		return categoryservice.getCategoryByName(nameCategory);  
	}
	 @DeleteMapping("delete/{id}")
	    public ResponseEntity<Void> deleteCategory(@PathVariable Long id) {
	        Optional<Category> category = categoryservice.getCategoryById(id);
	        if (category.isPresent()) {
	        	categoryservice.deleteCategory(id);
	            return ResponseEntity.noContent().build();
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }
	 @PutMapping("update/{id}")
	    public ResponseEntity<Category> updateCategory(@PathVariable Long id, @RequestBody Category updatedCategory) {
	        Optional<Category> categoryOptional = categoryservice.getCategoryById(id);

	        if (categoryOptional.isPresent()) {
	            Category category = categoryOptional.get();
	            category.setNameCategory(updatedCategory.getNameCategory());
	            category.setImageCategory(updatedCategory.getImageCategory());

	            // Save the updated category
	            Category savedCategory = categoryservice.updateCategory(category);

	            return new ResponseEntity<>(savedCategory, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }
	
}
