package com.hhit.entity;

import java.util.Set;
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : SpiderChapter.java
//  @ Date : 2016/4/18
//  @ Author : 
//
//




public class SpiderChapter {
	private Integer id;
	private String chapterNum;
	private String chapterName;
	private String url;
	private String courseName;
	private SpiderCourse spiderCourse;
	
	private SpiderChapter parent;
	private Set<SpiderChapter> children;
	
	/** 默认构造函数 */
	public SpiderChapter(){
		
	}
	/** 构造函数 */
	public SpiderChapter(String cha,String ch,String ur,String co,SpiderCourse sp,SpiderChapter sc){
		chapterNum=cha;
		chapterName=ch;
		url=ur;
		courseName=co;
		spiderCourse=sp;
		parent=sc;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getChapterName() {
		return chapterName;
	}
	public void setChapterName(String chapterName) {
		this.chapterName = chapterName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public SpiderCourse getSpiderCourse() {
		return spiderCourse;
	}
	public void setSpiderCourse(SpiderCourse spiderCourse) {
		this.spiderCourse = spiderCourse;
	}
	public String getChapterNum() {
		return chapterNum;
	}
	public void setChapterNum(String chapterNum) {
		this.chapterNum = chapterNum;
	}
	public SpiderChapter getParent() {
		return parent;
	}
	public void setParent(SpiderChapter parent) {
		this.parent = parent;
	}
	public Set<SpiderChapter> getChildren() {
		return children;
	}
	public void setChildren(Set<SpiderChapter> children) {
		this.children = children;
	}
	
}
