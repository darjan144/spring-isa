package ftn.isa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ftn.isa.model.User;
import ftn.isa.repository.UserRepository;

@Service
public class UserService 
{
	@Autowired
	private UserRepository userRepository;
	
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
		return userRepository.save(user);
	}
	
	public void remove(Long id) 
	{
		userRepository.deleteById(id);
	}	
}
