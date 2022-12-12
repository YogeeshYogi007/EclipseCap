package com.spring.crud.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.crud.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

	public Book findById(Integer id);

}
