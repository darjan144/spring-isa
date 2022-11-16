package ftn.isa.mappers;

import org.springframework.stereotype.Component;

import ftn.isa.dto.MedicalCenterDTO;
import ftn.isa.model.Address;
import ftn.isa.model.MedicalCenter;

@Component
public class MedicalCenterMapper 
{

	public MedicalCenterDTO toDTO(MedicalCenter medicalCenter) 
	{
		return new MedicalCenterDTO(medicalCenter.getId(),
				medicalCenter.getName(),
				medicalCenter.getAddress().getLocation(),
				medicalCenter.getAddress().getCity(),
				medicalCenter.getAddress().getCountry(),
				medicalCenter.getDescription(),
				medicalCenter.getAvgRating());	
	}
	
	public MedicalCenter toMedicalCenter(MedicalCenterDTO medicalCenterDTO) 
	{
		return new MedicalCenter(medicalCenterDTO.getId(),medicalCenterDTO.getName(),
					new Address(medicalCenterDTO.getLocation(),medicalCenterDTO.getCity(),
							medicalCenterDTO.getCountry()),
					medicalCenterDTO.getDescription(),medicalCenterDTO.getAvgRating());
	}
}
