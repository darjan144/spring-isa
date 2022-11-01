package ftn.isa.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import ftn.isa.dto.UserDTO;
import ftn.isa.model.User;


public interface UserService 
{
	Collection<User> findAll();

	User findOne(int id);

	User create(User user) throws Exception;

	User update(User user) throws Exception;

	User delete(int id);

	User updateGreetingText(UserDTO userDTO, int id) throws Exception;

	ArrayList<User> searchGreetings(Optional<String> text);
}
