package ftn.isa.model;

import java.util.List;

public class MedicalCenter 
{
	private Long id;
	private String name;
	private Address address;
	private String description;
	private double avgRating;
	private List<CenterAdmin> admins; //???
	private List<Appointment> appointments; //???
	private List<MedicalStaff> medicalStaff; //?? Dictionary<Long,MedicalStaff>?? serijalizacija??
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getAvgRating() {
		return avgRating;
	}
	
	public void setAvgRating(double avgRating) {
		this.avgRating = avgRating;
	}
}
