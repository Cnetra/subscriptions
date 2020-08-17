package com.cnetra.subscriptions.accounts;

import com.cnetra.subscriptions.accounts.repository.Account;
import com.cnetra.subscriptions.accounts.repository.AccountsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class AccountsServiceImpl implements AccountsService {

    private final AccountsRepository accountsRepository;

    /**
     * (@inheritDoc)
     * @param accountType
     * @param account
     * @return
     */

    public Account createAccount(final String accountType, final Account account) {
        log.info("Creating Account : {}",accountType);

        return accountsRepository.save(account);
    }
}
