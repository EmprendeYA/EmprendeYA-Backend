package pe.edu.upc.emprendeya.entities;
import javax.persistence.*;

@Entity
@Table(name = "preguntas")
public class Pregunta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPregunta;
    @Column(name = "namePregunta", length = 300, nullable = false)
    private String namePregunta;
    public Pregunta() {
    }
    public Pregunta(int idPregunta, String namePregunta) {
        this.idPregunta = idPregunta;
        this.namePregunta = namePregunta;
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public String getNamePregunta() {
        return namePregunta;
    }

    public void setNamePregunta(String namePregunta) {
        this.namePregunta = namePregunta;
    }
}
