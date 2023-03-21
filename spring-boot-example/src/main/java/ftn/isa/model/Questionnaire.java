package ftn.isa.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import ftn.isa.model.Enums.BloodTypeENUM;

@Entity
public class Questionnaire 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	//change to nullable false, we need to implement this data when we get the user to log on;
	//do I even need this if I have this field in patient?
	@Column(nullable=true)
	private String patientPid;
	
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
	
	@Embedded
	private QuestionnaireAnswers questionnaireAnswers;
	
	//need updated and created at
	@Column
	private Date createdAt;
	
	@Column
	private Date updatedAt;
	
	public Questionnaire() 
	{
		
	}
	
	
	public Questionnaire(String patientPid, 
			String description,
			BloodTypeENUM bloodType, 
			String bloodPressure,
			String symptoms,
			Date date, 
			double weight,
			boolean answerToQuestion1,
			boolean answerToQuestion2,
			boolean answerToQuestion3,
			boolean answerToQuestion4,
			boolean answerToQuestion5,
			boolean answerToQuestion6,
			boolean answerToQuestion7,
			boolean answerToQuestion8,
			boolean answerToQuestion9,
			boolean answerToQuestion10) 
	{
		
		this.patientPid = patientPid;
		this.description = description;
		this.bloodType = bloodType;
		this.bloodPressure = bloodPressure;
		this.symptoms = symptoms;
		this.date = date;
		this.weight = weight;
		
		System.out.println("HELLLLOOOOOOOOOOOO1" + answerToQuestion1);
		System.out.println("HELLLLOOOOOOOOOOOO2" + answerToQuestion2);
		System.out.println("HELLLLOOOOOOOOOOOO3" + answerToQuestion3);
		System.out.println("HELLLLOOOOOOOOOOOO4" + answerToQuestion4);
		System.out.println("HELLLLOOOOOOOOOOOO5" + answerToQuestion5);
		System.out.println("HELLLLOOOOOOOOOOOO6" + answerToQuestion6);
		System.out.println("HELLLLOOOOOOOOOOOO7" + answerToQuestion7);
		System.out.println("HELLLLOOOOOOOOOOOO8" + answerToQuestion8);
		System.out.println("HELLLLOOOOOOOOOOOO9" + answerToQuestion9);
		System.out.println("HELLLLOOOOOOOOOOOO10" + answerToQuestion10);
		
		
		
		this.questionnaireAnswers = new QuestionnaireAnswers(answerToQuestion1,
				answerToQuestion2,
				answerToQuestion3,
				answerToQuestion4,
				answerToQuestion5,
				answerToQuestion6,
				answerToQuestion7,
				answerToQuestion8,
				answerToQuestion9,
				answerToQuestion10
				);	
		
		System.out.println("IAM HEEEEEEEEEEREEEEEEEEE");
	}
	

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getPatientPid() {
		return patientPid;
	}

	public void setPatientPid(String patientPid) {
		this.patientPid = patientPid;
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



	public QuestionnaireAnswers getQuestionnaireAnswers() {
		return questionnaireAnswers;
	}



	public void setQuestionnaireAnswers(QuestionnaireAnswers questionnaireAnswers) {
		this.questionnaireAnswers = questionnaireAnswers;
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
