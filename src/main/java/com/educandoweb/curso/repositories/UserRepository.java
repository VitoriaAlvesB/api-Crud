package com.educandoweb.curso.repositories;

import com.educandoweb.curso.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
  
}
