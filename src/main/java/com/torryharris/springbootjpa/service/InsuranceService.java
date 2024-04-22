package com.torryharris.springbootjpa.service;

import java.util.List;

import com.torryharris.springbootjpa.entity.Insurance;

public interface InsuranceService {

	List<Insurance> getAllInsurance();
	Insurance getInsuranceById(Integer insuranceId);
	void addInsurance(Insurance insurance);
	void deleteInsuranceById(Integer insuranceId);
	void updateInsurance(Integer insuranceId, Insurance updatedInsurance);
}
