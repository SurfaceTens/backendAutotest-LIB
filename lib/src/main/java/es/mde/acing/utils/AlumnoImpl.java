package es.mde.acing.utils;

import java.util.List;

public class AlumnoImpl implements Alumno {

	private String nombre;
	private String apellidos;
	private List<Pregunta> preguntas;

	@Override
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	public String toString() {
		return "AlumnoImpl [nombre=" + nombre + ", apellidos=" + apellidos + ", testRealizados=" + "]";
	}

	@Override
	public List<Pregunta> getPreguntas() {
		return preguntas;
	}

	public void setPreguntas(List<Pregunta> preguntas) {
		this.preguntas = preguntas;
	}

}