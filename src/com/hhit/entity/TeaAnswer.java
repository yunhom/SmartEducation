package com.hhit.entity;

import java.sql.Timestamp;
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : TeaAnswer.java
//  @ Date : 2016/5/12
//  @ Author : 
//
//




public class TeaAnswer {
	private Integer id;
	private String teaNum;
	private String content;
	private Timestamp addTime;
	
	
	private StuQuestion stuQuestion;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTeaNum() {
		return teaNum;
	}
	public void setTeaNum(String teaNum) {
		this.teaNum = teaNum;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getAddTime() {
		return addTime;
	}
	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}
	public StuQuestion getStuQuestion() {
		return stuQuestion;
	}
	public void setStuQuestion(StuQuestion stuQuestion) {
		this.stuQuestion = stuQuestion;
	}
	
	
}
