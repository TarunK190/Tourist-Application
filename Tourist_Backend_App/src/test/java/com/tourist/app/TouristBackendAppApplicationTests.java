package com.tourist.app;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tourist.app.model.Tourist;
import com.tourist.app.repository.TouristRepository;
import com.tourist.app.service.TouristService;
import com.tourist.app.service.TouristServiceImpl;

import antlr.collections.List;


@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TouristBackendAppApplicationTests {


@InjectMocks
TouristServiceImpl tservice;


	
@Autowired
	TouristRepository trepo;

		
	
	
	@BeforeAll
	 void beforeclass() {
		System.out.println("Running test cases");
	}
	
	@BeforeEach
	void beforeeach() {
		System.out.println("Running before each");
	}
	
	@Test
	@DisplayName("Create Tourist 1")
	@Order(1)
	void testcreate1() {
		Tourist tourist = new Tourist();
		tourist.setId(5);
		tourist.setFirstName("sam");
		tourist.setLastName("singh");
		tourist.setGender("male");
		tourist.setAge(23);
		tourist.setFromPlace("salem");
		tourist.setNumberOfdays(4);
		
		trepo.save(tourist);
		assertNotNull(trepo.findById(5).get());
		
	}

	@Test
	@DisplayName("Create Tourist 2")
	@Order(2)
	public void testcreate2(){
		Tourist tourist = new Tourist();
		tourist.setId(2);
		tourist.setFirstName("ram");
		tourist.setLastName("singh");
		tourist.setGender("male");
		tourist.setAge(23);
		tourist.setFromPlace("chennai");
		tourist.setNumberOfdays(3);
		
		trepo.save(tourist);
		assertNotNull(trepo.findById(2).get());
		
	}
	

	@Test
	@DisplayName("Read Tourist 3")
	@Order(3)
	public void testRead() {
		Tourist tourist = new Tourist();
		 tourist=trepo.findById(5).get();
		assertEquals("sam", tourist.getFirstName());
	}
	
	@Test
	@DisplayName("Update Tourist 4")
	@Order(4)
	public void testUpdate() {
		Tourist tourist = trepo.findById(5).get();
		tourist.setFromPlace("hyderabad");
		trepo.save(tourist);
		assertNotEquals("salem", trepo.findById(5).get().getFromPlace());
				}
	
	@Test
	@DisplayName("Delete tourist 5")
	@Order(5)
	public void testDelete() {
		trepo.deleteById(2);
		assertThat(trepo.existsById(2)).isFalse();
	}

	@AfterAll
	void afterall() {
		System.out.println("Running after test cases");
	}
	
	@AfterEach
	void aftereach() {
		System.out.println("Running after each test cases");
	}
}

