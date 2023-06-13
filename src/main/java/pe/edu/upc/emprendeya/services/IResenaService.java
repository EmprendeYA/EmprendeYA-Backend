package pe.edu.upc.emprendeya.services;

import pe.edu.upc.emprendeya.entities.resena;

import java.util.List;

public interface IResenaService {
  public void insert(resena Resena);
  void delete(int idresena);
  public resena listId(int idresena);
  List<resena> list();
}
