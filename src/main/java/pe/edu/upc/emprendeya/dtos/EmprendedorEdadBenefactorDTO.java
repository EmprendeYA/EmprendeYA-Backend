package pe.edu.upc.emprendeya.dtos;

public class EmprendedorEdadBenefactorDTO {
    private String nameBenefactor;
    private String nombreEmprendedor;
    private String apellidoEmprendedor;
    private int edadEmprendedor;

    public EmprendedorEdadBenefactorDTO() {
    }

    public EmprendedorEdadBenefactorDTO(String nameBenefactor, String nombreEmprendedor, String apellidoEmprendedor, int edadEmprendedor) {
        this.nameBenefactor = nameBenefactor;
        this.nombreEmprendedor = nombreEmprendedor;
        this.apellidoEmprendedor = apellidoEmprendedor;
        this.edadEmprendedor = edadEmprendedor;
    }

    public String getNameBenefactor() {
        return nameBenefactor;
    }

    public void setNameBenefactor(String nameBenefactor) {
        this.nameBenefactor = nameBenefactor;
    }

    public String getNombreEmprendedor() {
        return nombreEmprendedor;
    }

    public void setNombreEmprendedor(String nombreEmprendedor) {
        this.nombreEmprendedor = nombreEmprendedor;
    }

    public String getApellidoEmprendedor() {
        return apellidoEmprendedor;
    }

    public void setApellidoEmprendedor(String apellidoEmprendedor) {
        this.apellidoEmprendedor = apellidoEmprendedor;
    }

    public int getEdadEmprendedor() {
        return edadEmprendedor;
    }

    public void setEdadEmprendedor(int edadEmprendedor) {
        this.edadEmprendedor = edadEmprendedor;
    }
}
