package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Entity.Content;
import com.example.demo.Entity.UserInfo;

public interface ContentRepository extends JpaRepository<Content, Integer> {
	
	
	@Query(value="select id , date , contents , set_price , get_price from content where name = ?1 ", nativeQuery=true)
	public List<Content> findByName(String name);

}
