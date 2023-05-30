package pe.edu.upc.emprendeya.dtos;


public class BenefactorDTO {
    private int idBenefactor;
    private String nameBenefactor;
    private String ocupation;
    private String interest;

    public int getIdBenefactor() {
        return idBenefactor;
    }

    public void setIdBenefactor(int idBenefactor) {
        this.idBenefactor = idBenefactor;
    }

    public String getNameBenefactor() {
        return nameBenefactor;
    }

    public void setNameBenefactor(String nameBenefactor) {
        this.nameBenefactor = nameBenefactor;
    }

    public String getOcupation() {
        return ocupation;
    }

    public void setOcupation(String ocupation) {
        this.ocupation = ocupation;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }
}
