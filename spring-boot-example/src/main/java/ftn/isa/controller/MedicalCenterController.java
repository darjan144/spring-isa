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

import ftn.isa.dto.MedicalCenterDTO;
import ftn.isa.mappers.MedicalCenterMapper;
import ftn.isa.model.MedicalCenter;
import ftn.isa.service.MedicalCenterService;

@RestController
@RequestMapping(value = "api/medicalCenter")
public class MedicalCenterController 
{
	@Autowired
	private MedicalCenterService medicalCenterService;
	
	@Autowired
	private MedicalCenterMapper medicalCenterMapper;
	
	
	@GetMapping(value = "/all")
	public ResponseEntity<List<MedicalCenterDTO>> getAllMedicalCenters()
	{
		List<MedicalCenter> medicalCenters = medicalCenterService.findAll();
		
		List<MedicalCenterDTO> medicalCentersDTO = new ArrayList<>();
		
		for(MedicalCenter medCenter : medicalCenters) 
		{
			medicalCentersDTO.add(medicalCenterMapper.toDTO(medCenter));
		}
		
		return new ResponseEntity<>(medicalCentersDTO,HttpStatus.OK);
	}
	
	
	@PostMapping(consumes = "application/json")
	public ResponseEntity<MedicalCenterDTO> saveMedicalCenter(@RequestBody MedicalCenterDTO medicalCenterDTO)
	{
		MedicalCenter medicalCenter = medicalCenterMapper.toMedicalCenter(medicalCenterDTO);
		
		medicalCenter = medicalCenterService.save(medicalCenter);
		
		return new ResponseEntity<>(medicalCenterMapper.toDTO(medicalCenter),HttpStatus.CREATED);
	}
	
	
	
}
