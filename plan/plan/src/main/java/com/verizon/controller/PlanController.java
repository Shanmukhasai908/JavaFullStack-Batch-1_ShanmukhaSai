package com.verizon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlanController {
	@Autowired
	PlanService planService;
	@GetMapping("/plan")
	public List<plan> getPlantDetails(){
		return planService.getPlans();
	}
	

}
