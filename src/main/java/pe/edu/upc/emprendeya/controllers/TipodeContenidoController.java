package pe.edu.upc.emprendeya.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.emprendeya.dtos.TipodeContenidoDTO;
import pe.edu.upc.emprendeya.entities.TipodeContenido;
import pe.edu.upc.emprendeya.services.TContenidoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/TipodeContenido")
public class TipodeContenidoController {
    @Autowired
    private TContenidoService tS;

    @PostMapping
    public void insert(@RequestBody TipodeContenidoDTO dto) {
        ModelMapper m = new ModelMapper();
        TipodeContenido t = m.map(dto, TipodeContenido.class);
        tS.insert(t);


    }

    @GetMapping
    public List<TipodeContenidoDTO> LIST() {
        return tS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, TipodeContenidoDTO.class);

        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{idTipodeContenido}")
    public void delete (@PathVariable("idTipodeContenido")Integer id){
        tS.delete(id);

    }

    @GetMapping("/{idTipodeContenido}")
    public TipodeContenidoDTO listId(@PathVariable("idTipodeContenido")Integer id) {
        ModelMapper m = new ModelMapper();
        TipodeContenidoDTO dto = m.map(tS.listId(id), TipodeContenidoDTO.class);
        return dto;
    }
    @PutMapping
    public void goUpdate(@RequestBody TipodeContenidoDTO dto){
        ModelMapper m=new ModelMapper();
        TipodeContenido t=m.map(dto,TipodeContenido.class);
        tS.insert(t);
    }
}