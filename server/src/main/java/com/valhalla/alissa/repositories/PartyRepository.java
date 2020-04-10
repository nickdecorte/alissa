package com.valhalla.alissa.repositories;

import org.springframework.data.repository.CrudRepository;

import com.valhalla.alissa.entities.Party;

public interface PartyRepository extends CrudRepository<Party, Integer> {
}
