package pe.edu.upc.emprendeya.dtos;
import pe.edu.upc.emprendeya.entities.Benefactor;
import pe.edu.upc.emprendeya.entities.Emprendedor;

public class TipodeComunicacionDTO {
    private int id;
    private String nameTC;
    private String descripcionTC;
    private Benefactor benefactor;
    private Emprendedor emprendedor;

    @Override
    public String toString() {
        return "TipodeComunicacionDTO{" +
                "id=" + id +
                ", nameTC='" + nameTC + '\'' +
                ", descripcionTC='" + descripcionTC + '\'' +
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

    public String getNameTC() {
        return nameTC;
    }

    public void setNameTC(String nameTC) {
        this.nameTC = nameTC;
    }

    public String getDescripcionTC() {
        return descripcionTC;
    }

    public void setDescripcionTC(String descripcionTC) {
        this.descripcionTC = descripcionTC;
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
