package ftn.isa.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ftn.isa.dto.QuestionnaireDTO;
import ftn.isa.mappers.QuestionnaireMapper;
import ftn.isa.model.Questionnaire;
import ftn.isa.service.QuestionnaireService;

@RestController
@RequestMapping(value = "api/questionnaire")
public class QuestionnaireController 
{
	@Autowired
	private QuestionnaireService questionnaireService;
	
	@Autowired
	private QuestionnaireMapper questionnaireMapper;
	
	@GetMapping(value = "/all")
	public ResponseEntity<List<QuestionnaireDTO>> getAllQuestionnaires()
	{
		List<Questionnaire> questionnaires = questionnaireService.findAll();
		
		List<QuestionnaireDTO> questionnairesDTO = new ArrayList<>();
		
		for(Questionnaire questionnaire : questionnaires) 
		{
			questionnairesDTO.add(questionnaireMapper.toDTO(questionnaire));
		}
		
		return new ResponseEntity<>(questionnairesDTO,HttpStatus.OK);
	}
	
	@PostMapping(consumes = "application/json")
	public ResponseEntity<QuestionnaireDTO> saveQuestionnaire(@RequestBody QuestionnaireDTO questionnaireDTO)
	{
		Questionnaire questionnaire = questionnaireMapper.toQuestionnaire(questionnaireDTO);
		
		questionnaire = questionnaireService.save(questionnaire);
		
		return new ResponseEntity<>(questionnaireMapper.toDTO(questionnaire),HttpStatus.CREATED);
	}
}
