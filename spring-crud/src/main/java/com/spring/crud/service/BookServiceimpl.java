package com.spring.crud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.crud.entity.Book;
import com.spring.crud.repository.BookRepository;

@Service
public class BookServiceimpl implements BookService{

	@Autowired
	private BookRepository bookrepository;

	@Override
	public List<Book> getallBook() {
		// TODO Auto-generated method stub
		return bookrepository.findAll();
	}

	@Override
	public Book getbook(Integer id) {
		// TODO Auto-generated method stub
		return bookrepository.findById(id);
	}

	@Override
	public void saveorUpdate(Book book) {
		// TODO Auto-generated method stub
		bookrepository.save(new Book());
	}

	@Override
	public void delete(Long id) {
		bookrepository.deleteById(id);
		
	}


	

	
	
}
