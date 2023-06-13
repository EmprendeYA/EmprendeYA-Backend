package pe.edu.upc.emprendeya.servicesImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.emprendeya.entities.Emprendedor;
import pe.edu.upc.emprendeya.entities.resena;
import pe.edu.upc.emprendeya.repositories.IEmprendedorRepository;
import pe.edu.upc.emprendeya.repositories.IResenaRepository;
import pe.edu.upc.emprendeya.services.IResenaService;

import java.util.List;
@Service

public class ResenaServicesImplement implements IResenaService {
  @Autowired
  private IResenaRepository rR;
  @Override
  public void insert(resena Resena) {
    rR.save(Resena);
  }

  @Override
  public void delete(int idresena) {
    rR.deleteById(idresena);
  }

  @Override
  public resena listId(int idresena) {
    return rR.findById(idresena).orElse(new resena());
  }

  @Override
  public List<resena> list() {
    return rR.findAll();
  }
}
