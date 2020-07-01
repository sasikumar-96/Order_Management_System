package com.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.entity.SeriesEntity;
import com.order.service.SeriesService;



@RestController
public class SeriesController {

	@Autowired
	private SeriesService service;
	
    @RequestMapping(value="/series")
	public List<SeriesEntity> getSeries(){
		
		return service.getSeries();
	} 
	
	@RequestMapping(value="/welcome")
	public String welcomemessage() {
		
		return "welcome to Spring Boot";
	}
	
     
}
