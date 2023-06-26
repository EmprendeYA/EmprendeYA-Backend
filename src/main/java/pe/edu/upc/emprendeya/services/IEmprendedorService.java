package pe.edu.upc.emprendeya.services;

import pe.edu.upc.emprendeya.dtos.BenefactorEmprendedorDTO;
import pe.edu.upc.emprendeya.dtos.EmprendedorDTO;
import pe.edu.upc.emprendeya.dtos.EmprendedorEdadBenefactorDTO;
import pe.edu.upc.emprendeya.dtos.RubroEmprendedorDTO;
import pe.edu.upc.emprendeya.entities.Emprendedor;
import java.util.List;

public interface IEmprendedorService {
  public void insert(Emprendedor emprendedor);
  List<Emprendedor> list();

  void delete(int idemprendedor);
  public Emprendedor listId(int idemprendedor);

  public List<BenefactorEmprendedorDTO> reporte01();
  List<EmprendedorEdadBenefactorDTO> reporte02();

  public List<EmprendedorDTO> reporte08();

  public List<RubroEmprendedorDTO> reporte03();


}
