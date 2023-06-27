package es.mde.acing.utils;

import es.mde.acing.utils.PreguntaImpl.Adjunto;

public interface ConImagen {

	String getImagenBase64();

	void setImagenBase64(String imagenBase64);

	boolean esImagenValida();

	byte[] getImagen();

	void setImagen(byte[] imagen);

	Adjunto getAdjunto();

}