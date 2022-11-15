package ftn.isa.dto;

import java.util.Date;

import ftn.isa.model.PersonalInfo;
import ftn.isa.model.User;
import ftn.isa.model.Enums.RoleENUM;

public class UserDTO 
{
	private Long id;
	private String email;
	private String password;
	private RoleENUM role;
	private PersonalInfo personalInfo;
	private Date createdAt;
	private Date updatedAt;
	
	public UserDTO() 
	{
		
	}
	
	public UserDTO(User user) 
	{
		this(user.getId(),user.getEmail(),user.getPassword(),user.getRole(),user.getPersonalInfo(),user.getCreatedAt(),user.getUpdatedAt());
	}
	

	public UserDTO(Long id, String email, String password, RoleENUM role, PersonalInfo personalInfo, Date createdAt, Date updatedAt) 
	{		
		this.id = id;
		this.email = email;
		this.password = password;
		this.role = role;
		this.personalInfo = personalInfo;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}


	public Long getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public RoleENUM getRole() {
		return role;
	}

	public PersonalInfo getPersonalInfo() {
		return personalInfo;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}
	


	
	
}
