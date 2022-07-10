package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.UserInfo;
import com.example.demo.Service.UserInfoService;


@RestController
public class UserInfoController {
		
	@Autowired
	private  UserInfoService service ; 
	
	
	@GetMapping("/User/")
	public List<String> list(){
		
		List<UserInfo> list =   service.listAll() ;
		
		List<String> name = new ArrayList<String>();
		
		for(int i = 0 ; i < list.size() ;i++) {
			
			name.add(list.get(i).getName());
			
		}

		return  name;
		
	}
	
}
