package com.tourist.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class TouristBackendAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TouristBackendAppApplication.class, args);
	}

}
