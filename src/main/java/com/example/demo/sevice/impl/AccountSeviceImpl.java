package com.example.demo.sevice.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fis.fresher.java.jpa.entity.Account;
import fis.fresher.java.jpa.repository.Accountrepository;
import fis.fresher.java.jpa.sevice.Accountsevice;

@Service
public class AccountSeviceImpl implements Accountsevice {
 @Autowired
 private Accountrepository repository;
	@Override
	public Account save(Account account) {
		
		return repository.save(account);
	}

	@Override
	public Account update(Account account) {
		
		return repository.save(account);
	}

	@Override
	public void deleteById(Long id) {
	 repository.deleteById(id);
		
	}

	@Override
	public Account getById(Long id) {
	
		return repository.getById(id);
	}
	 
	

}