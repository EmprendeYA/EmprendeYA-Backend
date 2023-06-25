package pe.edu.upc.emprendeya.entities;
import javax.persistence.*;

@Entity
@Table(name = "preguntas")
public class Pregunta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "namePregunta", length = 300, nullable = false)
    private String namePregunta;

    @Column(name = "descripcion", length = 500, nullable = false)
    private String descripcion;
    public Pregunta() {
    }
    public Pregunta(int id, String namePregunta, String descripcion) {
        this.id = id;
        this.namePregunta = namePregunta;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamePregunta() {
        return namePregunta;
    }

    public void setNamePregunta(String namePregunta) {
        this.namePregunta = namePregunta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
