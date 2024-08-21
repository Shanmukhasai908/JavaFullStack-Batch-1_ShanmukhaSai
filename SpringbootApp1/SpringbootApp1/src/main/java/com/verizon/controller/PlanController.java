package com.verizon.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.verizon.model.Plan;

@RestController
public class PlanController {
	@GetMapping("/plan")
	public String getPlanDetails() {
		return "Plan Details : 55 Days ; 50 paise";
	}
	
	@PostMapping("/plan")  
	public Plan getPlanDetails(@RequestBody Plan plan) {
		//plan=new Plan(101,"IndependenceDayplan",30);
		return plan;  //" Plan1 details : 45 days"; 
	}
	@PutMapping("/plan") 
	public String updatePlanDetails() {
		
		return " Plan1 is updated"; 
	}
	@DeleteMapping("/plan") 
	public String deletePlanDetails() {
		
		return " Plan1 is deleted"; 
	}

}
