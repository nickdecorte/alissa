package com.valhalla.alissa.controllers;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.valhalla.alissa.entities.Category;
import com.valhalla.alissa.entities.Party;
import com.valhalla.alissa.repositories.CategoryRepository;
import com.valhalla.alissa.repositories.PartyRepository;

@RestController
@RequestMapping("api/parties")
public class PartyController {

    private PartyRepository repository;

    public PartyController(PartyRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Iterable<Party> findAll() {
        return this.repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Party> findById(@PathVariable Integer id) {
        return this.repository.findById(id);
    }

    @PostMapping
    public Party create(@RequestBody Party party) {
        return this.repository.save(party);
    }

    @PutMapping
    public Party update(@RequestBody Party party) {
        return this.repository.save(party);
    }

}
