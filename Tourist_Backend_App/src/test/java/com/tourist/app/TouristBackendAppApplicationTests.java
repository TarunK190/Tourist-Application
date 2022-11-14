package com.tourist.app;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
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
class TouristBackendAppApplicationTests {


@InjectMocks
TouristServiceImpl tservice;


	
@Autowired
	TouristRepository trepo;

	
	
	
	
	
	@Test
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
	@Order(3)
	public void testRead() {
		
		Tourist tourist=trepo.findById(5).get();
		assertEquals("sam", tourist.getFirstName());
	}
	
	@Test
	@Order(4)
	public void testUpdate() {
		Tourist tourist = trepo.findById(5).get();
		tourist.setFromPlace("hyderabad");
		trepo.save(tourist);
		assertNotEquals("salem", trepo.findById(5).get().getFromPlace());
				}
	
	@Test
	@Order(5)
	public void testDelete() {
		trepo.deleteById(2);
		assertThat(trepo.existsById(2)).isFalse();
	}

}
