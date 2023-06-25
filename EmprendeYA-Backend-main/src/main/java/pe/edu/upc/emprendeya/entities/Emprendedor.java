package pe.edu.upc.emprendeya.entities;

import javax.persistence.*;

@Entity
@Table(name = "emprendedores")
public class Emprendedor {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @Column(name = "rubroEmprendedor", length = 30, nullable = false)
  private String rubroEmprendedor;
  @Column(name = "nombreEmprendedor", length = 30, nullable = false)
  private String nombreEmprendedor;
  @Column(name = "apellidoEmprendedor", length = 30, nullable = false)
  private String apellidoEmprendedor;
  @Column(name = "edadEmprendedor", length = 2, nullable = false)
  private int edadEmprendedor;
  @ManyToOne
  @JoinColumn(name = "idBenefactor", nullable = false)
  private Benefactor benefactor;

  public Emprendedor() {
  }

  public Emprendedor(int id, String rubroEmprendedor, String nombreEmprendedor, String apellidoEmprendedor, int edadEmprendedor, Benefactor benefactor) {
    this.id = id;
    this.rubroEmprendedor = rubroEmprendedor;
    this.nombreEmprendedor = nombreEmprendedor;
    this.apellidoEmprendedor = apellidoEmprendedor;
    this.edadEmprendedor = edadEmprendedor;
    this.benefactor = benefactor;
  }

  @Override
  public String toString() {
    return "Emprendedor{" +
            "id=" + id +
            ", rubroEmprendedor='" + rubroEmprendedor + '\'' +
            ", nombreEmprendedor='" + nombreEmprendedor + '\'' +
            ", apellidoEmprendedor='" + apellidoEmprendedor + '\'' +
            ", edadEmprendedor=" + edadEmprendedor +
            ", benefactor=" + benefactor +
            '}';
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getRubroEmprendedor() {
    return rubroEmprendedor;
  }

  public void setRubroEmprendedor(String rubroEmprendedor) {
    this.rubroEmprendedor = rubroEmprendedor;
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

  public Benefactor getBenefactor() {
    return benefactor;
  }

  public void setBenefactor(Benefactor benefactor) {
    this.benefactor = benefactor;
  }
}
