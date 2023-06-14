package es.mde.acing.utils;

public interface PreguntaExamen {

	Examen getExamen();

	Pregunta getPregunta();

	String getRespuesta();

	String getCorrecta();

	boolean isAcertada();

}