package com.cnetra.subscriptions.accounts;

import com.cnetra.subscriptions.accounts.model.Account;
import com.cnetra.subscriptions.accounts.repository.AccountEntity;

public interface AccountsService {
    /**
     *  Create new Account
     * @param accountEntity
     * @return Account
     */
    AccountEntity createAccount(AccountEntity accountEntity);

    Account findAccountById(String id);

}
