package com.cnetra.subscriptions.accounts;

import com.cnetra.subscriptions.accounts.model.Account;
import com.cnetra.subscriptions.accounts.repository.AccountEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AccountsService {
    /**
     *  Create new Account
     * @param accountEntity
     * @return Account
     */
    Mono<AccountEntity> createAccount(AccountEntity accountEntity);

    Mono<AccountEntity> findAccountById(String id);

    Flux<AccountEntity> findAll();

}
