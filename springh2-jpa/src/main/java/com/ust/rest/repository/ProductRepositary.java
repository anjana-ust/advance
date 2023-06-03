package com.ust.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.rest.resource.Product;

@Repository
public interface ProductRepositary  extends JpaRepository<Product,Long>{

}
