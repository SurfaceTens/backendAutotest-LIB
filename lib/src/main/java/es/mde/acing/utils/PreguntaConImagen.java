package es.mde.acing.utils;

import java.util.Arrays;

public class PreguntaConImagen extends PreguntaImpl implements ConImagen {

	private byte[] imagen;

	@Override
	public byte[] getImagen() {
		return imagen;
	}

	@Override
	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}

	@Override
	public Adjunto getAdjunto() {
		return Adjunto.imagen;
	}

	@Override
	public String toString() {
		return "PreguntaConImagen [imagen=" + Arrays.toString(imagen) + "]";
	}

}
