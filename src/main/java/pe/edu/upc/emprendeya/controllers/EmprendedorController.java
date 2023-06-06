package pe.edu.upc.emprendeya.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.emprendeya.dtos.EmprendedorDTO;
import pe.edu.upc.emprendeya.entities.Emprendedor;
import pe.edu.upc.emprendeya.services.IEmprendedorService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/emprendedores")
public class EmprendedorController  {

  @Autowired
  private IEmprendedorService eS;

  @PostMapping
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
  public void delete(@PathVariable("id")Integer id){
    eS.delete(id);
  }
  @GetMapping("/{id}")
  public EmprendedorDTO listId(@PathVariable("id")Integer id){
    ModelMapper m= new ModelMapper();
    EmprendedorDTO dto=m.map(eS.listId(id),EmprendedorDTO.class);
    return dto;
  }
  @PutMapping
  public void goUpdate(@RequestBody EmprendedorDTO dto){
    ModelMapper m=new ModelMapper();
    Emprendedor a =m.map(dto,Emprendedor.class);
    eS.insert(a);
  }
}
