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

	@Column
	private Long patientId;
	
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
	
	
	
	public Questionnaire(Long id, Long patientId, String description, BloodTypeENUM bloodType, String bloodPressure,
			String symptoms, Date date, double weight) {
		super();
		this.id = id;
		this.patientId = patientId;
		this.description = description;
		this.bloodType = bloodType;
		this.bloodPressure = bloodPressure;
		this.symptoms = symptoms;
		this.date = date;
		this.weight = weight;
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}


	
	
	public Long getPatientId() {
		return patientId;
	}



	public void setPatientId(Long patientId) {
		this.patientId = patientId;
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
