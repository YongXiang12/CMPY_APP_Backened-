package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.UserInfo;
import com.example.demo.Repository.UserInfoRepository;

@Service
public class UserInfoService {
	
	@Autowired 
	private UserInfoRepository repo  ;	
	
	public List<UserInfo> listAll(){
		return repo.findAll();
	}
	
}
