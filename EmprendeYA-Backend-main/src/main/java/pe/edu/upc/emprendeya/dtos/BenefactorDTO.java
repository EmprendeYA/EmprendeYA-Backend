package pe.edu.upc.emprendeya.dtos;


public class BenefactorDTO {
    private int id;
    private String nameBenefactor;
    private String ocupation;
    private String interest;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
