package com.valhalla.alissa.controllers;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.valhalla.alissa.entities.Transaction;
import com.valhalla.alissa.repositories.TransactionRepository;

@RestController
@RequestMapping("api/transactions")
public class TransactionController {

    private TransactionRepository repository;

    public TransactionController(TransactionRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Iterable<Transaction> findAll() {
        return this.repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Transaction> findById(@PathVariable Integer id) {
        return this.repository.findById(id);
    }

    @PostMapping
    public Transaction create(@RequestBody Transaction transaction) {
        return this.repository.save(transaction);
    }

    @PutMapping
    public Transaction update(@RequestBody Transaction transaction) {
        return this.repository.save(transaction);
    }

}
