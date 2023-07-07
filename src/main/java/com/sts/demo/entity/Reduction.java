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
public class Reduction{
	
 
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	 private int idReduction;
	
	private float newprice;
	private float pourcentage;
	@ManyToOne
	@JoinColumn(name="idProduct", nullable=false)
	 private Product product;
	
	
	 
	
	

	public Reduction() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Reduction(int idReduction,Product product  ,float newprice, float pourcentage) {
		super();
		 this.idReduction=idReduction;
		this.newprice = newprice;
		this.pourcentage = pourcentage;
		this.product=product;
	}




	 
	 
	 
	public int getIdReduction() {
		return idReduction;
	}




	public void setIdReduction(int idReduction) {
		this.idReduction = idReduction;
	}




	public Product getProduct() {
		return product;
	}




	public void setProduct(Product product) {
		this.product = product;
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
