package pe.edu.upc.emprendeya.servicesImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.emprendeya.dtos.EmprendedorEdadBenefactorDTO;
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
  public List<EmprendedorEdadBenefactorDTO> reporte02() {
    List<String[]> emprendedorBenefactorData = eR.getEmpreByAgeAndBenefactor();
    List<EmprendedorEdadBenefactorDTO> emprendedorEdadBenefactorDTOList = new ArrayList<>();

    for (String[] data : emprendedorBenefactorData) {
      EmprendedorEdadBenefactorDTO dto = new EmprendedorEdadBenefactorDTO();
      dto.setNameBenefactor((String) data[0]);
      dto.setNombreEmprendedor((String) data[1]);
      dto.setApellidoEmprendedor((String) data[2]);
      dto.setEdadEmprendedor(Integer.parseInt(data[3]));
      emprendedorEdadBenefactorDTOList.add(dto);
    }

    return emprendedorEdadBenefactorDTOList;
  }

}
