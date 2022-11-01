package ftn.isa.repository;

import java.util.Collection;
import ftn.isa.model.User;

public interface UserRepository 
{
	Collection<User> findAll();

	User create(User user);

	User findOne(Long id);
	
	User update(User user);

	User delete(int id);	
}
