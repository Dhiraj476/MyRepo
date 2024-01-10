package com.project.codetest.libraryManagement.service;

import java.util.List;

import com.project.codetest.libraryManagement.entities.Book;





public interface BookService {
	
	Book create(Book hotel);
	
	
	
	//getall
	
	List<Book> getAll();
	
	//get single
	Book get(  int book_Id);



	Book update(Book book);
	
	String DeleteBook(int book_Id);



	

}
