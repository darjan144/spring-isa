package ftn.isa.dto;

import java.util.Date;

import ftn.isa.model.Patient;
import ftn.isa.model.Questionnaire;
import ftn.isa.model.Enums.BloodTypeENUM;

public class QuestionnaireDTO 
{
	private String patientPid;
	
	private String description;
	private BloodTypeENUM bloodType;
	private String bloodPressure;
	private String symptoms;
	private Date date;
	private double weight;
	
	private boolean answerToQuestion1;
	private boolean answerToQuestion2;
	private boolean answerToQuestion3;
	private boolean answerToQuestion4;
	private boolean answerToQuestion5;
	private boolean answerToQuestion6;
	private boolean answerToQuestion7;
	private boolean answerToQuestion8;
	private boolean answerToQuestion9;
	private boolean answerToQuestion10;
	
	
	public QuestionnaireDTO() {}

	public QuestionnaireDTO(String patientPid, String description, BloodTypeENUM bloodType, String bloodPressure,
			String symptoms, Date date, double weight) 
	{
		super();
		this.patientPid = patientPid;
		this.description = description;
		this.bloodType = bloodType;
		this.bloodPressure = bloodPressure;
		this.symptoms = symptoms;
		this.date = date;
		this.weight = weight;
	}
	
	public QuestionnaireDTO(String patientPid, String description, BloodTypeENUM bloodType, String bloodPressure,
			String symptoms, Date date, double weight, boolean answerToQuestion1, boolean answerToQuestion2,
			boolean answerToQuestion3, boolean answerToQuestion4, boolean answerToQuestion5, boolean answerToQuestion6,
			boolean answerToQuestion7, boolean answerToQuestion8, boolean answerToQuestion9,
			boolean answerToQuestion10) {
		super();
		this.patientPid = patientPid;
		this.description = description;
		this.bloodType = bloodType;
		this.bloodPressure = bloodPressure;
		this.symptoms = symptoms;
		this.date = date;
		this.weight = weight;
		this.answerToQuestion1 = answerToQuestion1;
		this.answerToQuestion2 = answerToQuestion2;
		this.answerToQuestion3 = answerToQuestion3;
		this.answerToQuestion4 = answerToQuestion4;
		this.answerToQuestion5 = answerToQuestion5;
		this.answerToQuestion6 = answerToQuestion6;
		this.answerToQuestion7 = answerToQuestion7;
		this.answerToQuestion8 = answerToQuestion8;
		this.answerToQuestion9 = answerToQuestion9;
		this.answerToQuestion10 = answerToQuestion10;
	}

	public String getPatientPid() {
		return patientPid;
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

	public boolean isAnswerToQuestion1() {
		return answerToQuestion1;
	}

	public boolean isAnswerToQuestion2() {
		return answerToQuestion2;
	}

	public boolean isAnswerToQuestion3() {
		return answerToQuestion3;
	}

	public boolean isAnswerToQuestion4() {
		return answerToQuestion4;
	}

	public boolean isAnswerToQuestion5() {
		return answerToQuestion5;
	}

	public boolean isAnswerToQuestion6() {
		return answerToQuestion6;
	}

	public boolean isAnswerToQuestion7() {
		return answerToQuestion7;
	}

	public boolean isAnswerToQuestion8() {
		return answerToQuestion8;
	}

	public boolean isAnswerToQuestion9() {
		return answerToQuestion9;
	}

	public boolean isAnswerToQuestion10() {
		return answerToQuestion10;
	}

}
