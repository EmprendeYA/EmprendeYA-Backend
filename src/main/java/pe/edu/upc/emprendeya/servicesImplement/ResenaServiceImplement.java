package pe.edu.upc.emprendeya.servicesImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.emprendeya.dtos.EmprendedorTipoContDTO;
import pe.edu.upc.emprendeya.entities.Resena;
import pe.edu.upc.emprendeya.repositories.IResenaRepository;
import pe.edu.upc.emprendeya.services.IResenaService;

import java.util.ArrayList;
import java.util.List;

@Service
public class ResenaServiceImplement implements IResenaService {
    @Autowired
    private IResenaRepository rR;

    @Override
    public void insert(Resena resena) {
        rR.save(resena);
    }

    @Override
    public List<Resena> list() {
        return rR.findAll();
    }
    @Override
    public void delete(int idResena) {
        rR.deleteById(idResena);

    }

    @Override
    public Resena listId(int idResena) {
        return rR.findById(idResena).orElse(new Resena());
    }



}
