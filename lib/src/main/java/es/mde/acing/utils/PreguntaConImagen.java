package es.mde.acing.utils;

import java.util.Arrays;
import java.util.Base64;

public class PreguntaConImagen extends PreguntaImpl implements ConImagen {

	private byte[] imagen;

	
	@Override
	public byte[] getImagen() {
		return imagen;
	}

	
	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}
	
	@Override
	public String getImagenBase64() {
		return Base64.getEncoder().encodeToString(imagen);
	}

	
	public void setImagenBase64(String imagenBase64) {
		this.imagen = Base64.getDecoder().decode(imagenBase64);
	}

	
	@Override
	public boolean esImagenValida() {
		// No es nula y no esta vacia
        return imagen != null && imagen.length > 0;
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
