package pe.edu.upc.emprendeya.entities;

import javax.persistence.*;

@Entity
@Table(name = "resenas")
public class Resena {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "descripcion", length = 200, nullable = false)
    private String descripcion;
    @ManyToOne
    @JoinColumn(name = "idEmprendedor", nullable = false)
    private Emprendedor emprendedor;

    public Resena() {
    }

    public Resena(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }
    @Override
    public String toString() {
        return "ResenaDTO{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", emprendedor=" + emprendedor +
                '}';
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

    public Emprendedor getEmprendedor() {
        return emprendedor;
    }

    public void setEmprendedor(Emprendedor emprendedor) {
        this.emprendedor = emprendedor;
    }
}
