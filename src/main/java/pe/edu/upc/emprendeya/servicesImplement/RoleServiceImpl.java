package pe.edu.upc.emprendeya.servicesimplements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.emprendeya.entities.Role;
import pe.edu.upc.emprendeya.repositories.RoleRepository;
import pe.edu.upc.emprendeya.services.IRoleService;


@Service
public class RoleServiceImpl implements IRoleService {
    @Autowired
    private RoleRepository rR;

    @Override
    public void insert(Role role) {
        rR.save(role);
    }

    @Override
    public List<Role> list() {
        // TODO Auto-generated method stub
        return rR.findAll();
    }
}
