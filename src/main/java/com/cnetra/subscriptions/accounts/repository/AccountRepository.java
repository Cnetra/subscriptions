package com.cnetra.subscriptions.accounts.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface AccountRepository extends CrudRepository<AccountEntity, Integer> {
    List<AccountEntity> findByCompanyName(String companyName);
    AccountEntity findById(int id);
}
