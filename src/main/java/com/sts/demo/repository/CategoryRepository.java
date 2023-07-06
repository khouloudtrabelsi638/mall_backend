package com.sts.demo.repository;
import com.sts.demo.entity.*;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long>{
	 
}
