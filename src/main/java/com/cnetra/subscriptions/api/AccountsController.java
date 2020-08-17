package com.cnetra.subscriptions.api;

import com.cnetra.subscriptions.accounts.AccountsService;
import com.cnetra.subscriptions.accounts.repository.AccountEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.BodyInserters.fromValue;

@RestController
@RequestMapping("/accounts")
@RequiredArgsConstructor
public class AccountsController {
    private final AccountsService accountsService;

    @GetMapping("/{id}")
    private Mono<ServerResponse> getAccountById(@PathVariable String id) {
        return ServerResponse.ok().contentType(APPLICATION_JSON).body(fromValue(accountsService.findAccountById(id)));
    }


    @PostMapping("/account")
    Mono<ServerResponse> create(@RequestBody AccountEntity accountEntity) {
        return ServerResponse.ok().contentType(APPLICATION_JSON).body(fromValue(accountsService.createAccount(accountEntity)));
    }
}
