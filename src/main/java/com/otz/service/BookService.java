package com.otz.service;

import java.util.List;

import com.otz.entity.Book;

public interface BookService {
	public String saveBook(Book book);
	public List<Book> getAllBook();
	public String deleteBook(Integer bookId);
	public Book getBookById(Integer bookId);
	
}
