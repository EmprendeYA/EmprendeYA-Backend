package pe.edu.upc.emprendeya.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.emprendeya.dtos.*;
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
  public List<BenefactorEmprendedorDTO> reporte01() {

    List<String[]> countEmprendedorByBenefactor = eR.getCountEmprendedorByBenefactor();
    List<BenefactorEmprendedorDTO> emprendedorBenefactorDTOs = new ArrayList<>();

    for (String[] data : countEmprendedorByBenefactor) {
      BenefactorEmprendedorDTO dto = new BenefactorEmprendedorDTO();
      dto.setNameBenefactor(data[0]);
      dto.setEmprendedorCount(Integer.parseInt(data[1]));
      emprendedorBenefactorDTOs.add(dto);
    }

    return emprendedorBenefactorDTOs;

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

  @Override
  public List<RubroEmprendedorDTO> reporte03() {

    List<String[]> countEmprendedorByRubro = eR.getCountEmprendedorByRubro();
    List<RubroEmprendedorDTO> emprendedorrubroDTOs = new ArrayList<>();

    for (String[] data : countEmprendedorByRubro) {
      RubroEmprendedorDTO dto = new RubroEmprendedorDTO();
      dto.setrubroemprendedor(data[0]);
      dto.setemprendedorCount(Integer.parseInt(data[1]));
      emprendedorrubroDTOs.add(dto);
    }

    return emprendedorrubroDTOs;

  }
}
