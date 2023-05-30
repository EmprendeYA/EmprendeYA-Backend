package pe.edu.upc.emprendeya.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.emprendeya.entities.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer>{
}
