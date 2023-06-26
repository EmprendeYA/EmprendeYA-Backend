package pe.edu.upc.emprendeya.dtos;

import pe.edu.upc.emprendeya.entities.Benefactor;
import pe.edu.upc.emprendeya.entities.Emprendedor;

public class PreguntaDTO {
    private int id;
    private String namePregunta;

    private String descripcion;
    private Benefactor benefactor;
    private Emprendedor emprendedor;
    @Override
    public String toString() {
        return "PreguntaDTO{" +
                "id=" + id +
                ", namePregunta='" + namePregunta + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", benefactor=" + benefactor +
                ", emprendedor=" + emprendedor +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamePregunta() {
        return namePregunta;
    }

    public void setNamePregunta(String namePregunta) {
        this.namePregunta = namePregunta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Benefactor getBenefactor() {
        return benefactor;
    }

    public void setBenefactor(Benefactor benefactor) {
        this.benefactor = benefactor;
    }

    public Emprendedor getEmprendedor() {
        return emprendedor;
    }

    public void setEmprendedor(Emprendedor emprendedor) {
        this.emprendedor = emprendedor;
    }
}
