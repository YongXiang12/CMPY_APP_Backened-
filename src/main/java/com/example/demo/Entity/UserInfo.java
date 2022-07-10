package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="user_info")


public class UserInfo {
	
	@Id
	private Integer id ; 
	@Column(name = "name")
	private String name ;
	@Column(name = "address")
	private String address ;
	@Column(name = "phone_number")
	private String phone_number ;
	@Column(name = "telephone")
	private String telephone ;
	
	UserInfo(){
		
	}
	
	UserInfo(Integer id ,String name ,String address , String phone_number , String telephone){
		
		this.id = id ;
		this.name = name ;
		this.address = address ;
		this.phone_number = phone_number ;
		this.telephone = telephone ;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	
}
