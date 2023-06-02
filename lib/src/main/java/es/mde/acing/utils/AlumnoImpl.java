package es.mde.acing.utils;

import java.util.List;

public class AlumnoImpl implements Alumno {

	private String nombre;
	private String apellidos;
	private List<Examen> examen;

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

	@Override
	public String toString() {
		return "AlumnoImpl [nombre=" + nombre + ", apellidos=" + apellidos + ", examen=" + examen + "]";
	}

}