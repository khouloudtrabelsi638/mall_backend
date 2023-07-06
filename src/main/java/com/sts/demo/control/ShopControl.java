package com.sts.demo.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sts.demo.entity.Category;
import com.sts.demo.entity.Product;
import com.sts.demo.entity.Shop;
import com.sts.demo.service.ShopService;

@RestController
@RequestMapping(path="api/mall-1/Shop")
public class ShopControl {
@Autowired
public final ShopService shopService;

public ShopControl(ShopService shopService) {
	super();
	this.shopService = shopService;
}
@GetMapping("shops")
public List<Shop> getShops(){
	return  shopService.getShops();
}



@GetMapping("/{nameShop}")  
private List<Shop> getShop(@PathVariable("nameShop") String nameShop)   
{  
	return shopService.getShopByName(nameShop);  
}  


}
