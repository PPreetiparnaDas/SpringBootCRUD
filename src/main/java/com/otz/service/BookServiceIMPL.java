package com.otz.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.otz.entity.Book;
import com.otz.reposatory.BookRepo;
@Service
public class BookServiceIMPL implements BookService {
	@Autowired
	private BookRepo repo;
	@Override
	public String saveBook(Book book) {
		int msg=repo.save(book).getBookId();
		if(msg>0) {
			return "Success";
		}else {
			return "Failed";
		}
	}
	@Override
	public List<Book> getAllBook() {
		return repo.findAll();
	}
	@Override
	public String deleteBook(Integer bookId) {
		Optional<Book> opt=repo.findById(bookId);
		if(opt.isPresent()) {
			repo.deleteById(bookId);
			return "success";
		}else {
			return "Filed";
		}
	}
	@Override
	public Book getBookById(Integer bookId) {
		Optional<Book> opt=repo.findById(bookId);
		if (opt.isPresent()) {
			return opt.get();
		}
		return null;
		
	}

}
