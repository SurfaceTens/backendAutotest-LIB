package es.mde.acing.utils;

import java.util.List;

public interface Examen {

	Alumno getAlumno();

	List<PreguntaExamen> getPreguntas();

	boolean isEntregado();

}