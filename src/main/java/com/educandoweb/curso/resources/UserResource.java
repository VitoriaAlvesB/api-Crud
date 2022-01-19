package com.educandoweb.curso.resources;

import com.educandoweb.curso.entities.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/users")
public class UserResource {
  
  @GetMapping
  public ResponseEntity<User> findAll() {
    User u = new User(1L, "julio", "julio@gmail.com", "12324567", "fsdkfsdkfldssd");
    return ResponseEntity.ok().body(u);
  }
}
