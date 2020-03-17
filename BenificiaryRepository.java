package com.hcl.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.bank.entity.Benificiary;

public interface BenificiaryRepository extends JpaRepository<Benificiary,Long> {

}
