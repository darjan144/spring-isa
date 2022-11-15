package ftn.isa.dto;

import ftn.isa.model.Patient;
import ftn.isa.model.Questionnaire;
import ftn.isa.model.Enums.LoyaltyCategoryENUM;

public class PatientDTO extends UserDTO
{
	private LoyaltyCategoryENUM loyaltyCategory;
	private int points;	
	private int numberOfPenalties;
	private Questionnaire questionnaire;
	
	public PatientDTO() {}
	
	public PatientDTO(Patient patient) 
	{
		this(patient.getLoyaltyCategory(),patient.getPoints(),
				patient.getNumberOfPenalties(),patient.getQuestionnaire());
	}

	public PatientDTO(LoyaltyCategoryENUM loyaltyCategory, int points, int numberOfPenalties,
			Questionnaire questionnaire) {
		super();
		this.loyaltyCategory = loyaltyCategory;
		this.points = points;
		this.numberOfPenalties = numberOfPenalties;
		this.questionnaire = questionnaire;
	}

	public LoyaltyCategoryENUM getLoyaltyCategory() {
		return loyaltyCategory;
	}

	public int getPoints() {
		return points;
	}

	public int getNumberOfPenalties() {
		return numberOfPenalties;
	}

	public Questionnaire getQuestionnaire() {
		return questionnaire;
	}
}
