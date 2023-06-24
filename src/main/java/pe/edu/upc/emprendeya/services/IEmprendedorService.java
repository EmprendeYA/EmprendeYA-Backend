package pe.edu.upc.emprendeya.services;
import pe.edu.upc.emprendeya.dtos.EmprendedorEdadBenefactorDTO;
import pe.edu.upc.emprendeya.entities.Emprendedor;
import java.util.List;

public interface IEmprendedorService {
  public void insert(Emprendedor emprendedor);
  List<Emprendedor> list();

  void delete(int idemprendedor);
  public Emprendedor listId(int idemprendedor);
  List<EmprendedorEdadBenefactorDTO> reporte02();
}
