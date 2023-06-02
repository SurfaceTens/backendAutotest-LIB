package es.mde.acing.utils;

import java.util.List;

public interface Alumno {

	String getNombre();

	String getApellidos();

	List<Examen> getExamenes();

	List<Pregunta> getPreguntas();

}