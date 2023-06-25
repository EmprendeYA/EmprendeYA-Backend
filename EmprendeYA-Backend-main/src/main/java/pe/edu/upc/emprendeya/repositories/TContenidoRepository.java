package pe.edu.upc.emprendeya.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.emprendeya.entities.TipodeContenido;

import java.util.List;

@Repository
public interface TContenidoRepository extends JpaRepository<TipodeContenido,Integer> {
    @Query(value = "SELECT a.nombre_emprendedor,count(b.id_tipode_contenido) from tipode_contenido b \n" +
            "Join emprendedores a on  b.id_emprendedor = a.id \n" +
            "group by a.nombre_emprendedor ORDER BY COUNT(a.nombre_emprendedor) DESC", nativeQuery = true)
    List<String[]> getCountTipodeContenidoByEmprendedores();

    @Query("SELECT COUNT(p) FROM TipodeContenido p")
    Long cantidad();

}



