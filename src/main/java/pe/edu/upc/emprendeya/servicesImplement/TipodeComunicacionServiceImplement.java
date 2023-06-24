package pe.edu.upc.emprendeya.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.emprendeya.entities.TipodeComunicacion;
import pe.edu.upc.emprendeya.repositories.TComunicacionRepository;
import pe.edu.upc.emprendeya.services.TComunicacionServices;

import java.util.List;

@Service
public class TipodeComunicacionServiceImplement implements TComunicacionServices {
    @Autowired
    private TComunicacionRepository tR;

    @Override
    public void insert(TipodeComunicacion tipodeComunicacion) {
        tR.save(tipodeComunicacion);
    }

    @Override
    public List<TipodeComunicacion> list() {
        return tR.findAll();
    }
    @Override
    public void delete(int idTipodeComunicacion) {
        tR.deleteById(idTipodeComunicacion);


    }

    @Override
    public TipodeComunicacion listId(int idTipodeComunicacion) {
        return tR.findById(idTipodeComunicacion).orElse(new TipodeComunicacion());
    }
}

