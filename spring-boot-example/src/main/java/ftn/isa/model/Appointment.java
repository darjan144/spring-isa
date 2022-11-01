package ftn.isa.model;

import ftn.isa.model.Enums.AppointmentStatusENUM;

public class Appointment 
{
	private int id;
	private MedicalCenter medicalCenter;//foreign key
	private Patient patient;//foreign key
	private MedicalStaff medicalStaff;//foreign key
	private AppointmentPeriod appointmentPeriod;
	private AppointmentStatusENUM appointmentStatus;
	
	public int getId() 
	{
		return id;
	}
	
	public void setId(int id) 
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
}
