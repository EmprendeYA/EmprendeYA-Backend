package pe.edu.upc.emprendeya.controllers;

import org.modelmapper.ModelMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.emprendeya.dtos.BenefactorDTO;
import pe.edu.upc.emprendeya.entities.Benefactor;
import pe.edu.upc.emprendeya.services.IBenefactorService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/benefactors")
public class BenefactorController {
    @Autowired
    private IBenefactorService bS;
    @PostMapping
    public void insert (@RequestBody BenefactorDTO dto){
        ModelMapper m=new ModelMapper();
        Benefactor b=m.map(dto,Benefactor.class);
        bS.insert(b);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){
        bS.delete(id);
    }
    @GetMapping("/{id}")
    public BenefactorDTO listId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        BenefactorDTO dto=m.map(bS.listId(id),BenefactorDTO.class);
        return dto;
    }
    @PutMapping
    public void goUpdate(@RequestBody BenefactorDTO dto){
        ModelMapper m=new ModelMapper();
        Benefactor b = m.map(dto,Benefactor.class);
        bS.insert(b);
    }
    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<BenefactorDTO> list() {
        return bS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,BenefactorDTO.class);

        }).collect(Collectors.toList());
    }
}
