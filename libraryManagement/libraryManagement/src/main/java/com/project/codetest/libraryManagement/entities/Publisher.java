package com.project.codetest.libraryManagement.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Publisher {
	@Id
	int publisher_id;
	String publisher_name;
	

}
