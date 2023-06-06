package pe.edu.upc.emprendeya.dtos;
import javax.persistence.Column;

public class EmprendedorDTO {
  private int id;
  private String rubroEmprendedor;
  private String nombreEmprendedor;
  private String apellidoEmprendedor;
  private int edadEmprendedor;

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
