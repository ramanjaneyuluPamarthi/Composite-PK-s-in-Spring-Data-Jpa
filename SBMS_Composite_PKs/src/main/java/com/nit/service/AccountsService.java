package com.nit.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Account;
import com.nit.entity.AccountPks;
import com.nit.repositories.AccountsRepo;

@Service
public class AccountsService {

	@Autowired
	private AccountsRepo accountsRepo;
	
	public void saveDetails() {

		/*
		 * AccountPks pks = new AccountPks(); pks.setAccId(1);
		 * pks.setAccType("Savings"); pks.setAccNumber(231345543345L);
		 * 
		 * Account account = new Account(); account.setAccHolderName("Rama");
		 * account.setBranch("Vijayawada"); account.setAccountPks(pks); Account save =
		 * accountsRepo.save(account); System.out.println(save);
		 */
		 
		
		
		AccountPks Pk = new AccountPks();
		Pk.setAccId(1);
		Pk.setAccNumber(231345543345L);
		Pk.setAccType("Savings");
		
		Optional<Account> byId = accountsRepo.findById(Pk);
		if(byId.isPresent()) {
			System.out.println(byId.get());
		}
		else {
		System.out.println("Record Not Found...");
		}
	}
}
