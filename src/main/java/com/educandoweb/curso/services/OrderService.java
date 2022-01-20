package com.educandoweb.curso.services;

import java.util.List;
import java.util.Optional;

import com.educandoweb.curso.entities.Order;
import com.educandoweb.curso.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

  @Autowired
  private UserRepository repository;
  
  public List<Order> findAll() {
		return repository.findAll();
	}

  public Order findById(Long id) {
    Optional<Order> obj = repository.findById(id);
    return obj.get();
  }
}
