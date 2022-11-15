package ftn.isa.dto;

import java.util.List;

import ftn.isa.model.Address;
import ftn.isa.model.Appointment;
import ftn.isa.model.MedicalCenter;
import ftn.isa.model.MedicalStaff;

public class MedicalCenterDTO 
{
	private Long id;
	private String name;
	private Address address;
	private String description;
	private double avgRating;
	private List<Appointment> appointments; 
	private List<MedicalStaff> medicalStaff;
	
	public MedicalCenterDTO() {}
	
	public MedicalCenterDTO(MedicalCenter medicalCenter) 
	{
		this(medicalCenter.getId(),medicalCenter.getName(),medicalCenter.getAddress(),medicalCenter.getDescription(),
				medicalCenter.getAvgRating(),medicalCenter.getAppointments(),medicalCenter.getMedicalStaff());
	}
	
	public MedicalCenterDTO(Long id, String name, Address address, String description, double avgRating,
			 List<Appointment> appointments, List<MedicalStaff> medicalStaff) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.description = description;
		this.avgRating = avgRating;		
		this.appointments = appointments;
		this.medicalStaff = medicalStaff;
	}

	public Long getId() 
	{
		return id;
	}


	public String getName() {
		return name;
	}


	public Address getAddress() {
		return address;
	}


	public String getDescription() {
		return description;
	}


	public double getAvgRating() {
		return avgRating;
	}

	public List<Appointment> getAppointments() {
		return appointments;
	}


	public List<MedicalStaff> getMedicalStaff() {
		return medicalStaff;
	}
}
