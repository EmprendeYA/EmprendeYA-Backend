package pe.edu.upc.emprendeya.dtos;
import pe.edu.upc.emprendeya.entities.Benefactor;

import javax.persistence.Column;

public class EmprendedorDTO {
  private int id;
  private String rubroEmprendedor;
  private String nombreEmprendedor;
  private String apellidoEmprendedor;
  private int edadEmprendedor;
  private Benefactor benefactor;


  public Benefactor getBenefactor() {
    return benefactor;
  }

  @Override
  public String toString() {
    return "EmprendedorDTO{" +
            "id=" + id +
            ", rubroEmprendedor='" + rubroEmprendedor + '\'' +
            ", nombreEmprendedor='" + nombreEmprendedor + '\'' +
            ", apellidoEmprendedor='" + apellidoEmprendedor + '\'' +
            ", edadEmprendedor=" + edadEmprendedor +
            ", benefactor=" + benefactor +
            '}';
  }

  public void setBenefactor(Benefactor benefactor) {
    this.benefactor = benefactor;
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
}
