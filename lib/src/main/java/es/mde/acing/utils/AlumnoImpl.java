package es.mde.acing.utils;

public class AlumnoImpl implements Alumno {

	private String nombre;
	private String apellidos;

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

}