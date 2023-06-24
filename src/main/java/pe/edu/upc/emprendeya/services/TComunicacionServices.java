package pe.edu.upc.emprendeya.services;

import pe.edu.upc.emprendeya.entities.TipodeComunicacion;

import java.util.List;

public interface TComunicacionServices {
    public void insert(TipodeComunicacion tipodeComunicacion);
    List<TipodeComunicacion>list();
    public void delete(int idTipodeComunicacion);
    public TipodeComunicacion listId(int idTipodeComunicacion);
}


