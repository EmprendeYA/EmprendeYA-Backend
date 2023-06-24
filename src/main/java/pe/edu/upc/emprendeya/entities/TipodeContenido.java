package pe.edu.upc.emprendeya.entities;
import javax.persistence.*;
@Entity
@Table(name = "TipodeContenido")
public class TipodeContenido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipodeContenido;
    @Column(name = "nombreTipodeContenido", length = 70, nullable = false)
    private String nombreTipodeContenido;

    @Column(name = "descripcionTipodeContenido", length = 80, nullable = false)
    private String descripcionTipodeContenido;
    @ManyToOne
    @JoinColumn(name = "idEmprendedor", nullable = false)
    private Emprendedor emprendedor;

    public TipodeContenido() {
    }
    public TipodeContenido(int idTipodeContenido, String nombreTipodeContenido, String descripcionTipodeContenido) {
        this.idTipodeContenido = idTipodeContenido;
        this.nombreTipodeContenido = nombreTipodeContenido;
        this.descripcionTipodeContenido = descripcionTipodeContenido;
    }

    @Override
    public String toString() {
        return "TipodeContenidoDTO{" +
                "idTipodeContenido=" + idTipodeContenido +
                ", nombreTipodeContenido='" + nombreTipodeContenido + '\'' +
                ", emprendedor=" + emprendedor +
                '}';
    }

    public int getIdTipodeContenido() {
        return idTipodeContenido;
    }

    public void setIdTipodeContenido(int idTipodeContenido) {
        this.idTipodeContenido = idTipodeContenido;
    }

    public String getNombreTipodeContenido() {
        return nombreTipodeContenido;
    }

    public void setNombreTipodeContenido(String nameTipodeContenido) {
        this.nombreTipodeContenido = nameTipodeContenido;
    }

    public String getDescripcionTipodeContenido() {
        return descripcionTipodeContenido;
    }

    public void setDescripcionTipodeContenido(String descripcionTipodeContenido) {
        this.descripcionTipodeContenido = descripcionTipodeContenido;
    }

    public Emprendedor getEmprendedor() {
        return emprendedor;
    }

    public void setEmprendedor(Emprendedor emprendedor) {
        this.emprendedor = emprendedor;
    }
}