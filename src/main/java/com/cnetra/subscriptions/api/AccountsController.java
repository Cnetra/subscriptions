package com.cnetra.subscriptions.api;

import com.cnetra.subscriptions.accounts.AccountsService;
import com.cnetra.subscriptions.accounts.repository.AccountEntity;
import com.cnetra.subscriptions.accounts.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.BodyInserters.fromValue;

@RestController
@RequestMapping("/accounts")
@RequiredArgsConstructor
public class AccountsController {
    private final AccountsService accountsService;
    private final AccountRepository accountRepository;

    @GetMapping("/{id}")
    private Mono<AccountEntity> getAccountById(@PathVariable String id) {
        return accountsService.findAccountById(id);
    }

    @PostMapping("/account")
    Mono<AccountEntity> create(@RequestBody AccountEntity accountEntity) {
        return accountsService.createAccount(accountEntity);
    }

    @GetMapping("/all")
    Flux<AccountEntity> findAll() {
        return accountsService.findAll();
    }

    @GetMapping("/list")
    @ResponseBody
    public Iterable<AccountEntity> list() {
        return accountRepository.findAll();
    }
}
