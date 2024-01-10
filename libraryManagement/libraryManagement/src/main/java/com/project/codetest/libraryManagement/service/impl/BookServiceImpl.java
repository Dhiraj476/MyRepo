package com.project.codetest.libraryManagement.service.impl;

import java.util.List;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.codetest.libraryManagement.entities.Book;
import com.project.codetest.libraryManagement.repository.BookRepositories;
import com.project.codetest.libraryManagement.service.BookService;




@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookRepositories bookRepository;

	
	public Book create(Book book) {
		// TODO Auto-generated method stub
		
		//int bookId = 1024;
	//	book.setBook_Id(bookId);
		return bookRepository.save(book);
	}
	
	
	public Book update(Book book) {
		// TODO Auto-generated method stub
		
		//int bookId = 1024;
	//	book.setBook_Id(bookId);
		return bookRepository.save(book);
	}

	
	public List<Book> getAll() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

	public Book get(int book_id) {
		// TODO Auto-generated method stub
		return bookRepository.findById(book_id).orElseThrow(()-> new  com.project.codetest.libraryManagement.exceptions.ResourceNotFoundException("hotel with given id not found"));
	}

	
	public String DeleteBook(int book_Id) {
		// TODO Auto-generated method stub
		 bookRepository.deleteById(book_Id);
		 return "book with given  book_id deleted";
		 
		
		
		
	}

}
