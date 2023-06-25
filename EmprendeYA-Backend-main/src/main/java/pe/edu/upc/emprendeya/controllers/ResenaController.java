package pe.edu.upc.emprendeya.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.emprendeya.dtos.ResenaDTO;
import pe.edu.upc.emprendeya.entities.Resena;
import pe.edu.upc.emprendeya.services.IResenaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/resenas")
public class ResenaController {
    @Autowired
    private IResenaService rS;
    @PostMapping
    public void insert (@RequestBody ResenaDTO dto){
        ModelMapper m=new ModelMapper();
        Resena r=m.map(dto,Resena.class);
        rS.insert(r);
    }

    @GetMapping
    public List<ResenaDTO> list(){
        return rS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,ResenaDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){
        rS.delete(id);
    }
    @GetMapping("/{id}")
    public ResenaDTO listId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        ResenaDTO dto=m.map(rS.listId(id),ResenaDTO.class);
        return dto;
    }
    @PutMapping
    public void goUpdate(@RequestBody ResenaDTO dto){
        ModelMapper m=new ModelMapper();
        Resena r = m.map(dto,Resena.class);
        rS.insert(r);
    }
}
