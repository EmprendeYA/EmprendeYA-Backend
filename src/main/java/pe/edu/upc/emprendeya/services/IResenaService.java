package pe.edu.upc.emprendeya.services;

import pe.edu.upc.emprendeya.dtos.EmprendedorResenaDTO;
import pe.edu.upc.emprendeya.entities.Resena;

import java.util.List;

public interface IResenaService {
    public void insert(Resena resena);
    List<Resena> list();

    void delete(int idResena);
    public Resena listId(int idResena);

    List<EmprendedorResenaDTO> reporte01();
}
