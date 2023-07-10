package com.sts.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sts.demo.entity.*;
import com.sts.demo.repository.ShopRepository;
@Service
public class ShopService {
	
	@Autowired
	public ShopRepository shopRepository;
	
	
	public List<Shop> getShops(){
		List<Shop> shop = new ArrayList<Shop>();  
		shopRepository.findAll().forEach(shop1 -> shop.add(shop1));  
		return shop;  
	}
	
	public List<Shop> getShopByName(String nameShop)   
	{  List<Shop> shopfind = new ArrayList<Shop>();  
		  shopRepository.findByNameShop(nameShop).forEach(shop1 -> shopfind.add(shop1));
		  return shopfind;
	}
	

}
