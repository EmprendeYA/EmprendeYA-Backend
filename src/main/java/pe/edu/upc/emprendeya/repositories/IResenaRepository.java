package pe.edu.upc.emprendeya.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.emprendeya.entities.Resena;

import java.util.List;

@Repository
public interface IResenaRepository extends JpaRepository<Resena,Integer> {




}
