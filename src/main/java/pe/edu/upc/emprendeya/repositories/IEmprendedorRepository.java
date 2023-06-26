package pe.edu.upc.emprendeya.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.emprendeya.entities.Emprendedor;

import java.util.List;

@Repository
public interface IEmprendedorRepository extends JpaRepository<Emprendedor,Integer> {
    @Query(value = "SELECT b.name_benefactor,count(b.id) from emprendedores e \n" +
            "            join benefactors b on  e.id_benefactor = b.id\n" +
            "            group by b.name_benefactor ORDER BY COUNT(b.id) DESC", nativeQuery = true)
    List<String[]> getCountEmprendedorByBenefactor();

    @Query(value = "SELECT b.name_benefactor, e.nombre_emprendedor, e.apellido_emprendedor, e.edad_emprendedor\n" +
            "FROM benefactors b\n" +
            "INNER JOIN emprendedores e ON b.id = e.id\n" +
            "WHERE e.edad_emprendedor BETWEEN 20 AND 30\n" +
            "ORDER BY b.name_benefactor ASC, e.apellido_emprendedor ASC;", nativeQuery = true)
    List<String[]> getEmpreByAgeAndBenefactor();

    @Query(value = "SELECT * FROM emprendedores\n" +
            "ORDER BY edad_emprendedor ASC", nativeQuery = true)
    List<String[]> getordenarempre();

    @Query(value = "SELECT a.rubro_emprendedor,count(b.nombre_emprendedor) from emprendedor a \n" +
            "join emprendedor a on  b.nombre_emprendedor = a.nombre_emprendedor \n" , nativeQuery = true)
    List<String[]> getCountEmprendedorByRubro();


}
