package ftn.isa.model;

import ftn.isa.model.Enums.GenderENUM;

public class PersonalInfo 
{
	//again private?
	private String firstName;
	private String lastName;
	private String pid;
	private Address address;
	private GenderENUM gender;
	private String phoneNumber;
	private String placeOfEmployment;
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
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public GenderENUM getGender() {
		return gender;
	}
	public void setGender(GenderENUM gender) {
		this.gender = gender;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPlaceOfEmployment() {
		return placeOfEmployment;
	}
	public void setPlaceOfEmployment(String placeOfEmployment) {
		this.placeOfEmployment = placeOfEmployment;
	}
	
	
	
}
