package ftn.isa.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import ftn.isa.model.Enums.GenderENUM;

@Embeddable
public class PersonalInfo 
{
	@Column(name = "firstName", nullable = false)
	private String firstName;
	
	@Column(name = "lastName", nullable = false)
	private String lastName;
	
	@Column(name = "PID", unique = true, nullable = false)
	private String pid;
	
	@Embedded
	private Address address;
	
	@Column(name = "gender",nullable = false)
	private GenderENUM gender;
	
	@Column(name = "phoneNumber", unique = true, nullable = false)
	private String phoneNumber;
	
	@Column(name = "placeOfEmployment")
	private String placeOfEmployment;
	
	public PersonalInfo() {}
	
	public PersonalInfo(String firstName, String lastName, String pid, Address address, GenderENUM gender,
			String phoneNumber, String placeOfEmployment) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.pid = pid;
		this.address = address;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.placeOfEmployment = placeOfEmployment;
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
