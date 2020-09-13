package com.cnetra.subscriptions.accounts;

import com.cnetra.subscriptions.accounts.model.Account;
import com.cnetra.subscriptions.accounts.repository.AccountEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface AccountsService {
    /**
     *  Create new Account
     * @param accountEntity
     * @return Account
     */
    AccountEntity createAccount(AccountEntity accountEntity);

    AccountEntity findAccountById(String id);

    Iterable<AccountEntity> findAll();

}
