package com.project.codetest.libraryManagement.entities;

import java.util.List;




import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="book")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {
	@Id
	@SequenceGenerator(name="book_sequence" , sequenceName="book_sequence",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,
	generator="book_sequence")

	int book_Id;
	@Column(name="book_title",nullable=false)
	String book_title;
	@Column(name="isbn",nullable=false)

	String isbn;
	@Column(name="publisher_id",nullable=false)
	int publisher_id;
	@Column(name="book_file_name",nullable=false)
	String book_file_name;
	@Column(name="borrow_duration",nullable=false)
	int borrow_duration;
	@Column(name="borrow_price",nullable=false)
	double borrow_price;
	
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="bookId",referencedColumnName="book_Id"
	)
	private List<Book_issue> issues;
	

}
