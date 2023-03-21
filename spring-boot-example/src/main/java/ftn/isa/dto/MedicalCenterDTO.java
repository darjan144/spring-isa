package ftn.isa.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ftn.isa.model.Address;
import ftn.isa.model.Appointment;
import ftn.isa.model.MedicalCenter;
import ftn.isa.model.MedicalStaff;

public class MedicalCenterDTO 
{
	private String name;
	
	private String location;
	private String city;
	private String country;
	
	private String description;
	private double avgRating;
	
	public MedicalCenterDTO() {}
	
	public MedicalCenterDTO(MedicalCenter medicalCenter) 
	{
		this(medicalCenter.getName(),
				medicalCenter.getAddress().getLocation(),
				medicalCenter.getAddress().getCity(),
				medicalCenter.getAddress().getCountry(),
				medicalCenter.getDescription(),
				medicalCenter.getAvgRating());
	}
	
	public MedicalCenterDTO(String name, String location,String city,String country, String description, double avgRating) 
	{
		super();
		this.name = name;
		this.description = description;
		this.avgRating = avgRating;		
		this.location = location;
		this.city = city;
		this.country = country;	
	}

	public String getName() {
		return name;
	}



	public String getLocation() {
		return location;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}

	public String getDescription() {
		return description;
	}


	public double getAvgRating() {
		return avgRating;
	}
}
