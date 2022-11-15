package ftn.isa.dto;

import java.util.Date;

import ftn.isa.model.Patient;
import ftn.isa.model.Questionnaire;
import ftn.isa.model.Enums.BloodTypeENUM;

public class QuestionnaireDTO 
{
	private Long id;
	private Patient patient;
	private String description;
	private BloodTypeENUM bloodType;
	private String bloodPressure;
	private String symptoms;
	private Date date;
	private double weight;
	
	public QuestionnaireDTO() {}
	
	public QuestionnaireDTO(Questionnaire questionnaire) 
	{
		this(questionnaire.getId(),questionnaire.getPatient(),questionnaire.getDescription(),
				questionnaire.getBloodType(),questionnaire.getBloodPressure(),questionnaire.getSymptoms(),questionnaire.getDate(),questionnaire.getWeight());
	}
	

	public QuestionnaireDTO(Long id, Patient patient, String description, BloodTypeENUM bloodType, String bloodPressure,
			String symptoms, Date date, double weight) {
		super();
		this.id = id;
		this.patient = patient;
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

	public Patient getPatient() {
		return patient;
	}
	public String getDescription() {
		return description;
	}
	public BloodTypeENUM getBloodType() {
		return bloodType;
	}
	public String getBloodPressure() {
		return bloodPressure;
	}
	public String getSymptoms() {
		return symptoms;
	}
	public Date getDate() {
		return date;
	}
	public double getWeight() {
		return weight;
	}

}
