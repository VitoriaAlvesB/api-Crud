package com.educandoweb.curso.resources;

import java.util.List;

import com.educandoweb.curso.entities.Product;
import com.educandoweb.curso.services.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
  
  @Autowired
  private ProductService service;

  @GetMapping
  public ResponseEntity<List<Product>> findAll(){
    List<Product> list = service.findAll();
    return ResponseEntity.ok().body(list);
  }
  
  @GetMapping("/{id}")
  public ResponseEntity<Product> findById(@PathVariable Long id){
    Product obj = service.findById(id);
    return ResponseEntity.ok().body(obj);
  }



}
