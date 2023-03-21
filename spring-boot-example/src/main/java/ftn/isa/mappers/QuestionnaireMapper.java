package ftn.isa.mappers;

import org.springframework.stereotype.Component;

import ftn.isa.dto.QuestionnaireDTO;
import ftn.isa.model.Questionnaire;

@Component
public class QuestionnaireMapper 
{
	public QuestionnaireDTO toDTO(Questionnaire questionnaire) 
	{
		return new QuestionnaireDTO(
				questionnaire.getPatientPid(),
				questionnaire.getDescription(),
				questionnaire.getBloodType(),
				questionnaire.getBloodPressure(),
				questionnaire.getSymptoms(),
				questionnaire.getDate(),
				questionnaire.getWeight(),
				questionnaire.getQuestionnaireAnswers().isAnswerToQuestion1(),
				questionnaire.getQuestionnaireAnswers().isAnswerToQuestion2(),
				questionnaire.getQuestionnaireAnswers().isAnswerToQuestion3(),
				questionnaire.getQuestionnaireAnswers().isAnswerToQuestion4(),
				questionnaire.getQuestionnaireAnswers().isAnswerToQuestion5(),
				questionnaire.getQuestionnaireAnswers().isAnswerToQuestion6(),
				questionnaire.getQuestionnaireAnswers().isAnswerToQuestion7(),
				questionnaire.getQuestionnaireAnswers().isAnswerToQuestion8(),
				questionnaire.getQuestionnaireAnswers().isAnswerToQuestion9(),
				questionnaire.getQuestionnaireAnswers().isAnswerToQuestion10());		
	}
	
	public Questionnaire toQuestionnaire(QuestionnaireDTO questionnaireDTO) 
	{
			return new Questionnaire(
					questionnaireDTO.getPatientPid(),
					questionnaireDTO.getDescription(),
					questionnaireDTO.getBloodType(),
					questionnaireDTO.getBloodPressure(),
					questionnaireDTO.getSymptoms(),
					questionnaireDTO.getDate(),
					questionnaireDTO.getWeight(),
					questionnaireDTO.isAnswerToQuestion1(),
					questionnaireDTO.isAnswerToQuestion2(),
					questionnaireDTO.isAnswerToQuestion3(),
					questionnaireDTO.isAnswerToQuestion4(),
					questionnaireDTO.isAnswerToQuestion5(),
					questionnaireDTO.isAnswerToQuestion6(),
					questionnaireDTO.isAnswerToQuestion7(),
					questionnaireDTO.isAnswerToQuestion8(),
					questionnaireDTO.isAnswerToQuestion9(),
					questionnaireDTO.isAnswerToQuestion10());
	}
}
