package com.project.codetest.libraryManagement.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Member {
	@Id
	int member_id;
	String name;
	Date memberShip_date;
	String Username;
	String Password;
	

}
