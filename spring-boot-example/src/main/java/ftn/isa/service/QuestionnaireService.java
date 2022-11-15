package ftn.isa.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ftn.isa.model.Questionnaire;
import ftn.isa.repository.QuestionnaireRepository;

@Service
public class QuestionnaireService 
{
	@Autowired
	private QuestionnaireRepository questionnaireRepository;
	
	public Questionnaire findOne(Long id) 
	{
		return questionnaireRepository.findById(id).orElseGet(null);
	}
	
	public List<Questionnaire> findAll()
	{
		return questionnaireRepository.findAll();
	}
	
	public Questionnaire save(Questionnaire questionnaire) 
	{
		return questionnaireRepository.save(questionnaire);
	}
	
	public void remove(Long id) 
	{
		questionnaireRepository.deleteById(id);
	}
}
