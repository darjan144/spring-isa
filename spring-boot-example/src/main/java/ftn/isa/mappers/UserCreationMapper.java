package ftn.isa.mappers;

import org.springframework.stereotype.Component;

import ftn.isa.dto.UserCreationDTO;
import ftn.isa.dto.UserDTO;
import ftn.isa.model.Address;
import ftn.isa.model.PersonalInfo;
import ftn.isa.model.User;
import ftn.isa.model.Enums.RoleENUM;

@Component
public class UserCreationMapper 
{

	public UserCreationDTO toDTO(User user) 
	{
		return new UserCreationDTO(user.getEmail(),
				user.getPassword(),
				user.getRole(),
				user.getPersonalInfo().getFirstName(),
				user.getPersonalInfo().getLastName(),
				user.getPersonalInfo().getPid(),
				user.getPersonalInfo().getAddress().getLocation(),
				user.getPersonalInfo().getAddress().getCity(),
				user.getPersonalInfo().getAddress().getCountry(),
				user.getPersonalInfo().getGender(),
				user.getPersonalInfo().getPhoneNumber(),
				user.getPersonalInfo().getPlaceOfEmployment()
				);
	}
	
	
	//userCreationDTO instead of userDTO
	public User toUser(UserCreationDTO userCreationDTO) 
	{		
		return new User(userCreationDTO.getEmail(),
				userCreationDTO.getPassword(),
				userCreationDTO.getRole(),
				userCreationDTO.getFirstName(),
				userCreationDTO.getLastName(),
				userCreationDTO.getPid(),
				userCreationDTO.getLocation(),
				userCreationDTO.getCity(),
				userCreationDTO.getCountry(),
				userCreationDTO.getGender(),
				userCreationDTO.getPhoneNumber(),
				userCreationDTO.getPlaceOfEmployment());
		

	}
	
}
