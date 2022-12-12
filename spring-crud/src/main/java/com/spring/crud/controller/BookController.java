package com.spring.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.crud.entity.Book;
import com.spring.crud.service.BookService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/book")
public class BookController {
	
		@Autowired
		BookService bookservice;
		//To get List of all books
		@GetMapping(value= "/list")
		public List<Book> listofallBook(){
			return bookservice.getallBook() ;
		}
		
		@GetMapping(value= "/listone/{id}")
		public Book getbook(@PathVariable("id") Integer id) {
			return bookservice.getbook(id);
		}
		
		@PostMapping("/add")
		public void savebook(@RequestBody Book book) {
		 bookservice.saveorUpdate(book);
		}
		
		@DeleteMapping("/delete/{id}")
		public void deletebook(@PathVariable("id") Long id) {
			bookservice.delete(id);
		}
}
