package com.example.feign.iface;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.feign.model.Book;

@FeignClient(value="feignclient",url="http://localhost:9095/app")
public interface feigniface {
	@RequestMapping(method=RequestMethod.GET, value="/fetchall")
	public List<Book> getProducts();
	
	
	  @RequestMapping(method= RequestMethod.GET, value= "/book-by-id/{id}", produces="application/json") 
	  public Book getProductsById(@PathVariable ("id") int id);
	  
	  

}

