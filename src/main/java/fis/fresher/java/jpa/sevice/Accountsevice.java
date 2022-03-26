package fis.fresher.java.jpa.sevice;

import fis.fresher.java.jpa.entity.Account;

public interface Accountsevice {
	Account save(Account account);
	Account update(Account account);
	void  deleteById(Long id);
	Account getById(Long accountId);
	 
}
