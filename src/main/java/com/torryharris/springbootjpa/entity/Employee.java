package com.torryharris.springbootjpa.entity;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {	
	@Id
	private Integer employeeId;
	private String employeeName;
	private String designation;
	private Integer salary;
	private Double experienceInYears;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "insuranceId")
	private Insurance insurance;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name = "employeeId")
	private List<BankAccount> bankAccounts;
	private int sumAssured;
	
		
	public Employee() {
	}


	public Employee(Integer employeeId, String employeeName, String designation, Integer salary,
			Double experienceInYears, Insurance insurance, List<BankAccount> bankAccounts, int sumAssured) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.designation = designation;
		this.salary = salary;
		this.experienceInYears = experienceInYears;
		this.insurance = insurance;
		this.bankAccounts = bankAccounts;
		this.sumAssured = sumAssured;
	}



	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Double getExperienceInYears() {
		return experienceInYears;
	}

	public void setExperienceInYears(Double experienceInYears) {
		this.experienceInYears = experienceInYears;
	}

	public Insurance getInsurance() {
		return insurance;
	}

	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}

	public List<BankAccount> getBankAccounts() {
		return bankAccounts;
	}

	public void setBankAccounts(List<BankAccount> bankAccounts) {
		this.bankAccounts = bankAccounts;
	}

	public int getSumAssured() {
		return sumAssured;
	}

	public void setSumAssured(int sumAssured) {
		this.sumAssured = sumAssured;
	}



	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", designation=" + designation
				+ ", salary=" + salary + ", experienceInYears=" + experienceInYears + ", insurance=" + insurance
				+ ", bankAccounts=" + bankAccounts + ", sumAssured=" + sumAssured + "]";
	}

	
	
	
	
}
