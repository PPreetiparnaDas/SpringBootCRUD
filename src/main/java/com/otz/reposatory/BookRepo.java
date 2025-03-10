package com.otz.reposatory;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.otz.entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer>{
	public Optional<Book> findByBookId(Integer bookId);
}
