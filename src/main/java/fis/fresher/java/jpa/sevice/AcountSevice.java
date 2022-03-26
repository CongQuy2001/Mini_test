package fis.fresher.java.jpa.sevice;

import java.util.List;

import org.springframework.stereotype.Service;

import fis.fresher.java.jpa.entity.Account;
import fis.fresher.java.jpa.repository.Accountrepository;
@Service
public class AcountSevice implements IAccountService {
private Accountrepository iacountsevice;
	@Override
	public List<Account> getAllAccounts() {
		// TODO Auto-generated method stub
		return iacountsevice.findAll();
	}

	@Override
	public void create(Account account) {
		// TODO Auto-generated method stub
		iacountsevice.save(account);
	}
	@Override
	public Account getAccountByID(Long id) {

		return iacountsevice.findById(id).get();
	}
	@Override
	public Account update(Account account) {
		// TODO Auto-generated method stub
		return iacountsevice.save(account);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		iacountsevice.deleteById(id);
		
	}



}
