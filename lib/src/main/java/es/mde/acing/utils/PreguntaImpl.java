package es.mde.acing.utils;

import java.util.List;

public abstract class PreguntaImpl implements Pregunta {

	private String tematica;
	private int dificultad;
	private String enunciado;
	private String opcionCorrecta;
	private String opcionInCorrecta1;
	private String opcionInCorrecta2;
	private String opcionInCorrecta3;

	// Discriminador
	public static enum Adjunto {
		imagen, video
	}

	// Relaciones
	private List<PreguntaExamen> examenes;
//	private Alumno alumno;

	@Override
	public String getTematica() {
		return tematica;
	}

	public void setTematica(String tematica) {
		this.tematica = tematica;
	}

	@Override
	public int getDificultad() {
		return dificultad;
	}

	public void setDificultad(int dificultad) {
		this.dificultad = dificultad;
	}

	@Override
	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	@Override
	public String getOpcionCorrecta() {
		return opcionCorrecta;
	}

	public void setOpcionCorrecta(String opcionCorrecta) {
		this.opcionCorrecta = opcionCorrecta;
	}

	@Override
	public String getOpcionInCorrecta1() {
		return opcionInCorrecta1;
	}

	public void setOpcionInCorrecta1(String opcionInCorrecta1) {
		this.opcionInCorrecta1 = opcionInCorrecta1;
	}

	@Override
	public String getOpcionInCorrecta2() {
		return opcionInCorrecta2;
	}

	public void setOpcionInCorrecta2(String opcionInCorrecta2) {
		this.opcionInCorrecta2 = opcionInCorrecta2;
	}

	@Override
	public String getOpcionInCorrecta3() {
		return opcionInCorrecta3;
	}

	public void setOpcionInCorrecta3(String opcionInCorrecta3) {
		this.opcionInCorrecta3 = opcionInCorrecta3;
	}


	@Override
	public List<PreguntaExamen> getExamenes() {
		return examenes;
	}

	public void setExamenes(List<PreguntaExamen> examenes) {
		this.examenes = examenes;
	}

//	@Override
//	public Alumno getAlumno() {
//		return alumno;
//	}
//
//	public void setAlumno(Alumno alumno) {
//		this.alumno = alumno;
//	}

	@Override
	public Adjunto getAdjunto() {
		return null;
	}

	@Override
	public String toString() {
		return "PreguntaImpl [tematica=" + tematica + ", dificultad=" + dificultad + ", enunciado=" + enunciado;
	}

}
