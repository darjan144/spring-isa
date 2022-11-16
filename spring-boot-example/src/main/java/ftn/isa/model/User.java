package ftn.isa.model;


import static javax.persistence.DiscriminatorType.STRING;
import static javax.persistence.InheritanceType.SINGLE_TABLE;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;

import ftn.isa.model.Enums.RoleENUM;

@Entity
@Inheritance(strategy = SINGLE_TABLE)
@DiscriminatorColumn(name="roleName",discriminatorType=STRING)
@Table(name="\"User\"")
public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "email",unique = true,nullable = false)
	private String email;
	
	@Column(name = "password",unique = true,nullable = false)
	private String password;
	
	@Column(name = "role",nullable = false)
	private RoleENUM role;
	
	@Embedded
	private PersonalInfo personalInfo;
	
	@Column(name = "createdAt", nullable = false)
	private Date createdAt;
	
	@Column(name = "updatedAt", nullable = false)
	private Date updatedAt;

	
	public User() 
	{
		
	}
	
	public User(Long id, String email, String password, RoleENUM role, PersonalInfo personalInfo, Date createdAt,
			Date updatedAt) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.role = role;
		this.personalInfo = personalInfo;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}


	public Long getId() 
	{
		return id;
	}
	
	public void setId(Long id) 
	{
		this.id = id;
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

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
}



