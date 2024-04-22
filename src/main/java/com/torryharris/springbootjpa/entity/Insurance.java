package com.torryharris.springbootjpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Insurance {
	@Id
	private Integer insuranceId;
	private String insuranceName;
	private String insuranceType;

	public Insurance(Integer insuranceId, String insuranceName, String insuranceType ) {
		this.insuranceId = insuranceId;
		this.insuranceName = insuranceName;
		this.insuranceType = insuranceType;
	}

	public Insurance() {
	}

	public Integer getInsuranceId() {
		return insuranceId;
	}

	public void setInsuranceId(Integer insuranceId) {
		this.insuranceId = insuranceId;
	}

	public String getInsuranceName() {
		return insuranceName;
	}

	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public String getInsuranceType() {
		return insuranceType;
	}

	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}

	@Override
	public String toString() {
		return "Insurance [insuranceId=" + insuranceId + ", insuranceName=" + insuranceName + ", insuranceType="
				+ insuranceType + "]";
	}

	
	

}
