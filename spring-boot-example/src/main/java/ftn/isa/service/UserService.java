package ftn.isa.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import ftn.isa.model.MedicalStaff;
import ftn.isa.model.Patient;
import ftn.isa.model.SystemAdmin;
import ftn.isa.model.User;
import ftn.isa.model.Enums.RoleENUM;
import ftn.isa.repository.UserRepository;

@Service
public class UserService implements UserDetailsService
{
	@Autowired
	private UserRepository userRepository;
	
	@Autowired 
	PasswordEncoder passwordEncoder;
	
	public User findOne(Long id) 
	{
		return userRepository.findById(id).orElseGet(null);
	}
	
	public List<User> findAll()
	{
		return userRepository.findAll();
	}
	
	public User save(User user) 
	{	
		if(user.getCreatedAt()==null) 
		{
			user.setCreatedAt(new Date());
		}
		
		user.setUpdatedAt(new Date());
		
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		
		//how do I differentiate between roles here?
		//for example how do I register medicalStaff?
		//is it to define another endpoint where
		//admin registers medicalStaff?
		user.setRole(RoleENUM.Patient);
		
		
		
		
		return userRepository.save(user);
	}
	
	public void remove(Long id) 
	{
		userRepository.deleteById(id);
	}	
	
	//do I need these 3 methods
	public Patient save(Patient patient) 
	{
		if(patient.getCreatedAt() == null) 
		{
			patient.setCreatedAt(new Date());
		}
		
		patient.setUpdatedAt(new Date());
		
		
		return userRepository.save(patient);
	}
	
	//define another endpoint only usable by admin who registers medicalStaff?
	public MedicalStaff save(MedicalStaff medicalStaff) 
	{
		if(medicalStaff.getCreatedAt() == null) 
		{
			medicalStaff.setCreatedAt(new Date());
		}
		
		medicalStaff.setUpdatedAt(new Date());
		
		
		return userRepository.save(medicalStaff);
	}
	
	public SystemAdmin save(SystemAdmin systemAdmin) 
	{
		
		if(systemAdmin.getCreatedAt() == null) 
		{
			systemAdmin.setCreatedAt(new Date());
		}
		
		systemAdmin.setUpdatedAt(new Date());
		
		return userRepository.save(systemAdmin);
	}

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		User user = userRepository.findByEmail(email);
		
		if(user==null) {
			throw new UsernameNotFoundException(String.format("No user found with email '%s'.",email));
		}else {
			return user;
		}
	}
}
