package com.cnetra.subscriptions.api;

import com.cnetra.subscriptions.accounts.AccountsService;
import com.cnetra.subscriptions.accounts.repository.AccountEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
@RequiredArgsConstructor
public class AccountsController {
    private final AccountsService accountsService;

    @GetMapping("/{id}")
    private AccountEntity getAccountById(@PathVariable String id) {
        return accountsService.findAccountById(id);
    }

    @PostMapping("/account")
    AccountEntity create(@RequestBody AccountEntity accountEntity) {
        return accountsService.createAccount(accountEntity);
    }

    @GetMapping("/all")
    Iterable<AccountEntity> findAll() {
        return accountsService.findAll();
    }

}
