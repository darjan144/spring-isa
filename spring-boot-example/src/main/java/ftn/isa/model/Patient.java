package ftn.isa.model;

import ftn.isa.model.Enums.LoyaltyCategoryENUM;

public class Patient extends User
{
	private LoyaltyCategoryENUM loyaltyCategory;
	private int points;
	private int numberOfPenalties;
	
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
	
	
	
}
