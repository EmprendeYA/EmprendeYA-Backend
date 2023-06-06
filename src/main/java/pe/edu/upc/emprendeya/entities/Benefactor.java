package pe.edu.upc.emprendeya.entities;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "benefactors")
public class Benefactor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBenefactor;
    @Column(name = "nameBenefactor", length = 60, nullable = false)
    private String nameBenefactor;
    @Column(name = "ocupation",length = 60, nullable = false)
    private String ocupation;
    @Column(name = "interest",length = 60, nullable = false)
    private String interest;
    public Benefactor() {
    }
    public Benefactor(int idBenefactor, String nameBenefactor, String ocupation, String interest) {
        this.idBenefactor = idBenefactor;
        this.nameBenefactor = nameBenefactor;
        this.ocupation = ocupation;
        this.interest = interest;
    }

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
