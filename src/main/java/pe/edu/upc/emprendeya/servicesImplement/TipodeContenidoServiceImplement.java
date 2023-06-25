package pe.edu.upc.emprendeya.servicesImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.emprendeya.dtos.EmprendedorTipoContDTO;
import pe.edu.upc.emprendeya.entities.TipodeContenido;
import pe.edu.upc.emprendeya.repositories.TContenidoRepository;
import pe.edu.upc.emprendeya.services.TContenidoService;

import java.util.ArrayList;
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

    @Override
    public List<EmprendedorTipoContDTO> reporte09() {

        List<String[]> getemprentc = tR.getempren_mayortc();
        List<EmprendedorTipoContDTO> TCEmprenDTOs = new ArrayList<>();

        for (String[] data : getemprentc) {
            EmprendedorTipoContDTO dto = new EmprendedorTipoContDTO();
            dto.setID(Integer.parseInt(data[0]));
            dto.setApellido_empren(data[1]);
            dto.setEdad_empren(Integer.parseInt(data[2]));
            dto.setNombre_empren(data[3]);
            dto.setRubro_empren(data[4]);
            dto.setBenef_ID(Integer.parseInt(data[5]));
            TCEmprenDTOs.add(dto);
        }

        return TCEmprenDTOs;

    }

}