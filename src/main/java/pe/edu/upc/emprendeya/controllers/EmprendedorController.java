package pe.edu.upc.emprendeya.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.emprendeya.dtos.*;
import pe.edu.upc.emprendeya.entities.Emprendedor;
import pe.edu.upc.emprendeya.services.IEmprendedorService;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/emprendedor")
public class EmprendedorController  {

  @Autowired
  private IEmprendedorService eS;

  @PostMapping
  @PreAuthorize("hasAuthority('ADMIN')")
  public void insert(@RequestBody EmprendedorDTO dto){
    ModelMapper m= new ModelMapper();
    Emprendedor e=m.map(dto, Emprendedor.class);
    eS.insert(e);

  }
  @GetMapping
  public List<EmprendedorDTO> list(){
    return eS.list().stream().map(x-> {
      ModelMapper m = new ModelMapper();
      return m.map(x, EmprendedorDTO.class);
    }).collect(Collectors.toList());
  }
  @DeleteMapping("/{id}")
  @PreAuthorize("hasAuthority('ADMIN')")
  public void delete(@PathVariable("id")Integer id){
    eS.delete(id);
  }
  @GetMapping("/{id}")
  @PreAuthorize("hasAuthority('ADMIN')")
  public EmprendedorDTO listId(@PathVariable("id")Integer id){
    ModelMapper m= new ModelMapper();
    EmprendedorDTO dto=m.map(eS.listId(id),EmprendedorDTO.class);
    return dto;
  }
  @PutMapping
  @PreAuthorize("hasAuthority('ADMIN')")
  public void goUpdate(@RequestBody EmprendedorDTO dto){
    ModelMapper m=new ModelMapper();
    Emprendedor a =m.map(dto,Emprendedor.class);
    eS.insert(a);
  }

  @GetMapping("/emprendedor-count")
  public List<BenefactorEmprendedorDTO> getEmprendedorCountByBenefactor() {
    List<BenefactorEmprendedorDTO> emprendedorBenefactorDTOs = eS.reporte01();
    return emprendedorBenefactorDTOs;
  }

  @GetMapping("/emprendedores-count")
  public List<EmprendedorEdadBenefactorDTO> getEmpreByAgeAndBenefactor() {
    List<EmprendedorEdadBenefactorDTO> emprendedorEdadBenefactorDTO = eS.reporte02();
    return emprendedorEdadBenefactorDTO;
  }

  @GetMapping("/empren_tc")
  public List<EmprendedorDTO> getempren_edad() {
    List<EmprendedorDTO> EmprendedorDTOS= eS.reporte08();
    return EmprendedorDTOS;
  }
  @GetMapping("/book-count")
  public List<RubroEmprendedorDTO> getCountEmprendedorByRubro() {
    List<RubroEmprendedorDTO> emprendedorRubroDTOs = eS.reporte03();
    return emprendedorRubroDTOs;

  }



}
