package com.tourist.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Tourist_Registration")
public class Tourist {

	@Id
	@Column(name="Id")
	private int id;
	
	
	@Column(name="First_Name")
	private String firstName;
	
	@Column(name="Last_Name")
	private String lastName;
	
	@Column(name="Gender")
	private String Gender;
	
	@Column(name="Age")
	private int age;
	
	@Column(name="From_Place")
	private String fromPlace;
	
	@Column(name="Number_Of_Days")
	private int numberOfdays;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFromPlace() {
		return fromPlace;
	}
	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}
	public int getNumberOfdays() {
		return numberOfdays;
	}
	public void setNumberOfdays(int numberOfdays) {
		this.numberOfdays = numberOfdays;
	}
	public Tourist(int id, String firstName, String lastName, String gender, int age, String fromPlace,
			int numberOfdays) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		Gender = gender;
		this.age = age;
		this.fromPlace = fromPlace;
		this.numberOfdays = numberOfdays;
	}
	
	public Tourist() {
		
	}
	
}
