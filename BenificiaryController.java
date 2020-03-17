package com.hcl.bank.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.bank.dto.BenificiaryDto;
import com.hcl.bank.exception.UserNotFoundExcption;
import com.hcl.bank.service.BenificiaryService;

@RestController
@RequestMapping("/Benificiaries")
public class BenificiaryController {
	
	
	private Logger logger = LoggerFactory.getLogger(BenificiaryController.class);

	@Autowired
	private BenificiaryService benificiaryService;

	@PostMapping("")
	public ResponseEntity<String> addBenificiary(@RequestBody(required = true) BenificiaryDto benificiaryDto) throws UserNotFoundExcption {

		
		logger.info(" adding benificiary ");
		
		String customerLogin = benificiaryService.addBenificiary(benificiaryDto);

		return new ResponseEntity<String>(customerLogin, HttpStatus.OK);
	}

}
