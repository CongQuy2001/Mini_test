package com.example.demo.sevice.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fis.fresher.java.jpa.entity.Account;
import fis.fresher.java.jpa.repository.Accountrepository;
import fis.fresher.java.jpa.repository.Transactionrepository;
import fis.fresher.java.jpa.sevice.Transaction;
import lombok.AllArgsConstructor;

@Service
public class TransactionImpl implements Transaction {
	@Autowired
	private Transactionrepository repository;

	@Override
	public Transaction save(Transaction account) {
		// TODO Auto-generated method stub
		return repository.save(null);
	}

	@Override
	public Transaction update(Transaction account) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Transaction getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Transaction chuyenTien(Transaction fromAccount, Transaction toAccount, Integer amount) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
