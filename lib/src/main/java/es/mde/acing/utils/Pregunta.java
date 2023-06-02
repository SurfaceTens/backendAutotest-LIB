package es.mde.acing.utils;

import java.util.List;

public interface Pregunta {

	String getTematica();

	int getDificultad();

	String getEnunciado();

	String getOpcionCorrecta();

	String getOpcionInCorrecta1();

	String getOpcionInCorrecta2();

	String getOpcionInCorrecta3();

	String getOpcionInCorrecta4();

	List<PreguntaExamen> getExamenes();

}