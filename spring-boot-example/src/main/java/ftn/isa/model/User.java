package ftn.isa.model;

import ftn.isa.model.Enums.RoleENUM;

public class User 
{
	private int Id;
	private String email;
	private String password;
	private RoleENUM role;
	private PersonalInfo personalInfo;

	
	public int getId() 
	{
		return Id;
	}
	
	public void setId(int id) 
	{
		Id = id;
	}
	
	public String getEmail() 
	{
		return email;
	}
	
	public void setEmail(String email) 
	{
		this.email = email;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}
	
	public RoleENUM getRole() 
	{
		return role;
	}

	public void setRole(RoleENUM role) 
	{
		this.role = role;
	}

	public PersonalInfo getPersonalInfo() {
		return personalInfo;
	}

	public void setPersonalInfo(PersonalInfo personalInfo) {
		this.personalInfo = personalInfo;
	}
}



