package com.sbs.example.demo.dto;

import com.sbs.example.demo.util.Util;

// DTO
//abstract class Dto {
public abstract class Dto {
	private int id;
	private String regDate;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

//	Dto() {
	public Dto() {
		this(0);
	}

//	Dto(int id) {
	public Dto(int id) {
		this(id, Util.getNowDateStr());
	}

//	Dto(int id, String regDate) {
	public Dto(int id, String regDate) {
		this.id = id;
		this.regDate = regDate;
	}
}