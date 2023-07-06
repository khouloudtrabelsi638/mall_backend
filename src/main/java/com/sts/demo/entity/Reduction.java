package com.sts.demo.entity;
 

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
 

@Entity
@DiscriminatorValue("Reduction")
public class Reduction extends Product{
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idReduction; 
	
	 
	 
	private float newprice;
	private float pourcentage;
	 
	
	
	 
	
	

	public Reduction() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Reduction(int idReduction, float newprice, float pourcentage) {
		super();
		this.idReduction = idReduction;
		this.newprice = newprice;
		this.pourcentage = pourcentage;
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
