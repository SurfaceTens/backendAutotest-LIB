package es.mde.acing.utils;

import java.util.List;

public class ExamenImpl implements Examen {

	private Alumno alumno;
	private List<PreguntaExamen> preguntas;
	private boolean entregado;
	private int aciertos;
	private int fallos;
	private String nota;

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
	public int getAciertos() {
		return aciertos;
	}

	public void setAciertos(int aciertos) {
		this.aciertos = aciertos;
	}

	@Override
	public int getFallos() {
		return fallos;
	}

	public void setFallos(int fallos) {
		this.fallos = fallos;
	}

	@Override
	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}

	@Override
	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	@Override
	public String toString() {
		return "ExamenImpl [alumno=" + alumno + ", preguntas=" + preguntas + "]" + "nota: " + nota;
	}

}
