package com.tourist.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tourist.app.model.Tourist;
import com.tourist.app.service.TouristService;


@RestController

public class TouristController {

	@Autowired
	private TouristService tService;
	
	@CrossOrigin("http://localhost:4200")
	@GetMapping("/tourist")
	public List<Tourist> getalltourist(  ){
		return tService.getAllTourists();
	}
	
	@CrossOrigin("http://localhost:4200")
	@PostMapping("/tourist")
	public Tourist savetourist(@RequestBody Tourist tourist) {
		return tService.saveTourist(tourist);
	}
	
	
}
