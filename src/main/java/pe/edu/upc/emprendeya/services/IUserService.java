package pe.edu.upc.emprendeya.services;

import pe.edu.upc.emprendeya.entities.User;

import java.util.List;

public interface IUserService {
    public void insert(User user);
    List<User>list();
    public void delete (int idUser);
    public User listId(int idUser);
}
