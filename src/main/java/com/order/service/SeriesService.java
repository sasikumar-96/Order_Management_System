package com.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.order.entity.SeriesEntity;
import com.order.repository.SeriesRepository;

@Service

public class SeriesService {
	
	@Autowired
	SeriesRepository repo;

	public List<SeriesEntity> getSeries() {
		// TODO Auto-generated method stub
		return repo.findAll();
	} 
	
	


}
