package ftn.isa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ftn.isa.model.User;
import ftn.isa.model.Enums.RoleENUM;

public interface UserRepository extends JpaRepository<User,Long>
{
	@Query("select user from User user where user.personalInfo.pid=?1")
	public User findByPid(String pid);
	
	@Query("select user from User user where user.email=?1")
	public User findByEmail(String email);
	
}
