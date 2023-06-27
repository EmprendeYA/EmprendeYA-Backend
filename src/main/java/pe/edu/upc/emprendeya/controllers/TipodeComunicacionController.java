package pe.edu.upc.emprendeya.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.emprendeya.dtos.TipodeComunicacionDTO;
import pe.edu.upc.emprendeya.dtos.TipodeComunicacionEmprendedorDTO;
import pe.edu.upc.emprendeya.entities.TipodeComunicacion;
import pe.edu.upc.emprendeya.services.TComunicacionServices;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/TipodeComunicacion")

public class TipodeComunicacionController {
    @Autowired
    private TComunicacionServices tS;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void insert(@RequestBody TipodeComunicacionDTO dto) {
        ModelMapper m = new ModelMapper();
        TipodeComunicacion t = m.map(dto, TipodeComunicacion.class);
        tS.insert(t);


    }

    @GetMapping
    public List<TipodeComunicacionDTO> LIST() {
        return tS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, TipodeComunicacionDTO.class);

        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void delete (@PathVariable("id")Integer id){
        tS.delete(id);

    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public TipodeComunicacionDTO listId(@PathVariable("id")Integer id) {
        ModelMapper m = new ModelMapper();
        TipodeComunicacionDTO dto = m.map(tS.listId(id), TipodeComunicacionDTO.class);
        return dto;
    }
    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void goUpdate(@RequestBody TipodeComunicacionDTO dto){
        ModelMapper m=new ModelMapper();
        TipodeComunicacion t=m.map(dto,TipodeComunicacion.class);
        tS.insert(t);
    }

    @GetMapping("/tipodecomunicacion-count")
    public List<TipodeComunicacionEmprendedorDTO> getTipodeComunicacionCountByEmprendedor() {
        List<TipodeComunicacionEmprendedorDTO> emprendedorTipodeComunicacionDTOs = tS.reporte04();
        return emprendedorTipodeComunicacionDTOs;
    }

}
