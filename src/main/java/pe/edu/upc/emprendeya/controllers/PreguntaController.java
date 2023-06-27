package pe.edu.upc.emprendeya.controllers;

import org.modelmapper.ModelMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.emprendeya.dtos.EmprendedorPreguntaDTO;
import pe.edu.upc.emprendeya.dtos.PreguntaDTO;
import pe.edu.upc.emprendeya.entities.Pregunta;
import pe.edu.upc.emprendeya.services.IPreguntaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/preguntas")
public class PreguntaController {
    @Autowired
    private IPreguntaService pS;
    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void insert (@RequestBody PreguntaDTO dto){
        ModelMapper m=new ModelMapper();
        Pregunta p=m.map(dto, Pregunta.class);
        pS.insert(p);
    }

    @GetMapping
    public List<PreguntaDTO> list(){
        return pS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,PreguntaDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void delete(@PathVariable("id")Integer id){
        pS.delete(id);
    }
    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public PreguntaDTO listId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        PreguntaDTO dto=m.map(pS.listId(id),PreguntaDTO.class);
        return dto;
    }
    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void goUpdate(@RequestBody PreguntaDTO dto){
        ModelMapper m=new ModelMapper();
        Pregunta p = m.map(dto,Pregunta.class);
        pS.insert(p);
    }
    @GetMapping("/preguntas-count")
    public List<EmprendedorPreguntaDTO> getPreguntaCountByEmprendedor(){
        List<EmprendedorPreguntaDTO> EmprendedorPreguntaDTOs = pS.reporte2();
                return EmprendedorPreguntaDTOs;
    }
}
