package com.hcl.bank.dto;

import java.util.Date;


public class CustomerDto {

	private String customerName;

	private String customerEmailId;

	private Long customerMobileNumber;

	private Date dateOfBirth;

	private String customerAddress;

	private String password;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmailId() {
		return customerEmailId;
	}

	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}

	public Long getCustomerMobileNumber() {
		return customerMobileNumber;
	}

	public void setCustomerMobileNumber(Long customerMobileNumber) {
		this.customerMobileNumber = customerMobileNumber;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
