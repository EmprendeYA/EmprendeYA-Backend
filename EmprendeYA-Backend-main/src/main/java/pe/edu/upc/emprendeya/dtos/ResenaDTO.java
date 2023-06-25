package pe.edu.upc.emprendeya.dtos;
import pe.edu.upc.emprendeya.entities.Emprendedor;
public class ResenaDTO {
    private int id;
    private String descripcion;
    private Emprendedor emprendedor;

    @Override
    public String toString() {
        return "ResenaDTO{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", emprendedor=" + emprendedor +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Emprendedor getEmprendedor() {
        return emprendedor;
    }

    public void setEmprendedor(Emprendedor emprendedor) {
        this.emprendedor = emprendedor;
    }
}
