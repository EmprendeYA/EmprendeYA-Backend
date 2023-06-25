package pe.edu.upc.emprendeya.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.emprendeya.entities.TipodeContenido;

import java.util.List;

@Repository
public interface TContenidoRepository extends JpaRepository<TipodeContenido,Integer> {


    @Query(value = "SELECT e.* FROM emprendedores e\n" +
            "INNER JOIN tipode_contenido t ON e.id = t.id_emprendedor \n"+
            "GROUP BY e.id ORDER BY COUNT(t.id_emprendedor) DESC LIMIT 1;\n", nativeQuery = true)
    List<String[]> getempren_mayortc();

}