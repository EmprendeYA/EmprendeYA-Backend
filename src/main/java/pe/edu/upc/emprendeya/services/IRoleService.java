package pe.edu.upc.emprendeya.services;


import pe.edu.upc.emprendeya.entities.Role;

import java.util.List;



public interface IRoleService {
    public void insert(Role role);

    List<Role> list();

}

