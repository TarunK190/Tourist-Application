package com.tourist.app.service;

import java.util.List;

import com.tourist.app.model.Tourist;

public interface TouristService {

	List<Tourist> getAllTourists();
	
	Tourist saveTourist(Tourist tourist);
	
	
}
