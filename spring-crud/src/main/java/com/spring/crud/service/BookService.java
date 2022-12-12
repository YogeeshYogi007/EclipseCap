package com.spring.crud.service;

import java.util.List;

import com.spring.crud.entity.Book;

public interface BookService {

	public List<Book> getallBook();

	public Book getbook(Integer id);

	public void saveorUpdate(Book book);

	public void delete(Long id);

}
