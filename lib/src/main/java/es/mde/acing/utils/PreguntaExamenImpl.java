package es.mde.acing.utils;

public class PreguntaExamenImpl implements PreguntaExamen {

	private Examen examen;
	private Pregunta pregunta;
	private String respuesta; // Que respondio?
	private String correcta; // Cual era la buena?
	private boolean acertada; // Estaba bien?

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
	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	@Override
	public String getCorrecta() {
		return correcta;
	}

	public void setCorrecta(String correcta) {
		this.correcta = correcta;
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
		return "PreguntaExamenImpl [examen=" + examen + ", pregunta=" + pregunta + ", respuesta=" + respuesta
				+ ", correcta=" + correcta + ", acertada=" + acertada + "]";
	}

}
