package pe.edu.upc.emprendeya.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.emprendeya.entities.TipodeComunicacion;

import java.util.List;

@Repository
public interface TComunicacionRepository extends JpaRepository<TipodeComunicacion,Integer>{
    @Query(value="SELECT b.id_emprendedor, count(c.nametc) from TipodeComunicacion t \n"  +
            "join Emprendedor b on  c.nametc= b.id_emprendedor \n" +
            " group by b.nametc ORDER BY COUNT (b.id_emprendedor) ASC", nativeQuery = true)
    List<String[]> getCountTipodeComunicacionByEmprendedor();

}
