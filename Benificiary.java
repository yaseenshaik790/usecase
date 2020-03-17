package com.hcl.bank.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "benificiary")
public class Benificiary {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "benificiary_id")
	private Long benificiaryId;

	@Column(name = "account_number")
	private Long accountNumber;

	@Column(name = "Benificiary_name")
	private String BenificiaryName;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Customer customerId;
	
	

	public Customer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}

	public Long getBenificiaryId() {
		return benificiaryId;
	}

	public void setBenificiaryId(Long benificiaryId) {
		this.benificiaryId = benificiaryId;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getBenificiaryName() {
		return BenificiaryName;
	}

	public void setBenificiaryName(String benificiaryName) {
		BenificiaryName = benificiaryName;
	}

	

}
