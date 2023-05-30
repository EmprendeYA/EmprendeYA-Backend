package pe.edu.upc.emprendeya.controllers;


import io.swagger.models.Model;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.emprendeya.entities.User;
import pe.edu.upc.emprendeya.services.IUserService;
import pe.edu.upc.emprendeya.dtos.UserDTO;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private IUserService uS;
    @PostMapping
    public void insert(@RequestBody UserDTO dto){
        ModelMapper m = new ModelMapper();
        User a = m.map(dto,User.class);
        uS.insert(a);
    }
    @GetMapping
    public List<UserDTO>list(){
        return uS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,UserDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/id")
    public void delete(@PathVariable("id")Integer id){
        uS.delete(id);
    }
    @GetMapping("/id")
    public UserDTO listId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        UserDTO dto =m.map(uS.listId(id),UserDTO.class);
        return dto;
    }
    @PutMapping
    public void goUpdate(@RequestBody UserDTO dto){
        ModelMapper m = new ModelMapper();
        User a=m.map(dto, User.class);
        uS.insert(a);
    }
}
