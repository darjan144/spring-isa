package ftn.isa.model;

import java.util.Date;

import ftn.isa.model.Enums.BloodTypeENUM;

public class Questionnaire 
{
	private int id;
	private Appointment appointment;
	private Patient patient;
	private String description;
	private BloodTypeENUM bloodType;
	private String bloodPressure;
	private String symptoms;
	private Date date;
	private double weight;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Appointment getAppointment() {
		return appointment;
	}
	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
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
