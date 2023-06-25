package pe.edu.upc.emprendeya.servicesImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.emprendeya.dtos.EmprendedorDTO;
import pe.edu.upc.emprendeya.dtos.EmprendedorTipoContDTO;
import pe.edu.upc.emprendeya.entities.Emprendedor;
import pe.edu.upc.emprendeya.repositories.IEmprendedorRepository;
import pe.edu.upc.emprendeya.services.IEmprendedorService;

import java.util.ArrayList;
import java.util.List;
@Service

public class EmprendedorServicesImplement implements IEmprendedorService{
  @Autowired
  private IEmprendedorRepository eR;

  @Override
  public void insert(Emprendedor emprendedor) {

    eR.save(emprendedor);
  }

  @Override
  public List<Emprendedor> list() {

    return eR.findAll();
  }
  @Override
  public void delete(int idemprendedor){
    eR.deleteById(idemprendedor);
  }

  @Override
  public Emprendedor listId(int idEmprendedor) {
    return eR.findById(idEmprendedor).orElse(new Emprendedor());
  }

  @Override
  public List<EmprendedorDTO> reporte08() {

    List<String[]> getempre_edad = eR.getordenarempre();
    List<EmprendedorDTO> ORDemprDTOs = new ArrayList<>();

    for (String[] data : getempre_edad) {
      EmprendedorDTO dto = new EmprendedorDTO();
      dto.setId(Integer.parseInt(data[0]));
      dto.setApellidoEmprendedor(data[1]);
      dto.setEdadEmprendedor(Integer.parseInt(data[2]));
      dto.setNombreEmprendedor(data[3]);
      dto.setRubroEmprendedor(data[4]);
      ORDemprDTOs.add(dto);
    }

    return ORDemprDTOs;

  }
}
