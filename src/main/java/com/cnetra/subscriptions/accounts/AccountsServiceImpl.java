package com.cnetra.subscriptions.accounts;

import com.cnetra.subscriptions.accounts.model.Account;
import com.cnetra.subscriptions.accounts.repository.AccountEntity;
import com.cnetra.subscriptions.accounts.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Scheduler;

@Service
@Slf4j
@RequiredArgsConstructor
public class AccountsServiceImpl implements AccountsService {

    @Autowired
    private TransactionTemplate transactionTemplate;

    @Autowired
    @Qualifier("jdbcScheduler")
    private Scheduler jdbcScheduler;

    @Autowired
    private final AccountRepository accountRepository;

    /**
     * (@inheritDoc)
     * @param accountEntity
     * @return
     */

    public Mono<AccountEntity> createAccount(final AccountEntity accountEntity) {
        log.info("Creating Account : {}", accountEntity);
        return Mono.fromCallable(() -> transactionTemplate.execute(status -> {
            return accountRepository.save(accountEntity);
        })).subscribeOn(jdbcScheduler);
    }

    /**
     *
     * @param id String
     * @return
     */
    public Mono<AccountEntity> findAccountById(final String id){
        log.info("Fetch account for : {}", id);

        Mono<AccountEntity> accountEntityMono = Mono
                .defer(() -> Mono.just(accountRepository.findById(Integer.parseInt((id)))))
                .subscribeOn(jdbcScheduler);

        return accountEntityMono;
    }

    /**
     *
     * @return list of accounts
     */
    public Flux<AccountEntity> findAll(){
        Flux<AccountEntity> defer = Flux.defer(() -> Flux.fromIterable(accountRepository.findAll()));
        return defer.subscribeOn(jdbcScheduler);
    }

}
