package com.otz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.otz.entity.Book;
import com.otz.entity.Employee;
import com.otz.service.BookService;

@RestController
@RequestMapping("book-api")
public class BookController {
	@Autowired
	private BookService service;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveBook(@RequestBody Book book){
	String msg=service.saveBook(book);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	@GetMapping("/getAllBook")
	public ResponseEntity<List<Book>> getAllBook(){
	List<Book> listBook	=service.getAllBook();
		return new ResponseEntity<List<Book>>(listBook,HttpStatus.OK);
	}
	@DeleteMapping("/delete/{bookId}")
	public ResponseEntity<String> delete(@PathVariable Integer bookId){
		String msg=service.deleteBook(bookId);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	@GetMapping("/edit/{bookId}")
	public ResponseEntity<Book> getEmpById(@PathVariable Integer bookId){
		Book book=service.getBookById(bookId);
		return new ResponseEntity<Book>(book,HttpStatus.OK);
	}
	@PutMapping("/update")
	public ResponseEntity<String> UpdateBook(@RequestBody Book book){
		String msg=service.saveBook(book);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
}
