package com.sts.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sts.demo.entity.*;
import com.sts.demo.repository.ProductRepository;
import com.sts.demo.repository.ShopRepository;

import jakarta.transaction.Transactional;
@Service
public class ShopService {
	
	@Autowired
	public ShopRepository shopRepository;
	    private final ProductRepository productRepository;
	public Shop addShop(Shop shop) {
        return shopRepository.save(shop);
    }
	 

	    @Autowired
	    public ShopService(ShopRepository shopRepository, ProductRepository productRepository) {
	        this.shopRepository = shopRepository;
	        this.productRepository = productRepository;
	    }
	    @Transactional
	    public void deleteShopById(int shopId) {
	        Shop shop = shopRepository.findById(shopId).orElse(null);

	        if (shop != null) {
	            List<Product> products = productRepository.findByShop(shop);

	            if (products != null && !products.isEmpty()) {
	                for (Product product : products) {
	                    productRepository.delete(product);
	                }
	            }

	            shopRepository.deleteById(shopId);
	        }
	    }




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
	 

	public List<Shop> getShopsByCategory(Category category) {
	    List<Shop> shopcategory = new ArrayList<Shop>();
	    shopRepository.findByCategory(category).forEach(shop1 -> shopcategory.add(shop1));
	    return shopcategory;
	}
	
			  public Optional<Shop> getShopById(Integer id) {
			        return shopRepository.findById(id);
			    }

			  public Shop updateShop(int id, Shop updatedShop) {
			        Optional<Shop> existingShopOptional = shopRepository.findById(id);
			        if (existingShopOptional.isPresent()) {
			            Shop existingShop = existingShopOptional.get();
			            existingShop.setImageShop(updatedShop.getImageShop());

			            existingShop.setNameShop(updatedShop.getNameShop());
			            existingShop.setLocalisationShop(updatedShop.getLocalisationShop());
			            existingShop.setCategory(updatedShop.getCategory());

			            return shopRepository.save(existingShop);
			        
			            
			  
			    }
					return updatedShop;
			  }
}


