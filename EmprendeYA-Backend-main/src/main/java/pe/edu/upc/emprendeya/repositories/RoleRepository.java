package pe.edu.upc.emprendeya.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.emprendeya.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
