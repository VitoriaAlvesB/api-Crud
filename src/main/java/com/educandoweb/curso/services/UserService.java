package com.educandoweb.curso.services;

import java.util.List;
import java.util.Optional;

import com.educandoweb.curso.entities.User;
import com.educandoweb.curso.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired
  private UserRepository repository;
  
  public List<User> findAll() {
		return repository.findAll();
	}

  public User findById(Long id) {
    Optional<User> obj = repository.findById(id);
    return obj.get();
  }
}
