package com.valhalla.alissa.repositories;

import org.springframework.data.repository.CrudRepository;

import com.valhalla.alissa.entities.Category;

public interface CategoryRepository extends CrudRepository<Category, Integer> {
}
