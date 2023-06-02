package es.mde.acing.utils;

import java.util.List;

public class AlumnoImpl implements Alumno {

	private String nombre;
	private String apellidos;
	private List<Examen> examen;
	private List<Pregunta> pregunta;

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
	public List<Examen> getExamen() {
		return examen;
	}

	public void setExamen(List<Examen> examen) {
		this.examen = examen;
	}

	public List<Pregunta> getPregunta() {
		return pregunta;
	}

	public void setPregunta(List<Pregunta> pregunta) {
		this.pregunta = pregunta;
	}

	@Override
	public String toString() {
		return "AlumnoImpl [nombre=" + nombre + ", apellidos=" + apellidos + ", examen=" + examen + "]";
	}

}