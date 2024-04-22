package com.torryharris.springbootjpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BankAccount {

	@Id
	private Integer accountNumber;
	private String bankName;
	private String ifscCode;
		
	public BankAccount() {
	}

	public BankAccount(Integer accountNumber, String bankName, String ifscCode) {
		this.accountNumber = accountNumber;
		this.bankName = bankName;
		this.ifscCode = ifscCode;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", bankName=" + bankName + ", ifscCode=" + ifscCode
				+ "]";
	}			
	
}
