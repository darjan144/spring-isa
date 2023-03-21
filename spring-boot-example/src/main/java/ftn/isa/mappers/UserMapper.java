package ftn.isa.mappers;

import org.springframework.stereotype.Component;

import ftn.isa.dto.UserDTO;
import ftn.isa.model.Address;
import ftn.isa.model.PersonalInfo;
import ftn.isa.model.User;

@Component
public class UserMapper 
{
	
	public UserDTO toDTO(User user) 
	{
		return new UserDTO(user.getEmail(),
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
	public User toUser(UserDTO userDTO) 
	{
		return new User(
				userDTO.getEmail(),
					new PersonalInfo(userDTO.getFirstName(),userDTO.getLastName(),userDTO.getPid(),
							new Address(userDTO.getLocation(),userDTO.getCity(),userDTO.getCountry()),userDTO.getGender(),
									 userDTO.getPhoneNumber(),userDTO.getPlaceOfEmployment())				
				);

	}
}
