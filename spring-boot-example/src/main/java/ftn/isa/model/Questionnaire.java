package ftn.isa.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import ftn.isa.model.Enums.BloodTypeENUM;

@Entity
public class Questionnaire 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne(mappedBy = "questionnaire")
	private Patient patient;
	
	@Column
	private String description;
	
	@Column
	private BloodTypeENUM bloodType;
	
	@Column
	private String bloodPressure;
	
	@Column
	private String symptoms;
	
	@Column
	private Date date;
	
	@Column
	private double weight;
	
	public Questionnaire() {
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BloodTypeENUM getBloodType() {
		return bloodType;
	}
	public void setBloodType(BloodTypeENUM bloodType) {
		this.bloodType = bloodType;
	}
	public String getBloodPressure() {
		return bloodPressure;
	}
	public void setBloodPressure(String bloodPressure) {
		this.bloodPressure = bloodPressure;
	}
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}			
}
