package ftn.isa.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ftn.isa.dto.UserDTO;
import ftn.isa.mappers.UserMapper;
import ftn.isa.model.User;
import ftn.isa.service.UserService;


@RestController
@RequestMapping("api/user")
public class UserController 
{
	@Autowired
	private UserService userService;
	@Autowired
	private UserMapper userMapper;
	
	/*
	 * Get all users
	 *
	 * url: /api/user GET
	 */
	
	@GetMapping(value="/all",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<UserDTO>> getAllUsers()
	{	
		List<User> users = userService.findAll();
		List<UserDTO> usersDTO = new ArrayList<>();
		
		for(User user : users) 
		{
			usersDTO.add(new UserDTO(user));
		}
		
		return new ResponseEntity<>(usersDTO, HttpStatus.OK);
	}
	
	
	/*
	 * U viticastim zagradama se navodi promenljivi deo putanje.
	 * 
	 * url: /api/users/1 GET
	 */

	@GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UserDTO> getUser(@PathVariable("id")Long id)
	{
		User user = userService.findOne(id);
		
		if(user == null)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(new UserDTO(user),HttpStatus.OK);
	}
	
	/*
	 *	Create new user
	 * 
	 * url: /api/users POST
	 */
	

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO)
	{
		User user = userMapper.toUser(userDTO);
		
		userService.save(user);
		
		return new ResponseEntity<>(userMapper.toDTO(user),HttpStatus.CREATED);
	}
					
	/*
	 * url: PUT /api/users/1
	 */

	@PutMapping(value="/{id}",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> updateUser(@RequestBody User user)
	{
		User userForUpdate = userService.findOne(user.getId());	
		User updatedUser = null;
		
		try 
		{
			updatedUser = userService.save(userForUpdate);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
		
		if(updatedUser ==null) 
		{
				return new ResponseEntity<User>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<User>(updatedUser,HttpStatus.OK);
	}
	
	

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<User> deleteUser(@PathVariable("id") Long id)
	{
		User userToDelete = userService.findOne(id);
		
		if(userToDelete!=null) 
		{
			userService.remove(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		else 
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}							
	}
}
