package com.hcl.bank.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.bank.dto.BenificiaryDto;
import com.hcl.bank.entity.Account;
import com.hcl.bank.entity.Benificiary;
import com.hcl.bank.entity.Customer;
import com.hcl.bank.exception.UserNotFoundExcption;
import com.hcl.bank.repository.AccountRepository;
import com.hcl.bank.repository.BenificiaryRepository;
import com.hcl.bank.repository.CustomerRepository;

@Service
public class BenificiaryService {

	@Autowired
	private BenificiaryRepository benificiaryRepository;


	@Autowired
	private AccountRepository accontRepository;

	@Transactional
	public String addBenificiary(BenificiaryDto benificiaryDto) throws UserNotFoundExcption {
		Benificiary benificiary = new Benificiary();

		BeanUtils.copyProperties(benificiaryDto, benificiary);

		Optional<Account> account = accontRepository.findByAccountNumber(benificiaryDto.getAccountNumber());

		if (!account.isPresent()) {
			throw new UserNotFoundExcption("User not found exception");
		}
		benificiaryRepository.save(benificiary);

		return "created successfully";
	}

}
