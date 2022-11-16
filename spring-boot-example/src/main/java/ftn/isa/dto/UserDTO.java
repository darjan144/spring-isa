package ftn.isa.dto;

import java.util.Date;

import ftn.isa.model.Address;
import ftn.isa.model.PersonalInfo;
import ftn.isa.model.User;
import ftn.isa.model.Enums.GenderENUM;
import ftn.isa.model.Enums.RoleENUM;

public class UserDTO 
{
	private Long id;
	private String email;
	//dont use password inside DTO,use only in userCreationDTO,update later
	private String password;
	private RoleENUM role;
	
	//personalInfo fields
	private String firstName;
	private String lastName;
	private String pid;	
	
	//address fields inside personalInfo
	private String location;
	private String city;
	private String country;
	
	private GenderENUM gender;
	private String phoneNumber;
	private String placeOfEmployment;
	
	private Date createdAt;
	private Date updatedAt;
	
	public UserDTO() 
	{
		
	}
	
	
	public UserDTO(User user)
	{
		this(user.getId(),user.getEmail(),
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
	
	

	public UserDTO(Long id, String email, String password, RoleENUM role, String firstName, String lastName, String pid,
			String location, String city, String country, GenderENUM gender, String phoneNumber,
			String placeOfEmployment, Date createdAt, Date updatedAt) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.role = role;
		this.firstName = firstName;
		this.lastName = lastName;
		this.pid = pid;
		this.location = location;
		this.city = city;
		this.country = country;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.placeOfEmployment = placeOfEmployment;
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

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPid() {
		return pid;
	}

	public String getLocation() {
		return location;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}

	public GenderENUM getGender() {
		return gender;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getPlaceOfEmployment() {
		return placeOfEmployment;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}
	
	
	
}
