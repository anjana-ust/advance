package com.ust.rest.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.rest.resource.Product;
import com.ust.rest.services.ProductService;

//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/product/api.2.0")
//@Api(value="Product Service API 2.0",description="Rest endpints for product api")
public class ProductResource {

	@Autowired
	ProductService service;
	

	@GetMapping

	@RequestMapping("/retrieve/{productId}")
	//@ApiOperation(value="Fetch product id and Returns the Product entity")

	public Product fetchProduct(@PathVariable long productId) {
		return service.getProduct(productId);
	}

	
	  @GetMapping
	  
	  @RequestMapping("/retrieve/all") 
	  //@ApiOperation(value="Retrive all  Product")
	  public List<Product> fetchproduct() {
	  return service.getProducts(); }
	 

	@PostMapping
	@RequestMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	//@ApiOperation(value="Add Product")

	public ResponseEntity<?> addProduct(@RequestBody Product product) {
		boolean result = service.add(product);
		if (result) {
			return ResponseEntity.status(HttpStatus.CREATED).body(true);
		} else {
			return ResponseEntity.status(HttpStatus.CREATED).body(false);
		}
	}

	
	 @PutMapping
	 
	 @RequestMapping(value="/update",consumes= MediaType.APPLICATION_JSON_VALUE,
	  produces= MediaType.APPLICATION_JSON_VALUE)
	 
	 //@ApiOperation(value="update Product")
	 public Product updateProduct(@RequestBody Product product) { return
	 service.updateProduct(product); }
	
	  @DeleteMapping
	  
	  @RequestMapping(value="/delete/{productId}") 
	  //@ApiOperation(value="Delete Product")
	  public void deleteProduct(@PathVariable long productId) {
	  service.deleteProduct(productId); }
	 
	 
}
