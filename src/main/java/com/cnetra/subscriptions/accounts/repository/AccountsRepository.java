package com.cnetra.subscriptions.accounts.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface AccountsRepository extends CrudRepository<Account, Integer> {
    List<Account> findByCompanyName(String companyName);
    Account findById(int id);
}
