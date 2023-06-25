package pe.edu.upc.emprendeya.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.emprendeya.entities.Emprendedor;

import java.util.List;

@Repository
public interface IEmprendedorRepository extends JpaRepository<Emprendedor,Integer> {

    @Query(value = "SELECT * FROM emprendedores\n" +
            "ORDER BY edad_emprendedor ASC", nativeQuery = true)
    List<String[]> getordenarempre();


}
