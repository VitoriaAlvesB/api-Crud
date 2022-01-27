package com.educandoweb.curso.services;

import java.util.*;

import com.educandoweb.curso.entities.Product;
import com.educandoweb.curso.repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
  
  @Autowired
  private ProductRepository repository;

  public List<Product> findAll() {
		return repository.findAll();
	}

  public Product findById(Long id) {
    Optional<Product> obj = repository.findById(id);
    return obj.get();
  }
}
