package com.educandoweb.curso.resources;

import java.util.List;

import com.educandoweb.curso.entities.Category;
import com.educandoweb.curso.services.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
  
  @Autowired
  private CategoryService service;

  @GetMapping
  public ResponseEntity<List<Category>> findAll(){
    List<Category> list = service.findAll();
    return ResponseEntity.ok().body(list);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Category> findById(@PathVariable Long id){
    Category obj = service.findById(id);
    return ResponseEntity.ok().body(obj);
  }
}
