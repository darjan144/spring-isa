package ftn.isa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ftn.isa.model.MedicalCenter;
import ftn.isa.repository.MedicalCenterRepository;

@Service
public class MedicalCenterService 
{
	@Autowired
	private MedicalCenterRepository medicalCenterRepository;
	
	public MedicalCenter findOne(Long id) 
	{
		return medicalCenterRepository.findById(id).orElseGet(null);
	}
	
	public List<MedicalCenter> findAll()
	{
		return medicalCenterRepository.findAll();
	}
	
	public MedicalCenter save(MedicalCenter medicalCenter) 
	{
		return medicalCenterRepository.save(medicalCenter);
	}
	
	public void remove(Long id) 
	{
		medicalCenterRepository.deleteById(id);
	}
}
