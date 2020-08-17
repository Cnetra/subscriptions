package com.cnetra.subscriptions.accounts;

import com.cnetra.subscriptions.accounts.model.Account;
import com.cnetra.subscriptions.accounts.repository.AccountEntity;
import com.cnetra.subscriptions.accounts.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class AccountsServiceImpl implements AccountsService {

    private final AccountRepository accountRepository;

    /**
     * (@inheritDoc)
     * @param accountEntity
     * @return
     */

    public AccountEntity createAccount(final AccountEntity accountEntity) {
        log.info("Creating Account : {}", accountEntity);
        return accountRepository.save(accountEntity);
    }

    /**
     *
     * @param id
     * @return
     */
    public Account findAccountById(final String id){
        log.info("Fetch account for : {}", id);
        final AccountEntity accountEntity = accountRepository.findById(Integer.parseInt(id));

        return Account.builder()
                .accountId(accountEntity.getAccountId())
                .id(accountEntity.getId())
                .companyName(accountEntity.getCompanyName())
                .build();
    }

}
