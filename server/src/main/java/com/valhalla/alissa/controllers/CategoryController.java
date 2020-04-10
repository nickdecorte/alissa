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
import com.valhalla.alissa.repositories.CategoryRepository;

@RestController
@RequestMapping("api/categories")
public class CategoryController {

    private CategoryRepository repository;

    public CategoryController(CategoryRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Iterable<Category> findAll() {
        return this.repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Category> findById(@PathVariable Integer id) {
        return this.repository.findById(id);
    }

    @PostMapping
    public Category create(@RequestBody Category category) {
        return this.repository.save(category);
    }

    @PutMapping
    public Category update(@RequestBody Category category) {
        return this.repository.save(category);
    }

}
