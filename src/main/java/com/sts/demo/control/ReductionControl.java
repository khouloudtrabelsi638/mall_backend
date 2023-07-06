package com.sts.demo.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sts.demo.entity.Category;
import com.sts.demo.entity.Reduction;
import com.sts.demo.service.ReductionService;

@RestController
@RequestMapping(path="api/mall-1/Reduction")
public class ReductionControl {
@Autowired 
public final ReductionService reductionservice;

public ReductionControl(ReductionService reductionservice) {
	super();
	this.reductionservice = reductionservice;
}

@GetMapping("reductions")
public List<Reduction> getReductions(){
	return reductionservice.getReductions();
}


@GetMapping("/{nameReduction}")  
private List<Reduction> getReduction(@PathVariable("nameReduction") String nameReduction)   
{  
	return reductionservice.getReductionByName(nameReduction);  
}  



}
