package com.project.codetest.libraryManagement.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class book_iss_order {
	@Id
	int order_id;
	double total_amount;
	String orderStatus;
	

}
