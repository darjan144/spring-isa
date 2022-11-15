package ftn.isa.controller;

import java.util.Collection;

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

import ftn.isa.model.User;
import ftn.isa.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

//CRUD IS DONE HERE??

@Tag(name = "User controller", description = "The User API")
@RestController
@RequestMapping("/api/users")
public class UserController 
{
	@Autowired
	private UserService userService;
	
	/*
	 * Get all users
	 *
	 * url: /api/user GET
	 */
	
	@Operation(summary = "Get all users", description = "Get all users", method="GET")
	@ApiResponses(value = {
			@ApiResponse(responseCode="200", description = "Successful operation",
					content = @Content(mediaType="application/json",
					array = @ArraySchema(schema=@Schema(implementation=User.class))))
	})
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<User>> getUsers()
	{	
		Collection<User> users = userService.findAll();
		return new ResponseEntity<Collection<User>>(users,HttpStatus.OK);
	}
	
	
	/*
	 * U viticastim zagradama se navodi promenljivi deo putanje.
	 * 
	 * url: /api/users/1 GET
	 */
	@Operation(summary = "Get user by id", description = "Get greeting by id", method = "GET")
	@ApiResponses(value = {
			@ApiResponse(responseCode="200", description = "found user by id",
					content = @Content(mediaType = "application/json",
					schema = @Schema(implementation = User.class))),
			@ApiResponse(responseCode="404",description = "user not found", content = @Content)												
	})
	@GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> getUser(@Parameter(name="id",description ="ID of a user to return",required = true)@PathVariable("id")int id)
	{
		//User user = userService.findOne(id); //implement this method??
		
		User user = null;
		
		if(user == null) 
		{
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	
	/*
	 *	Create new user
	 * 
	 * url: /api/users POST
	 */
	
	@Operation(summary = "Create new user", description = "Create new user",method = "POST")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "201",description = "Created",content = {@Content(mediaType = "application/json",schema = @Schema(implementation = User.class)) }),
			
			@ApiResponse(responseCode = "409",description = "Not possible to create new user when given id not null",content = @Content)
			
	})
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> createUser(@RequestBody User user)
	{
		User savedUser = null;
		
		try 
		{
			savedUser = userService.save(user);
			return new ResponseEntity<User>(savedUser, HttpStatus.CREATED);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return new ResponseEntity<User>(savedUser,HttpStatus.CONFLICT);
		}
	}
		
	
	/*
	 * url: PUT /api/users/1
	 */
	@Operation(summary = "Update an existing user", description = "Update an existing user")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200",description = "User successfully edit",
					content = {@Content(mediaType = "application/json",schema = @Schema(implementation = User.class)) }
						),
			@ApiResponse(responseCode = "404", description = "User not found",content = @Content),
			@ApiResponse(responseCode="500",description = "Internal server error",content = @Content)
	})
	@PutMapping(value="/{id}",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> updateUser(@RequestBody User user)
	{
		User userForUpdate = userService.findOne(user.getId());
		//userForUpdate.copyValues(user); UPDATE THIS IN THE MODEL??
		
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
	
	
	@Operation(summary = "Deletes a user",description = "Deletes a user", method = "DELETE")
	@ApiResponses(value = {
			@ApiResponse(responseCode="404",description = "User not found", content = @Content),
			@ApiResponse(responseCode = "204",description = "User successfully deleted",content = @Content)
	})
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<User> deleteUser(@Parameter(description = "Getting id to delete",required=true) @PathVariable("id") Long id)
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
