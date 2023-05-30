package pe.edu.upc.emprendeya.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.emprendeya.entities.Benefactor;
import pe.edu.upc.emprendeya.repositories.IBenefactorRepository;
import pe.edu.upc.emprendeya.services.IBenefactorService;

import java.util.List;
@Service
public class BenefactorServiceImplement implements IBenefactorService {
    @Autowired
    private IBenefactorRepository bR;
    @Override
    public void insert(Benefactor benefactor) {
        bR.save(benefactor);
    }

    @Override
    public List<Benefactor> list() {
        return bR.findAll();
    }

    @Override
    public void delete(int idBenefactor) {
        bR.deleteById(idBenefactor);
    }

    @Override
    public Benefactor listId(int idBenefactor) {
        return bR.findById(idBenefactor).orElse(new Benefactor());
    }
}
