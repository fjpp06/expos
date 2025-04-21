package com.fjpp.expos.model;

public class Dog {
	
	String dogId;
	String dogName;
	String dogBreed;
	String dogBirthDate;
	
	public Dog(String dogId, String dogName, String dogBreed, String dogBirthDate) {
		this.dogId = dogId;
		this.dogName = dogName;
		this.dogBreed = dogBreed;
		this.dogBirthDate = dogBirthDate;
	}
	
	public String getDogId() {
		return dogId;
	}
	
	public void setDogId(String dogId) {
		this.dogId = dogId;
	}
	
	public String getDogName() {
		return dogName;
	}
	
	public void setDogName(String dogName) {
		this.dogName = dogName;
	}
	
	public String getDogBreed() {
		return dogBreed;
	}
	
	public void setDogBreed(String dogBreed) {
		this.dogBreed = dogBreed;
	}
	
	public String getDogBirthDate() {
		return dogBirthDate;
	}
	
	public void setDogAge(String dogBirthDate) {
		this.dogBirthDate = dogBirthDate;
	}
	
	@Override
	public String toString() {
		return dogId + " - " + dogName + " - " + dogBreed + " - " + dogBirthDate;
	}
}
