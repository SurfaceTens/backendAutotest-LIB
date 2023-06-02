package es.mde.acing.utils;

public class PreguntaExamenImpl implements PreguntaExamen {

	private Examen examen;
	private Pregunta pregunta;
	private int respuesta;
	private boolean acertada;

	@Override
	public Examen getExamen() {
		return examen;
	}

	public void setExamen(Examen examen) {
		this.examen = examen;
	}

	@Override
	public Pregunta getPregunta() {
		return pregunta;
	}

	public void setPregunta(Pregunta pregunta) {
		this.pregunta = pregunta;
	}

	@Override
	public int getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(int respuesta) {
		this.respuesta = respuesta;
	}

	@Override
	public boolean isAcertada() {
		return acertada;
	}

	public void setAcertada(boolean acertada) {
		this.acertada = acertada;
	}

	@Override
	public String toString() {
		return "Pregunta_Examen [examen=" + examen + ", pregunta=" + pregunta + ", respuesta=" + respuesta
				+ ", acertada=" + acertada + "]";
	}

}
