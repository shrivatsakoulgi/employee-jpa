package com.torryharris.springbootjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.torryharris.springbootjpa.entity.Insurance;
import com.torryharris.springbootjpa.service.InsuranceService;

@RestController
@RequestMapping("/insurance")
public class InsuranceController {
	
	@Autowired
	private InsuranceService insuranceService;
	
	@GetMapping
	public List<Insurance> getAllInsurance(){
		return insuranceService.getAllInsurance();
	}
	
	@GetMapping("/{insuranceId}")
	public Insurance getInsuranceById(@PathVariable Integer insuranceId){
		return insuranceService.getInsuranceById(insuranceId);
	}

	@PostMapping
	public String addInsurance(@RequestBody Insurance insurance) {
		insuranceService.addInsurance(insurance);
		return "Insurance Added with ID:"+insurance.getInsuranceId();
	}
}
