package es.mde.acing.utils;

import es.mde.acing.utils.PreguntaImpl.Adjunto;

public interface ConImagen {

	byte[] getImagen();

	String getImagenBase64();

	boolean esImagenValida();

	Adjunto getAdjunto();

}