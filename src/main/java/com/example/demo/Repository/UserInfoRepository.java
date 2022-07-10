package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Entity.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer>{
	
	@Query(value="select name from user_info ", nativeQuery=true)
	public List<UserInfo> findByEmail(String email);
}