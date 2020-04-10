package com.valhalla.alissa.controllers;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.valhalla.alissa.entities.Account;
import com.valhalla.alissa.repositories.AccountRepository;

@RestController
@RequestMapping("api/accounts")
public class AccountController {

    private AccountRepository repository;

    public AccountController(AccountRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Iterable<Account> findAll() {
        return this.repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Account> findById(@PathVariable Integer id) {
        return this.repository.findById(id);
    }

    @PostMapping
    public Account create(@RequestBody Account account) {
        return this.repository.save(account);
    }

    @PutMapping
    public Account update(@RequestBody Account account) {
        return this.repository.save(account);
    }

}
