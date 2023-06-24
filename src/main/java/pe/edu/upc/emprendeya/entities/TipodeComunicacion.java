package pe.edu.upc.emprendeya.entities;

import javax.persistence.*;

@Entity
@Table(name = "TipodeComunicacion")

public class TipodeComunicacion {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
@Column(name = "nameTC", length = 70, nullable = false)
    private String nameTC;

@Column(name = "descripcionTC", length = 80, nullable = false)
    private String descripcionTC;

@ManyToOne
@JoinColumn(name = "idBenefactor", nullable = false)
    private Benefactor benefactor;

@ManyToOne
@JoinColumn(name = "idEmprendedor", nullable = false)
    private Emprendedor emprendedor;

public TipodeComunicacion() {
    }

    public TipodeComunicacion(int id, String nameTC, String descripcionTC, Benefactor benefactor, Emprendedor emprendedor) {
        this.id = id;
        this.nameTC = nameTC;
        this.descripcionTC = descripcionTC;
    }
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
