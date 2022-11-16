package ftn.isa.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class MedicalCenter 
{	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name",unique=true,nullable=false)
	private String name;
	
	@Embedded
	private Address address;
	
	@Column(name = "description",nullable = false)
	private String description;
	
	@Column(name = "avgRating")
	private double avgRating;
	
	@OneToMany(mappedBy = "medicalCenter",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Appointment> appointments; 
	
	@OneToMany(mappedBy = "medicalCenter", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<MedicalStaff> medicalStaff;
	
	@Column(name = "createdAt", nullable = false)
	private Date createdAt;
	
	@Column(name = "updatedAt", nullable = false)
	private Date updatedAt;
	
	public MedicalCenter() {}
	
	
	
	public MedicalCenter(Long id, String name, Address address, String description, double avgRating) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.description = description;
		this.avgRating = avgRating;
		this.appointments = new ArrayList<>();
		this.medicalStaff = new ArrayList<>();
		//this.createdAt = createdAt;
		//this.updatedAt = updatedAt;
	}



	public Long getId() 
	{
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
	public List<Appointment> getAppointments() {
		return appointments;
	}
	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}
	public List<MedicalStaff> getMedicalStaff() {
		return medicalStaff;
	}
	public void setMedicalStaff(List<MedicalStaff> medicalStaff) {
		this.medicalStaff = medicalStaff;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
	
}
