package ftn.isa.model;

public class Complaint 
{
	private Long id;
	private String description;
	private MedicalCenter medicalCenter;
	private MedicalStaff medicalStaf;
	
	public Long getId() 
	{
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public MedicalCenter getMedicalCenter() {
		return medicalCenter;
	}
	public void setMedicalCenter(MedicalCenter medicalCenter) {
		this.medicalCenter = medicalCenter;
	}
	public MedicalStaff getMedicalStaf() {
		return medicalStaf;
	}
	public void setMedicalStaf(MedicalStaff medicalStaf) {
		this.medicalStaf = medicalStaf;
	}
	
}
