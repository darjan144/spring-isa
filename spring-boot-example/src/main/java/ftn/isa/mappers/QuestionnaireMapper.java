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
				questionnaire.getPatientId(),
				questionnaire.getDescription(),
				questionnaire.getBloodType(),
				questionnaire.getBloodPressure(),
				questionnaire.getSymptoms(),
				questionnaire.getDate(),
				questionnaire.getWeight());	
	}
	
	public Questionnaire toQuestionnaire(QuestionnaireDTO questionnaireDTO) 
	{
			return new Questionnaire(
					questionnaireDTO.getPatientId(),questionnaireDTO.getDescription(),
					questionnaireDTO.getBloodType(),
					questionnaireDTO.getBloodPressure(),
					questionnaireDTO.getSymptoms(),
					questionnaireDTO.getDate(),
					questionnaireDTO.getWeight());
	}
}
