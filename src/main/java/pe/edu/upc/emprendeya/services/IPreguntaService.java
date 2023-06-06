package pe.edu.upc.emprendeya.services;

import pe.edu.upc.emprendeya.entities.Pregunta;

import java.util.List;

public interface IPreguntaService {
    public void insert(Pregunta Pregunta);
    List<Pregunta> list();
    public void delete (int idPregunta);
    public Pregunta listId(int idPregunta);
}
