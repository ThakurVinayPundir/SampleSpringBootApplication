package com.rest.RestControllerExample.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rest.RestControllerExample.dao.BookRepository;
import com.rest.RestControllerExample.model.Book;

@Component
public class BookService {

	
	@Autowired
	private BookRepository bs;
	
	public List<Book> getAllBooks(){
		return (List)this.bs.findAll();
	}
	public Book getBookById(int id) {
		
		Book book=null;
		book=(Book)this.bs.findById(id);
		return book;
		
	}
	
	public void createBook(Book book) {
		this.bs.save(book);
	}
	public void deleteBook(int id) {
		Book book=null;
		this.bs.deleteById(id);
	}
	public Book updateBook(int id,Book book) {
		book.setId(id);
		return this.bs.save(book);
	}
}
