package pe.edu.upc.emprendeya.servicesImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.emprendeya.dtos.EmprendedorTDContenidoDTO;
import pe.edu.upc.emprendeya.entities.TipodeContenido;
import pe.edu.upc.emprendeya.repositories.TContenidoRepository;
import pe.edu.upc.emprendeya.services.TContenidoService;
import pe.edu.upc.emprendeya.entities.Emprendedor;
import pe.edu.upc.emprendeya.services.IEmprendedorService;
import pe.edu.upc.emprendeya.repositories.IEmprendedorRepository;
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
    public List<EmprendedorTDContenidoDTO> reporte01() {

        List<String[]> CountTipodeContenidoByEmprendedores = tR.getCountTipodeContenidoByEmprendedores();
        List<EmprendedorTDContenidoDTO> TDContenidoEmprendedorDTOs = new ArrayList<>();

        for (String[] data : CountTipodeContenidoByEmprendedores) {
            EmprendedorTDContenidoDTO dto = new EmprendedorTDContenidoDTO();
            dto.setNombreEmprendedor(data[0]);
            dto.setTDContenidoCount(Integer.parseInt(data[1]));
            TDContenidoEmprendedorDTOs.add(dto);
        }

        return TDContenidoEmprendedorDTOs;

    }
    @Override
    public Long contarTipodeContenido() {
        return tR.cantidad();
    }
}