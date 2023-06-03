package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Book1;

@Repository
public interface Repo extends JpaRepository<Book1,Integer> {
	

}
