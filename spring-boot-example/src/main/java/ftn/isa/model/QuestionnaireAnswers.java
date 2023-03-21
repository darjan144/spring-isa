package ftn.isa.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class QuestionnaireAnswers 
{

	/*
	 * 
	 * 
	 *  Да ли сте до сада добровољно давали крв или компоненте крви?
		Да ли сте икада били одбијени као давалац крви или компоненте крви?
		Да ли се тренутно осећате здравим, способним и одморним да дате крв или компоненте крви?
		Да ли сте нешто јели пре доласка на давање крви или компоненте крви?
		Да ли се бавите опасним занимањем или хобијем?
		Да ли редовно (свакодневно) узимате било какве лекове?
		Да ли сте последња 2-3 дана узимали било какве лекове (нпр. Бруфен, Кафетин, Аналгин...)?
		Да ли стално узимате Аспирин (Cardiopirin)? Да ли сте га узимали у последњих 5 дана?
		Да ли сте до сада испитивани или лечени у болници или сте тренутно на испитивању или боловању?
		Да ли сте вадили зуб у протеклих 7 дана?
	 * */
	
	
	@Column(nullable=false)
	private boolean answerToQuestion1;
	
	@Column(nullable=false)
	private boolean answerToQuestion2;
	
	@Column(nullable=false)
	private boolean answerToQuestion3;
	
	@Column(nullable=false)
	private boolean answerToQuestion4;
	
	@Column(nullable=false)
	private boolean answerToQuestion5;
	
	@Column(nullable=false)
	private boolean answerToQuestion6;
	
	@Column(nullable=false)
	private boolean answerToQuestion7;
	
	@Column(nullable=false)
	private boolean answerToQuestion8;
	
	@Column(nullable=false)
	private boolean answerToQuestion9;
	
	@Column(nullable=false)
	private boolean answerToQuestion10;
	
	public QuestionnaireAnswers() 
	{
		
	}

	public QuestionnaireAnswers(boolean answerToQuestion1, boolean answerToQuestion2, boolean answerToQuestion3,
			boolean answerToQuestion4, boolean answerToQuestion5, boolean answerToQuestion6, boolean answerToQuestion7,
			boolean answerToQuestion8, boolean answerToQuestion9, boolean answerToQuestion10) {
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
	

	public boolean isAnswerToQuestion1() {
		return answerToQuestion1;
	}

	public void setAnswerToQuestion1(boolean answerToQuestion1) {
		this.answerToQuestion1 = answerToQuestion1;
	}

	public boolean isAnswerToQuestion2() {
		return answerToQuestion2;
	}

	public void setAnswerToQuestion2(boolean answerToQuestion2) {
		this.answerToQuestion2 = answerToQuestion2;
	}

	public boolean isAnswerToQuestion3() {
		return answerToQuestion3;
	}

	public void setAnswerToQuestion3(boolean answerToQuestion3) {
		this.answerToQuestion3 = answerToQuestion3;
	}

	public boolean isAnswerToQuestion4() {
		return answerToQuestion4;
	}

	public void setAnswerToQuestion4(boolean answerToQuestion4) {
		this.answerToQuestion4 = answerToQuestion4;
	}

	public boolean isAnswerToQuestion5() {
		return answerToQuestion5;
	}

	public void setAnswerToQuestion5(boolean answerToQuestion5) {
		this.answerToQuestion5 = answerToQuestion5;
	}

	public boolean isAnswerToQuestion6() {
		return answerToQuestion6;
	}

	public void setAnswerToQuestion6(boolean answerToQuestion6) {
		this.answerToQuestion6 = answerToQuestion6;
	}

	public boolean isAnswerToQuestion7() {
		return answerToQuestion7;
	}

	public void setAnswerToQuestion7(boolean answerToQuestion7) {
		this.answerToQuestion7 = answerToQuestion7;
	}

	public boolean isAnswerToQuestion8() {
		return answerToQuestion8;
	}

	public void setAnswerToQuestion8(boolean answerToQuestion8) 
	{
		this.answerToQuestion8 = answerToQuestion8;
	}

	public boolean isAnswerToQuestion9() 
	{
		return answerToQuestion9;
	}

	public void setAnswerToQuestion9(boolean answerToQuestion9) 
	{
		this.answerToQuestion9 = answerToQuestion9;
	}

	public boolean isAnswerToQuestion10() 
	{
		return answerToQuestion10;
	}

	public void setAnswerToQuestion10(boolean answerToQuestion10) 
	{
		this.answerToQuestion10 = answerToQuestion10;
	}
}
