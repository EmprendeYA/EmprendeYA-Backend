package pe.edu.upc.emprendeya.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.emprendeya.dtos.EmprendedorResenaDTO;
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

    @Override
    public List<EmprendedorResenaDTO> reporte01() {
        List<String[]> countDateByTrainer = rR.getCountResenaByEmprendedor();
        List<EmprendedorResenaDTO> emprendedorResenaDTO = new ArrayList<>();

        for (String[] data : countDateByTrainer) {
            EmprendedorResenaDTO dto = new EmprendedorResenaDTO();
            dto.setNameEmprendedor(data[0]);
            dto.setResenaCount(Integer.parseInt(data[1]));
            emprendedorResenaDTO.add(dto);
        }

        return emprendedorResenaDTO;
    }
}
