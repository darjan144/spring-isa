package ftn.isa.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

@Tag(name = "User controller", description = "The User API")
@RestController
@RequestMapping("/api/user")
public class UserController 
{
	@Autowired
	private UserService userService;
	
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
	 * 
	 * 	
	@Operation(summary = "Get greeting by id", description = "Get greeting by id", method="GET")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "found greeting by id",
					content = @Content(mediaType = "application/json", schema = @Schema(implementation = Greeting.class))),
			@ApiResponse(responseCode = "404", description = "greeting not found", content = @Content)
	})
	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Greeting> getGreeting(@Parameter(name="id", description = "ID of a greeting to return", required = true) @PathVariable("id") Long id) {
		Greeting greeting = greetingService.findOne(id);

		if (greeting == null) {
			return new ResponseEntity<Greeting>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Greeting>(greeting, HttpStatus.OK);
	} 
	 * */
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
		User user = userService.findOne(id);
		
		if(user == null) 
		{
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	
	
	
	
	
	
	
}
