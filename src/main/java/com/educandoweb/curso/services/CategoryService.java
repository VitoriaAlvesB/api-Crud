package com.educandoweb.curso.services;


import java.util.*;

import com.educandoweb.curso.entities.Category;
import com.educandoweb.curso.repositories.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
  
  @Autowired
  private CategoryRepository repository;

  public List<Category> findAll() {
		return repository.findAll();
	}

  public Category findById(Long id) {
    Optional<Category> obj = repository.findById(id);
    return obj.get();
  }
}
