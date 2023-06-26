package pe.edu.upc.emprendeya.dtos;

public class RubroEmprendedorDTO {
    public RubroEmprendedorDTO() {
        this.rubroemprendedor = rubroemprendedor;
        this.emprendedorCount = emprendedorCount;
    }

    private String rubroemprendedor;
    private int emprendedorCount;

    public String getrubroemprendedor() {
        return rubroemprendedor;
    }

    public void setrubroemprendedor(String nombreEmprendedor) {
        this.rubroemprendedor = nombreEmprendedor;
    }

    public int getemprendedorCount() {
        return emprendedorCount;
    }

    public void setemprendedorCount(int emprendedorCount) {
        this.emprendedorCount = emprendedorCount;
    }


}