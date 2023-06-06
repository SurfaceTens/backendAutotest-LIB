package es.mde.acing.utils;

public class PreguntaConImagen extends PreguntaImpl implements ConImagen  {

	private String imagenURL;

	@Override
	public String getImagenURL() {
		return imagenURL;
	}

	public void setImagenURL(String imagenURL) {
		this.imagenURL = imagenURL;
	}
	
	@Override
	public Adjunto getAdjunto() {
		return Adjunto.imagen;
	}

	@Override
	public String toString() {
		return "PreguntaConImagen [imagenURL=" + imagenURL + "]";
	}

}
