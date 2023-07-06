package com.sts.demo.entity;
 
 

import java.util.Collection;
import java.util.Locale.Category;

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
@Table(name="Shop")
public class Shop {

 

@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idShop; 

	private String nameShop;
	private String localisationShop;
	
@ManyToOne
@JoinColumn(name="idCategory", nullable=false)
	private Collection<Category> category;

	private String timeopen;
	private String timeclose;
	private String descriptionShop;



public Shop() {
	super();
	// TODO Auto-generated constructor stub
}


 


public int getIdShop() {
	return idShop;
}



public void setIdShop(int idShop) {
	this.idShop = idShop;
}

 
public String getNameShop() {
	return nameShop;
}



public void setNameShop(String nameShop) {
	this.nameShop = nameShop;
}


 
public String getLocalisationShop() {
	return localisationShop;
}



public void setLocalisationShop(String localisationShop) {
	this.localisationShop = localisationShop;
}

 
 public Collection<Category>  getCategory() {
	return category;
}



public void setCategory(Collection <Category> category) {
	this.category = category;
}


 
public String getTimeopen() {
	return timeopen;
}



public void setTimeopen(String timeopen) {
	this.timeopen = timeopen;
}


@Column (name="timeclose")
public String getTimeclose() {
	return timeclose;
}



public void setTimeclose(String timeclose) {
	this.timeclose = timeclose;
}


@Column (name="descriptionShop ")
public String getDescriptionShop () {
	return descriptionShop ;
}



public void setDescriptionShop (String descriptionShop ) {
	this.descriptionShop  = descriptionShop ;
}



}
