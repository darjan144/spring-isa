package ftn.isa.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import ftn.isa.model.Enums.AppointmentStatusENUM;

@Entity
public class Appointment 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn
	private MedicalCenter medicalCenter;//foreign key
	
	@OneToOne
	private Patient patient;//foreign key
	
	@OneToOne
	private MedicalStaff medicalStaff;//foreign key
	
	@Embedded
	private AppointmentPeriod appointmentPeriod;
	
	@Column
	private AppointmentStatusENUM appointmentStatus;
	
	@Column
	private Date createdAt;
	
	@Column
	private Date updatedAt;
	
	public Long getId() 
	{
		return id;
	}
	
	public void setId(Long id) 
	{
		this.id = id;
	}

	public MedicalCenter getMedicalCenter() {
		return medicalCenter;
	}

	public void setMedicalCenter(MedicalCenter medicalCenter) {
		this.medicalCenter = medicalCenter;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public MedicalStaff getMedicalStaff() {
		return medicalStaff;
	}

	public void setMedicalStaff(MedicalStaff medicalStaff) {
		this.medicalStaff = medicalStaff;
	}

	public AppointmentPeriod getAppointmentPeriod() 
	{
		return appointmentPeriod;
	}
	
	public void setAppointmentPeriod(AppointmentPeriod appointmentPeriod) 
	{
		this.appointmentPeriod = appointmentPeriod;
	}
	
	public AppointmentStatusENUM getAppointmentStatus() 
	{
		return appointmentStatus;
	}
	
	public void setAppointmentStatus(AppointmentStatusENUM appointmentStatus) 
	{
		this.appointmentStatus = appointmentStatus;
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
