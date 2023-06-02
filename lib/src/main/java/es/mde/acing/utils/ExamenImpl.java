package es.mde.acing.utils;

import java.time.LocalDate;
import java.util.List;

public class ExamenImpl implements Examen {

	private LocalDate fecha;
	private Alumno alumno;
	private List<PreguntaExamen> preguntas;

	@Override
	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

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

	@Override
	public String toString() {
		return "ExamenImpl [fecha=" + fecha + ", alumno=" + alumno + ", preguntas=" + preguntas + "]";
	}

}
