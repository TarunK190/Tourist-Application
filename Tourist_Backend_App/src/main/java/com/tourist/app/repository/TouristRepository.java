package com.tourist.app.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tourist.app.model.Tourist;

@Repository
public interface TouristRepository extends JpaRepository<Tourist, Integer> {

	List<Tourist> findAll(Sort sort);
	
}
