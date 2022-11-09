package ftn.isa.model;

public class MedicalCenterReview 
{
//do I need this class?
	private Long id;
	private MedicalCenter medicalCenter;
	private Appointment appointment; //firstAppointment??
	private double rating;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public MedicalCenter getMedicalCenter() {
		return medicalCenter;
	}
	public void setMedicalCenter(MedicalCenter medicalCenter) {
		this.medicalCenter = medicalCenter;
	}
	public Appointment getAppointment() {
		return appointment;
	}
	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
}
