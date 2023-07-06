package com.sts.demo.entity;
 

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
 

@Entity
@DiscriminatorValue("Reduction")
public class Reduction extends Product{
	
 
	 
	 
	private float newprice;
	private float pourcentage;
	 
	
	
	 
	
	

	public Reduction() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Reduction(  float newprice, float pourcentage) {
		super();
		 
		this.newprice = newprice;
		this.pourcentage = pourcentage;
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
