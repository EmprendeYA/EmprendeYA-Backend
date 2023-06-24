package pe.edu.upc.emprendeya.dtos;

import pe.edu.upc.emprendeya.entities.Role;

import java.util.List;

public class UserDTO {
    private Long id;

    private String username;

    private String password;
    private Boolean enabled;

    private List<Role> roles;
}
