package com.javapb.restfulwebservices.user;

import java.time.LocalDate;

public class User {

	private Integer id;
	private String name;
	private LocalDate bithDate;
	
	public User(Integer id, String name, LocalDate bithDate) {
		super();
		this.id = id;
		this.name = name;
		this.bithDate = bithDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBithDate() {
		return bithDate;
	}

	public void setBithDate(LocalDate bithDate) {
		this.bithDate = bithDate;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", bithDate=" + bithDate + "]";
	}
}
