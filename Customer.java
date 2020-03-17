package com.hcl.bank.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id")
	private Long customerId;

	@Column(name = "customer_name")
	private String customerName;

	@Column(name = "customer_email")
	private String customerEmailId;

	@Column(name = "customer_mobileNumber")
	private Long customerMobileNumber;

	@Column(name = "date_of_birth")
	private Date dateOfBirth;

	@Column(name = "customer_address")
	private String customerAddress;

	@Column(name = "password")
	private String password;

	@Column(name = "is_logged_in")
	private Boolean isLoggedIn;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_id")
	private List<Account> customerAccounts;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_id")
	private List<Benificiary> Benificiaries;
	
	
	

	public List<Benificiary> getBenificiaries() {
		return Benificiaries;
	}

	public void setBenificiaries(List<Benificiary> benificiaries) {
		Benificiaries = benificiaries;
	}

	public String getCustomerEmailId() {
		return customerEmailId;
	}

	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}

	

	public List<Account> getCustomerAccounts() {
		return customerAccounts;
	}

	public void setCustomerAccounts(List<Account> customerAccounts) {
		this.customerAccounts = customerAccounts;
	}

	public String getUstomerEmailId() {
		return customerEmailId;
	}

	public void setUstomerEmailId(String ustomerEmailId) {
		this.customerEmailId = ustomerEmailId;
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

	public Boolean getIsLoggedIn() {
		return isLoggedIn;
	}

	public void setIsLoggedIn(Boolean isLoggedIn) {
		this.isLoggedIn = isLoggedIn;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

}
