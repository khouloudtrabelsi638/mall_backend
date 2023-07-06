package com.sts.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sts.demo.entity.Product;
import com.sts.demo.entity.Shop;

@Repository
public interface ShopRepository extends JpaRepository<Shop,Integer> {
	List<Shop> findByName(String nameShop);
}
