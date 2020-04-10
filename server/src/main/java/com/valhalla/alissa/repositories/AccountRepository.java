package com.valhalla.alissa.repositories;

import org.springframework.data.repository.CrudRepository;

import com.valhalla.alissa.entities.Account;

public interface AccountRepository extends CrudRepository<Account, Integer> {
}
