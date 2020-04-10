package com.valhalla.alissa.repositories;

import org.springframework.data.repository.CrudRepository;

import com.valhalla.alissa.entities.Transaction;

public interface TransactionRepository extends CrudRepository<Transaction, Integer> {
}
