package pe.edu.upc.emprendeya.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.emprendeya.entities.Pregunta;

import java.util.List;

@Repository
public interface IPreguntaRepository extends JpaRepository<Pregunta, Integer> {
    @Query(value = "SELECT e.nombre_emprendedor AS NombreEmprendedor, COUNT(p.id) AS TotalPreguntas\n" +
            "FROM emprendedores e\n" +
            "LEFT JOIN preguntas p ON e.id = p.id_emprendedor\n" +
            "GROUP BY e.id\n" +
            "HAVING COUNT(p.id) > 0\n" +
            "ORDER BY TotalPreguntas ASC\n" +
            "LIMIT 1;", nativeQuery = true)
    List<String[]> getCountPreguntaByEmprendedor();
}
