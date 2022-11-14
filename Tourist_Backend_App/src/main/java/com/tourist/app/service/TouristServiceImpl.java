package com.tourist.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.tourist.app.model.Tourist;
import com.tourist.app.repository.TouristRepository;

@Service
public class TouristServiceImpl implements TouristService {

	@Autowired
	private TouristRepository tRepo;
	
	
	@Override
	public List<Tourist> getAllTourists( ) {
		// TODO Auto-generated method stub
		
		Sort sort =Sort.by(Sort.Direction.DESC,"firstName");
		return tRepo.findAll(sort);
	}
	@Override
	public Tourist saveTourist(Tourist tourist) {
		// TODO Auto-generated method stub
		return tRepo.save(tourist);
	}
	

	
}
