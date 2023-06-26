package pe.edu.upc.emprendeya.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.emprendeya.dtos.EmprendedorPreguntaDTO;
import pe.edu.upc.emprendeya.entities.Pregunta;
import pe.edu.upc.emprendeya.repositories.IPreguntaRepository;
import pe.edu.upc.emprendeya.services.IPreguntaService;

import java.util.ArrayList;
import java.util.List;

@Service
public class PreguntaServiceImplement implements IPreguntaService {
    @Autowired
    private IPreguntaRepository pR;
    @Override
    public void insert(Pregunta pregunta) {
        pR.save(pregunta);
    }

    @Override
    public List<Pregunta> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int idPregunta) {
        pR.deleteById(idPregunta);
    }

    @Override
    public Pregunta listId(int idPregunta) {
        return pR.findById(idPregunta).orElse(new Pregunta());
    }

    @Override
    public List<EmprendedorPreguntaDTO> reporte2() {
        List<String[]> countPreguntabyEmprendedor = pR.getCountPreguntaByEmprendedor();
        List<EmprendedorPreguntaDTO> emprendedorPreguntaDTOs = new ArrayList<>();

        for (String[] data : countPreguntabyEmprendedor) {
            EmprendedorPreguntaDTO dto = new EmprendedorPreguntaDTO();
            dto.setNameEmprendedor(data[0]);
            dto.setPreguntaCount(Integer.parseInt(data[1]));
            emprendedorPreguntaDTOs.add(dto);
        }

        return emprendedorPreguntaDTOs;
    }
}
