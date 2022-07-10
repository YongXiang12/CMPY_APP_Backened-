package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="content")

public class Content {
	
	
	@Id
	private Integer id ; 
	@Column(name = "date")
	private String date ;
	@Column(name = "contents")
	private String contents ;
	@Column(name = "set_price")
	private String set_price ;
	@Column(name = "get_price")
	private String get_price ;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getSet_price() {
		return set_price;
	}
	public void setSet_price(String set_price) {
		this.set_price = set_price;
	}
	public String getGet_price() {
		return get_price;
	}
	public void setGet_price(String get_price) {
		this.get_price = get_price;
	}
	
	
}
