package pe.edu.upc.emprendeya.entities;
import javax.persistence.*;

@Entity
@Table(name = "benefactors")
public class Benefactor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nameBenefactor", length = 60, nullable = false)
    private String nameBenefactor;
    @Column(name = "ocupation",length = 60, nullable = false)
    private String ocupation;
    @Column(name = "interest",length = 60, nullable = false)
    private String interest;

    @Override
    public String toString() {
        return "Benefactor{" +
                "id=" + id +
                ", nameBenefactor='" + nameBenefactor + '\'' +
                ", ocupation='" + ocupation + '\'' +
                ", interest='" + interest + '\'' +
                '}';
    }

    public Benefactor() {
    }
    public Benefactor(int id, String nameBenefactor, String ocupation, String interest) {
        this.id = id;
        this.nameBenefactor = nameBenefactor;
        this.ocupation = ocupation;
        this.interest = interest;
    }

    public int getId() {
        return id;
    }

    public void setId(int idBenefactor) {
        this.id = idBenefactor;
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
