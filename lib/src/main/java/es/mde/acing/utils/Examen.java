package es.mde.acing.utils;

import java.util.List;

public interface Examen {

	Alumno getAlumno();

	List<PreguntaExamen> getPreguntas();

	int getAciertos();

	int getFallos();

	String getNota();

	boolean isEntregado();

}