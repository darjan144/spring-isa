package ftn.isa.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import ftn.isa.dto.UserDTO;
import ftn.isa.model.User;


public interface UserService 
{
	Collection<User> findAll();

	User findOne(Long id);

	User create(User user) throws Exception;

	User update(User user) throws Exception;

	User delete(Long id);

	User updateUserText(UserDTO userDTO, Long id) throws Exception;

	ArrayList<User> searchUsers(Optional<String> text);
}
