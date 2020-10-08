package com.rest.RestControllerExample.comtroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.RestControllerExample.Service.BookService;
import com.rest.RestControllerExample.model.Book;

@RestController
public class Controller {
	
	@Autowired
	private BookService bs;
	
	@GetMapping("/books")
	public List<Book> getBooks() {
		return this.bs.getAllBooks();
	}
	
	
	@GetMapping("/books/{id}")
	public Book getBooksById(@PathVariable("id") int id) {
		return this.bs.getBookById(id);
	}
	
	
	
	@PostMapping("/books")
	public Book createBook(@RequestBody Book book) {
		this.bs.createBook(book);
		return book;
	}
	
	
	@DeleteMapping("/books/{id}")
	public void deleteBook(@PathVariable("id") int id) {
		this.bs.deleteBook(id);
	}
	
	
	@PutMapping("/books/{id}")
	public Book updateBook(@RequestBody Book book ,@PathVariable("id") int id) {
		return this.bs.updateBook(id,book);
	}
}
