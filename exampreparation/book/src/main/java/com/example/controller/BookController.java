package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.model.Book1;
import com.example.repository.Repo;

@RestController
@RequestMapping("/app")
public class BookController {
	@Autowired
	Repo repo;
	
	@PostMapping("/create")
	public ResponseEntity<?> create(@RequestBody Book1 book){
		return  ResponseEntity.status(HttpStatus.CREATED).body(repo.save(book));
	}
	
	
	@GetMapping("/fetchall")
	public List<Book1> findAll(){
		
	return repo.findAll();
	}
	@GetMapping("/book-by-id/{id}")
	public Optional<Book1>  getProductsById(@PathVariable("id") int id) {
	return repo.findById(id);
	
	}
}
