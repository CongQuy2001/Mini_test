package fis.fresher.java.jpa.sevice;

import java.util.List;

import fis.fresher.java.jpa.entity.Account;

public interface IAccountService {

	void create(Account account);

	Account update(Account account);

	void delete(Long id);

	List<Account> getAllAccounts();
	Account getAccountByID(Long id);
	

}
