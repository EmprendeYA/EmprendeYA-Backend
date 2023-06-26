package pe.edu.upc.emprendeya.dtos;

public class BenefactorEmprendedorDTO {
    private String nameBenefactor;
    private int emprendedorCount;

    public BenefactorEmprendedorDTO() {
    }

    public BenefactorEmprendedorDTO(String nameBenefactor, int emprendedorCount) {
        this.nameBenefactor = nameBenefactor;
        this.emprendedorCount = emprendedorCount;
    }

    public String getNameBenefactor() {
        return nameBenefactor;
    }

    public void setNameBenefactor(String nameBenefactor) {
        this.nameBenefactor = nameBenefactor;
    }

    public int getEmprendedorCount() {
        return emprendedorCount;
    }

    public void setEmprendedorCount(int emprendedorCount) {
        this.emprendedorCount = emprendedorCount;
    }
}
