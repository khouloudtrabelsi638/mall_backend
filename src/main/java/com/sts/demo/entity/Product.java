package com.sts.demo.entity;

import java.util.Collection;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Product")
public class Product {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idProduct;
	
	private String nameProduct;
	@ManyToOne
	@JoinColumn(name="idShop", nullable=false)
	private Collection<Shop> shop;
	
	private float price;
	private String descriptionProduct;
	private String localisationProduct;
	private Boolean stock;
	
	
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}



 

	public int getIdProduct() {
		return idProduct;
	}



	 
	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}



	 
	public String getNameProduct() {
		return nameProduct;
	}




	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}


	 
	public Collection<Shop> getShop() {
		return shop;
	}




	public void setShop(Collection<Shop> shop) {
		this.shop = shop;
	}



	 
	public float getPrice() {
		return price;
	}




	public void setPrice(float price) {
		this.price = price;
	}



	 
	public String getDescriptionProduct() {
		return descriptionProduct;
	}




	public void setDescriptionProduct(String descriptionProduct) {
		this.descriptionProduct = descriptionProduct;
	}



	 
	public String getLocalisationProduct() {
		return localisationProduct;
	}




	public void setLocalisationProduct(String localisationProduct) {
		this.localisationProduct = localisationProduct;
	}



	 
	public Boolean getStock() {
		return stock;
	}




	public void setStock(Boolean stock) {
		this.stock = stock;
	}
	
	
	

}
