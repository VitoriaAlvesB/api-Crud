package com.educandoweb.curso.resources;

import java.util.List;

import com.educandoweb.curso.entities.User;
import com.educandoweb.curso.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/users")
public class UserResource {

  @Autowired
  private UserService service;
  
  @GetMapping
  public ResponseEntity<List<User>> findAll() {
    List<User> list = service.findAll();
    return ResponseEntity.ok().body(list);
  }

  @GetMapping("/{id}")
  public ResponseEntity<User> findById(@PathVariable Long id){
    User obj = service.findById(id);
    return ResponseEntity.ok().body(obj);
  }
}
