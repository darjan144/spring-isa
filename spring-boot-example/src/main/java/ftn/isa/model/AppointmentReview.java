package ftn.isa.model;

public class AppointmentReview 
{
	private int id;
	private Appointment appointment;
	private String description;
	
	public int getId() 
	{
		return id;
	}
	
	public void setId(int id) 
	{
		this.id = id;
	}
	
	public Appointment getAppointment() {
		return appointment;
	}
	
	public void setAppointment(Appointment appointment) 
	{
		this.appointment = appointment;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) 
	{
		this.description = description;
	}
}
