package pe.edu.upc.emprendeya.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.emprendeya.entities.TipodeContenido;
import pe.edu.upc.emprendeya.repositories.TContenidoRepository;
import pe.edu.upc.emprendeya.services.TContenidoService;

import java.util.List;

@Service

public class TipodeContenidoServiceImplement implements TContenidoService {
    @Autowired
    private TContenidoRepository tR;

    @Override
    public void insert(TipodeContenido TipodeContenido) {
        tR.save(TipodeContenido);
    }

    @Override
    public List<TipodeContenido> list() {
        return tR.findAll();
    }
    @Override
    public void delete(int idTipodeContenido) {
        tR.deleteById(idTipodeContenido);


    }

    @Override
    public TipodeContenido listId(int idTipodeContenido) {
        return tR.findById(idTipodeContenido).orElse(new TipodeContenido());
    }
}