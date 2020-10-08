package com.rest.RestControllerExample.dao;

import org.springframework.data.repository.CrudRepository;

import com.rest.RestControllerExample.model.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {
	public Book findById(int id);
}
