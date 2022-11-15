package ftn.isa.repository;

import java.util.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import ftn.isa.model.User;

public interface UserRepository extends JpaRepository<User,Long>
{

}
