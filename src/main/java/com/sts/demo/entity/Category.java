package com.sts.demo.entity;
 


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Category")
public class Category {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long idCategory;
	
	private String nameCategory;

public Category() {
	super();
	// TODO Auto-generated constructor stub
}
public Category(Long idCategory, String nameCategory) {
	super();
	this.idCategory = idCategory;
	this.nameCategory = nameCategory;
}

public Long getIdCategory() {
	return idCategory;
}
public void setIdCategory(Long idCategory) {
	this.idCategory = idCategory;
} 

public String getNameCategory() {
	return nameCategory;
}
public void setNameCategory(String nameCategory) {
	this.nameCategory = nameCategory;
}
 

}

