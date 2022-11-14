package com.tourist.app.user.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.tourist.app.model.feignModel;

@FeignClient(url="http://localhost:9092"  ,name="FEIGN")
public interface FeignUserClient {
 
	
	@GetMapping("/tourist")
	public List<feignModel> getTouristData();
	
}
