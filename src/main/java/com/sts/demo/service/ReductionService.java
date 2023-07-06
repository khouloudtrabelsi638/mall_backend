package com.sts.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sts.demo.entity.Category;
import com.sts.demo.entity.Reduction;
import com.sts.demo.repository.ReductionRepository;

@Service
public class ReductionService {
	
	@Autowired
public ReductionRepository reductionRepository;


public List<Reduction> getReductions(){
	List<Reduction> reduction = new ArrayList<Reduction>();  
	reductionRepository.findAll().forEach(reduction1 -> reduction.add(reduction1));  
	return reduction;  
}



}
