package com.example.feign.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.feign.iface.feigniface;
import com.example.feign.model.Book;
@RestController
@RequestMapping("/feign")
public class FeignController {
	@Autowired
	 private feigniface feignclient;
	 
	 																																									//http://localhost:7082/client/allProducts
	 @GetMapping("/allProducts")
	 public List<Book> getAll() {
		 
		  return feignclient.getProducts();
	 }
	 
	 @GetMapping("/products-by-id/{id}")
		public Book getProductById(@PathVariable ("id") int id) {
		   System.out.println(id);
		   return feignclient.getProductsById(id);
	 }
	 		

}
