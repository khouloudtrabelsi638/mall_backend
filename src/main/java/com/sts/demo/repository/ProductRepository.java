package com.sts.demo.repository;
import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
 
import com.sts.demo.entity.Product;

@Repository
public interface ProductRepository  extends JpaRepository<Product,Integer>{
	List<Product> findByName(String nameProduct);
}
