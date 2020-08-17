package com.cnetra.subscriptions.accounts;

import com.cnetra.subscriptions.accounts.repository.Account;

public interface AccountsService {
    /**
     *  Create new Account
     * @param accountType
     * @param account
     * @return Account
     */
    Account createAccount(String accountType, Account account);

}
