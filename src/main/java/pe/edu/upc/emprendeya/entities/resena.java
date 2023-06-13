package pe.edu.upc.emprendeya.entities;
import javax.persistence.*;

@Entity
@Table(name = "resena")
public class resena {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @Column(name = "descripcion", length = 30, nullable = false)
  private String descripcion;
  @Column(name = "idProp", length = 30, nullable = false)
  private int idProp;

  public resena() {
  }

  public resena(int id, String descripcion, int idProp) {
    this.id = id;
    this.descripcion = descripcion;
    this.idProp = idProp;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public int getIdProp() {
    return idProp;
  }

  public void setIdProp(int idProp) {
    this.idProp = idProp;
  }
}
