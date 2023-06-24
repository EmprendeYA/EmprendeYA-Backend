package pe.edu.upc.emprendeya.dtos;

public class PreguntaDTO {
    private int id;
    private String namePregunta;

    private String descripcion;

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
