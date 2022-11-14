package com.tourist.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tourist.app.model.feignModel;
import com.tourist.app.user.client.FeignUserClient;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@RestController
@RibbonClient(name="Touist_Backend_App")
public class FeignClientApplication {
	
	@Autowired
     FeignUserClient feignClient;

	@GetMapping("/getdata")
	public List<feignModel> getData(){
		return feignClient.getTouristData();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(FeignClientApplication.class, args);
	}

}
