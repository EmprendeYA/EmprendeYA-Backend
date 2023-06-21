package pe.edu.upc.emprendeya.services;

import java.util.List;

import pe.edu.upc.emprendeya.entities.Users;


public interface IUserService {
    public Integer insert(Users user);

    List<Users> list();

}
