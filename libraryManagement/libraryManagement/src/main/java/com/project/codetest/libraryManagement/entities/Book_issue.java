package com.project.codetest.libraryManagement.entities;

import java.util.Date;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity


@NoArgsConstructor

public class Book_issue {
	@Id
	int book_issue_id;
	
	int member_id;
	Date issue_date;
	Date return_date;
	Date date_returned;
	double borrow_amount;
	double late_return_fee_amount;
	int order_id;
	
	
	
	@ManyToOne(cascade= CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="bookId",referencedColumnName="book_Id")
	private Book book;
	
	

}
