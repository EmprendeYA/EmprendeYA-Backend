package pe.edu.upc.emprendeya.services;

import pe.edu.upc.emprendeya.dtos.EmprendedorTipoContDTO;
import pe.edu.upc.emprendeya.entities.TipodeContenido;

import java.util.List;

public interface TContenidoService {
    public void insert(TipodeContenido TipodeContenido);
    List<TipodeContenido> list();
    public void delete(int idTipodeContenido);
    public TipodeContenido listId(int idTipodeContenido);
    public List<EmprendedorTipoContDTO> reporte09();

}