package pe.edu.upc.emprendeya.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.emprendeya.dtos.EmprendedorDTO;
import pe.edu.upc.emprendeya.dtos.resenaDTO;
import pe.edu.upc.emprendeya.entities.Emprendedor;
import pe.edu.upc.emprendeya.entities.resena;
import pe.edu.upc.emprendeya.services.IResenaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/resena")
public class ResenaController {

  @Autowired
  private IResenaService rS;

  @PostMapping
  public void insert(@RequestBody resenaDTO dto) {
    ModelMapper m = new ModelMapper();
    resena e = m.map(dto, resena.class);
    rS.insertar(e);
  }

  @PutMapping
  public void goUpdate(@RequestBody resenaDTO dto){
    ModelMapper m=new ModelMapper();
    resena a =m.map(dto,resena.class);
    rS.insertar(a);
  }
  @DeleteMapping("/{id}")
  public void delete(@PathVariable("id")Integer id){
    rS.eliminar(id);
  }


  @GetMapping("/{id}")
  public resenaDTO listId(@PathVariable("id")Integer id){
    ModelMapper m= new ModelMapper();
    resenaDTO dto=m.map(rS.listarId(id),resenaDTO.class);
    return dto;
  }
  @GetMapping
  public List<resenaDTO> list(){
    return rS.listar().stream().map(x-> {
      ModelMapper m = new ModelMapper();
      return m.map(x, resenaDTO.class);
    }).collect(Collectors.toList());
  }

}
