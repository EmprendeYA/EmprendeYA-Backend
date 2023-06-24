package pe.edu.upc.emprendeya.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.emprendeya.entities.Emprendedor;

import java.util.List;

@Repository
public interface IEmprendedorRepository extends JpaRepository<Emprendedor,Integer> {
    @Query(value = "SELECT b.name_benefactor, e.nombre_emprendedor, e.apellido_emprendedor, e.edad_emprendedor\n" +
            "FROM benefactors b\n" +
            "INNER JOIN emprendedores e ON b.id = e.id\n" +
            "WHERE e.edad_emprendedor BETWEEN 20 AND 30\n" +
            "ORDER BY b.name_benefactor ASC, e.apellido_emprendedor ASC;", nativeQuery = true)
    List<String[]> getEmpreByAgeAndBenefactor();
}
