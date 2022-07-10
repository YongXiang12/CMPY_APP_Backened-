package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Content;
import com.example.demo.Entity.UserInfo;
import com.example.demo.Repository.ContentRepository;

@Service
public class ContentService {

	

	@Autowired 
	private ContentRepository repo  ;	
	
	public List<Content> listData(String name ){
		return repo.findByName(name);
	}
	
}
