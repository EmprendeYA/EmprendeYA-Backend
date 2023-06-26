package pe.edu.upc.emprendeya.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.emprendeya.entities.Resena;

import java.util.List;

@Repository
public interface IResenaRepository extends JpaRepository<Resena,Integer> {

    @Query(value = "SELECT e.nombre_Emprendedor, COUNT(r.id) AS cantidad_resenas\n" +
            "FROM emprendedores e\n" +
            "LEFT JOIN resenas r ON e.id = r.id_Emprendedor\n" +
            "GROUP BY e.id, e.nombre_Emprendedor\n" +
            "HAVING COUNT(r.id) >= 1", nativeQuery = true)
    List<String[]> getCountResenaByEmprendedor();
}
