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
		return new UserDTO(user.getId(),user.getEmail(),
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
				user.getPersonalInfo().getPlaceOfEmployment(),
				user.getCreatedAt(),
				user.getUpdatedAt());
		
	}
	
	
	//userCreationDTO instead of userDTO
	public User toUser(UserDTO userDTO) 
	{
		return new User(userDTO.getId(),
				userDTO.getEmail(),
				userDTO.getPassword(),
				userDTO.getRole(),
					new PersonalInfo(userDTO.getFirstName(),userDTO.getLastName(),userDTO.getPid(),
							new Address(userDTO.getLocation(),userDTO.getCity(),userDTO.getCountry()),userDTO.getGender(),
									 userDTO.getPhoneNumber(),userDTO.getPlaceOfEmployment()), userDTO.getCreatedAt(), userDTO.getUpdatedAt()				
				);

	}
}
