package pe.edu.upc.emprendeya.controllers;

import org.modelmapper.ModelMapper;
import org.modelmapper.internal.bytebuddy.matcher.ModifierMatcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.emprendeya.dtos.TipodeComunicacionDTO;
import pe.edu.upc.emprendeya.entities.TipodeComunicacion;
import pe.edu.upc.emprendeya.services.TComunicacionServices;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tipodeComunicacion")

public class TipodeComunicacionController {
    @Autowired
    private TComunicacionServices tS;

    @PostMapping
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
    public void delete (@PathVariable("id")Integer id){
        tS.delete(id);

    }

    @GetMapping("/{id}")
    public TipodeComunicacionDTO listId(@PathVariable("id")Integer id) {
        ModelMapper m = new ModelMapper();
        TipodeComunicacionDTO dto = m.map(tS.listId(id), TipodeComunicacionDTO.class);
        return dto;
    }
    @PutMapping
    public void goUpdate(@RequestBody TipodeComunicacionDTO dto){
        ModelMapper m=new ModelMapper();
        TipodeComunicacion t=m.map(dto,TipodeComunicacion.class);

    }
}
