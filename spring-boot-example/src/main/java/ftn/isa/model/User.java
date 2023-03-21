package ftn.isa.model;


import static javax.persistence.DiscriminatorType.STRING;
import static javax.persistence.InheritanceType.SINGLE_TABLE;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;

import ftn.isa.model.Enums.GenderENUM;
import ftn.isa.model.Enums.RoleENUM;

@Entity
@Inheritance(strategy = SINGLE_TABLE)
@DiscriminatorColumn(name="roleName",discriminatorType=STRING)
@Table(name="registeredUsers")
public class User implements UserDetails
{

	private static final long serialVersionUID = 1L;

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "email",unique = true,nullable = false)
	private String email;
	
	@JsonIgnore
	@Column(name = "password",unique = true,nullable = false)
	private String password;
	
	@Column(name = "role",nullable = false)
	private RoleENUM role;
	
	@Embedded
	private PersonalInfo personalInfo;
	
	@Column(name = "createdAt", nullable = true)
	private Date createdAt;
	
	@Column(name = "updatedAt", nullable = true)
	private Date updatedAt;
	
	@Column(name="enabled")
	private boolean enabled;
	
	@Column(name="last_password_reset_date")
	private Timestamp lastPasswordResetDate;



	public User() 
	{
		
	}
	
	public User(String email, String password, RoleENUM role, PersonalInfo personalInfo) {
		super();
		this.email = email;
		this.password = password;
		this.role = role;
		this.personalInfo = personalInfo;
	}
	
	//userCreation
	public User(String email,
			String password, 
			RoleENUM role, 
			String firstName,
			String lastName,
			String pid,
			String location,
			String city,
			String country,
			GenderENUM gender,
			String phoneNumber,
			String placeOfEmployment) 
	{
		super();
		this.email = email;
		this.password = password;
		this.role = role;
		
		this.personalInfo = new PersonalInfo(firstName,lastName,pid,
				new Address(location,city,country),gender,phoneNumber,placeOfEmployment);
	}
	
	
	public User(String email, PersonalInfo personalInfo) {
		super();
		this.email = email;
		this.personalInfo = personalInfo;
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
		Timestamp now = new Timestamp(new Date().getTime());
		this.setLastPasswordResetDate(now);
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
	
	public Timestamp getLastPasswordResetDate() {
		return lastPasswordResetDate;
	}

	public void setLastPasswordResetDate(Timestamp lastPasswordResetDate) {
		this.lastPasswordResetDate = lastPasswordResetDate;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	@JsonIgnore
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return List.of(new SimpleGrantedAuthority(role.name()));
	}

	@Override
	public boolean isEnabled() {
		return enabled;
	}
	
	@JsonIgnore
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@JsonIgnore
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@JsonIgnore
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public String getUsername() {
		return email;
	}
}



