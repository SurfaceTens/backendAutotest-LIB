package es.mde.acing.utils;

import java.util.List;

public class ExamenImpl implements Examen {

	private Alumno alumno;
	private List<PreguntaExamen> preguntas;
	private int nota;

	@Override
	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	@Override
	public List<PreguntaExamen> getPreguntas() {
		return preguntas;
	}

	public void setPreguntas(List<PreguntaExamen> preguntas) {
		this.preguntas = preguntas;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "ExamenImpl [alumno=" + alumno + ", preguntas=" + preguntas + "]" + "nota: " + nota;
	}

}
