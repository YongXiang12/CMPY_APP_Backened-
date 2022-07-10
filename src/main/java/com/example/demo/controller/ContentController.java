package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Content;
import com.example.demo.Service.ContentService;



@RestController
public class ContentController {

	
	@Autowired
	private  ContentService service ; 
	
	
	@GetMapping("/Content/{name}/{year}")
	public List<Content> list(@PathVariable String name , @PathVariable String year){
		
		List<Content> list =   service.listData(name) ;
		
		
		List<Content> datas = new ArrayList<Content>();
		
		int target_year = Integer.parseInt(year)+1911 ;
		
		for(int i = 0 ; i < list.size() ;i++) {
			String date = list.get(i).getDate() ;
			
			if(date == null || date.equals(""))
				continue ;
			
			if(Integer.parseInt(date.substring(0, 4)) == target_year) {
				
				int index1 = date.indexOf("/");
				int index2 = date.indexOf("/",index1+1);
				int index3 = date.length() - index2;
				
			
				
				
				if(index2 - index1 == 2) {
					StringBuilder str =new StringBuilder(date);
					str.insert(index1+1, '0');
					date = str.toString();
				}
				
				if(index3==2 ) {
					StringBuilder str =new StringBuilder(date);
					str.insert(index2+2, '0');
					date = str.toString();
				}
				
				date =year+date.substring(index1);
				list.get(i).setDate(date);
				datas.add(list.get(i));
				
			}
			
		}
		
		
		DataComparator comparator = new DataComparator();
		Collections.sort(datas , comparator);
		return  datas;
		
	}
	
	
	@GetMapping("/Content/{name}/Compara/{things}")
	public List<Content> compara(@PathVariable String name , @PathVariable String things){
		
		List<Content> list =   service.listData(name) ;
		
		
		List<Content> datas = new ArrayList<Content>();
		

		
		for(int i = 0 ; i < list.size() ;i++) {
			
				String date = list.get(i).getDate() ;
				String content = list.get(i).getContents();
				
				if(content != null &&content.contains(things)) {
					int index1 = date.indexOf("/");
					int index2 = date.indexOf("/",index1+1);
					int index3 = date.length() - index2;
					
				
					
					
					if(index2 - index1 == 2) {
						StringBuilder str =new StringBuilder(date);
						str.insert(index1+1, '0');
						date = str.toString();
					}
					
					if(index3==2 ) {
						StringBuilder str =new StringBuilder(date);
						str.insert(index2+2, '0');
						date = str.toString();
					}
					int year = Integer.parseInt(date.substring(0, 4))-1911;
					date =year+date.substring(index1);
					list.get(i).setDate(date);
					datas.add(list.get(i));
				}
				
			
			
		}
		
		
		ThingComparator comparator = new ThingComparator();
		Collections.sort(datas , comparator);
		return  datas;
		
	}
	
	class DataComparator implements Comparator<Content> {

		@Override
		public int compare(Content content1, Content content2) {
			
			
			String date1 = content1.getDate();
			String date2 = content2.getDate();
			
			return date1.compareTo(date2);
			
		}
	}
	
	
	
	class ThingComparator implements Comparator<Content> {

		@Override
		public int compare(Content content1, Content content2) {
			
			
			String date1 = content1.getDate();
			String date2 = content2.getDate();
			
			return date2.compareTo(date1);
			
		}
	}
	
	
}
