package ftn.isa.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import ftn.isa.model.Enums.LoyaltyCategoryENUM;

@Entity
@DiscriminatorValue("PA")
public class Patient extends User
{
	@Column
	private LoyaltyCategoryENUM loyaltyCategory;
	
	@Column(nullable = false,unique = false,columnDefinition = "integer default 0")
	private int points;
	
	@Column(unique=false,columnDefinition = "integer default 0")
	private int numberOfPenalties;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(nullable = true)
	private Questionnaire questionnaire;
	
	public Patient() 
	{
		
	}
	
	
	public Patient(LoyaltyCategoryENUM loyaltyCategory, int points, int numberOfPenalties,
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
	public void setLoyaltyCategory(LoyaltyCategoryENUM loyaltyCategory) {
		this.loyaltyCategory = loyaltyCategory;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public int getNumberOfPenalties() {
		return numberOfPenalties;
	}
	public void setNumberOfPenalties(int numberOfPenalties) {
		this.numberOfPenalties = numberOfPenalties;
	}

	public Questionnaire getQuestionnaire() {
		return questionnaire;
	}

	public void setQuestionnaire(Questionnaire questionnaire) {
		this.questionnaire = questionnaire;
	}
	
	
	
}
