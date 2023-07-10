package com.sts.demo.entity;
 

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
 

@Entity
@Table(name="Reduction")
public class Reduction {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idReduction;
 private String nameReduction;
	private float newprice;
	private float pourcentage;
	private String imageReduction;
	private String localisationReduction;
	
	
	@ManyToOne
	@JoinColumn(name="idProduct", nullable=false)
	private Product product;
	
	
	



	 

	public Reduction() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	 



	 
	 
	 



	



	public Reduction(int idReduction, String nameReduction, float newprice, float pourcentage, String imageReduction,
			String localisationReduction, Product product) {
		super();
		this.idReduction = idReduction;
		this.nameReduction = nameReduction;
		this.newprice = newprice;
		this.pourcentage = pourcentage;
		this.imageReduction = imageReduction;
		this.localisationReduction = localisationReduction;
		this.product = product;
	}


















	public String getImageReduction() {
		return imageReduction;
	}


















	public void setImageReduction(String imageReduction) {
		this.imageReduction = imageReduction;
	}


















	public String getLocalisationReduction() {
		return localisationReduction;
	}


















	public void setLocalisationReduction(String localisationReduction) {
		this.localisationReduction = localisationReduction;
	}


















	public Product getProduct() {
		return product;
	}




	public void setProduct(Product product) {
		this.product = product;
	}




	public String getNameReduction() {
		return nameReduction;
	}




	public void setNameReduction(String nameReduction) {
		this.nameReduction = nameReduction;
	}




	public int getIdReduction() {
		return idReduction;
	}




	public void setIdReduction(int idReduction) {
		this.idReduction = idReduction;
	}




	public float getNewprice() {
		return newprice;
	}
	public void setNewprice(float newprice) {
		this.newprice = newprice;
	}
	 
	public float getPourcentage() {
		return pourcentage;
	}
	public void setPourcentage(float pourcentage) {
		this.pourcentage = pourcentage;
	}
	 
	 
	
	
}
