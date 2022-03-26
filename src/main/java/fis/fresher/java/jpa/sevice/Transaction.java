package fis.fresher.java.jpa.sevice;

import fis.fresher.java.jpa.entity.Account;

public interface Transaction {

   Transaction save(Transaction account);

   Transaction update(Transaction account);

	void deleteById(Long id);

	Transaction getById(Long id);
	
	Transaction chuyenTien(Transaction fromAccount,Transaction toAccount,Integer amount);
	

}
