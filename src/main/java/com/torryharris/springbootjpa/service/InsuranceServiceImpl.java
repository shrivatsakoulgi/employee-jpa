package com.torryharris.springbootjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.torryharris.springbootjpa.entity.Insurance;
import com.torryharris.springbootjpa.repository.InsuranceRepository;

@Service
public class InsuranceServiceImpl implements InsuranceService{

	@Autowired
	private InsuranceRepository insuranceRepository;
	@Override
	public List<Insurance> getAllInsurance() {
		return (List<Insurance>) insuranceRepository.findAll();
	}

	@Override
	public Insurance getInsuranceById(Integer insuranceId) {
		return insuranceRepository.findById(insuranceId).get();
	}

	@Override
	public void addInsurance(Insurance insurance) {
		insuranceRepository.save(insurance);
		
	}

	@Override
	public void deleteInsuranceById(Integer insuranceId) {
		insuranceRepository.deleteById(insuranceId);
		
	}

	@Override
	public void updateInsurance(Integer insuranceId, Insurance updatedInsurance) {
		// TODO Auto-generated method stub
		
	}

}
