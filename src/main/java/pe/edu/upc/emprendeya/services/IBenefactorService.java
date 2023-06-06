package pe.edu.upc.emprendeya.services;

import pe.edu.upc.emprendeya.entities.Benefactor;

import java.util.List;

public interface IBenefactorService {
    public void insert(Benefactor Benefactor);
    List<Benefactor> list();
    public void delete (int idBenefactor);
    public Benefactor listId(int idBenefactor);
}
