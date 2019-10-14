package ozan.yldz.spring.mvc;

import java.util.LinkedHashMap;

public class Customer {
private String name;
private String surName;
private String phoneNumber;
private String gender;
private String country;
private LinkedHashMap<String, String> countries;

//Constructor
public Customer() {
	countries=new LinkedHashMap<String,String>();
	countries.put("Turkey", "Turkey");
	countries.put("Germany", "Germany");
	countries.put("France", "France");
	countries.put("Spain", "Spain");
}

//Getters & Setters
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSurName() {
	return surName;
}
public void setSurName(String surName) {
	this.surName = surName;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public LinkedHashMap<String, String> getCountries() {
	return countries;
}
public void setCountries(LinkedHashMap<String, String> countries) {
	this.countries = countries;
}

}
