package es.mde.acing.utils;

public interface PreguntaExamen {

	Examen getExamen();

	Pregunta getPregunta();

	int getRespuesta();

	boolean isAcertada();

}