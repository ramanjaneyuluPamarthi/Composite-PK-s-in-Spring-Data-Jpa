package com.nit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nit.entity.Account;
import com.nit.entity.AccountPks;

@Repository
public interface AccountsRepo extends JpaRepository<Account, AccountPks>
{

}
