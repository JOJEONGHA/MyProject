package com.bookmanager.spring.EntityForm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Books {
	
	@Id
	@Column(name = "booknum")
	private Integer booknum;
	@Column(name = "title")
	private	String title;
	@Column(name = "publisher")
	private String publisher;
	@Column(name = "summary")
	private String summary;
	
//	(Attribute)booknum 
	public Integer getBooknum() {
		return booknum;
	}
	public void setBooknum(Integer booknum) {
		this.booknum= booknum;
	}
	
//	(Attribute)title
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
//	(Attribute)publisher
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
//	(Attribute)summary
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
}
