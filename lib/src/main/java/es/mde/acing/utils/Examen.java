package es.mde.acing.utils;

import java.time.LocalDate;
import java.util.List;

public interface Examen {

	LocalDate getFecha();

	Alumno getAlumno();

	List<PreguntaExamen> getPreguntas();

}