package ftn.isa.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import ftn.isa.dto.UserDTO;
import ftn.isa.model.User;
import ftn.isa.repository.InMemoryUserRepository;
import ftn.isa.service.UserService;

public class UserServiceImpl implements UserService
{
	@Autowired
	private InMemoryUserRepository userRepository;
	
	@Override
	public Collection<User> findAll() {
		return null;
	}

	@Override
	public User findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User create(User user) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User update(User user) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUserText(UserDTO userDTO, Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<User> searchUsers(Optional<String> text) {
		// TODO Auto-generated method stub
		return null;
	}
}
