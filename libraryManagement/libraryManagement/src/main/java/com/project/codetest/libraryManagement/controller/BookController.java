package com.project.codetest.libraryManagement.controller;

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

import com.project.codetest.libraryManagement.entities.Book;
import com.project.codetest.libraryManagement.service.impl.BookServiceImpl;


@RestController
@RequestMapping("/books")
public class BookController {
	

	@Autowired
	private BookServiceImpl bookservice;
	//insert book
	@PostMapping
	public ResponseEntity<com.project.codetest.libraryManagement.entities.Book> createBook(@RequestBody Book book)
	{
	  return ResponseEntity.status(HttpStatus.CREATED).body(bookservice.create(book));
		
	}
	//update book  
		@PutMapping
		public ResponseEntity<Book> updateBook(@RequestBody Book book)
		{
		  return ResponseEntity.status(HttpStatus.CREATED).body(bookservice.update(book));
			
		}
	
	//get single
	@GetMapping("/{bookId}")
	public ResponseEntity<Book> createBook(@PathVariable int bookId)
	{
	  return ResponseEntity.status(HttpStatus.OK).body(bookservice.get(bookId));
		
	}
	
	//get single
		@DeleteMapping("delete/{bookId}")
		public ResponseEntity<String> deleteBook(@PathVariable int bookId)
		{
		  return ResponseEntity.status(HttpStatus.OK).body(bookservice.DeleteBook(bookId));
			
		}
	 
	
	//get all
	@GetMapping
	public ResponseEntity<List<Book>> getAll()
	{
		return ResponseEntity.ok(bookservice.getAll());
	}
	

}
