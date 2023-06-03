package com.ust.rest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ust.rest.repository.ProductRepositary;

import com.ust.rest.resource.Product;
@Service
public class ProductService {
   @Autowired
	ProductRepositary repository;
	
	
	  public Product getProduct(long productId) {
	  
	  
	  Optional<Product> optional = repository.findById(productId);
	  
	 if(optional.isPresent()) {
		 return optional.get();
	 }
	 else
		 return null;
	  } 

		
		
		/*
		 * public ArrayList<Product> getProducts(){ return repository.getProduct(); }
		 */
		 
	  public List<Product> getProducts(){
		  return repository.findAll();
	  }
	 public boolean add(Product product) {
		  
		 repository.save(product);
		  return true;
	 }


  public Product updateProduct(Product product) { 
	 
	  return repository.save(product); } 

 public void deleteProduct(long
  productId) { 
	 repository.deleteById(productId); 
	 } 
/*@Transactional(propagation = Propagation.REQUIRES_NEW)
 public boolean addUser() {

	User user= new User();
	user.setUserId(5L);
	user.setDateTime(System.currentTimeMillis()+"88998");
	try {
	User userT=userRepository.save(user);}
	catch(Exception e) {
		System.out.println(e);
	}
	return true;*/

}
 