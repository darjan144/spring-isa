package ftn.isa.dto;

import java.util.Date;

import ftn.isa.model.Appointment;
import ftn.isa.model.AppointmentPeriod;
import ftn.isa.model.MedicalCenter;
import ftn.isa.model.MedicalStaff;
import ftn.isa.model.Patient;
import ftn.isa.model.Enums.AppointmentStatusENUM;

public class AppointmentDTO 
{
	private Long id;
	private MedicalCenter medicalCenter;
	private Patient patient;
	private MedicalStaff medicalStaff;
	private AppointmentPeriod appointmentPeriod;	
	private AppointmentStatusENUM appointmentStatus;
	private Date createdAt;
	private Date updatedAt;
	
	public AppointmentDTO() {}
	
	public AppointmentDTO(Appointment appointment) 
	{
		this(appointment.getId(),appointment.getMedicalCenter(),appointment.getPatient(),
				appointment.getMedicalStaff(),appointment.getAppointmentPeriod(),appointment.getAppointmentStatus(),appointment.getCreatedAt(),appointment.getUpdatedAt());
	}
	
	public AppointmentDTO(Long id, MedicalCenter medicalCenter, Patient patient, MedicalStaff medicalStaff,
			AppointmentPeriod appointmentPeriod, AppointmentStatusENUM appointmentStatus, Date createdAt,
			Date updatedAt) 
	{
		super();
		this.id = id;
		this.medicalCenter = medicalCenter;
		this.patient = patient;
		this.medicalStaff = medicalStaff;
		this.appointmentPeriod = appointmentPeriod;
		this.appointmentStatus = appointmentStatus;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Long getId() {
		return id;
	}

	public MedicalCenter getMedicalCenter() {
		return medicalCenter;
	}

	public Patient getPatient() {
		return patient;
	}

	public MedicalStaff getMedicalStaff() {
		return medicalStaff;
	}

	public AppointmentPeriod getAppointmentPeriod() {
		return appointmentPeriod;
	}

	public AppointmentStatusENUM getAppointmentStatus() {
		return appointmentStatus;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}	
}
