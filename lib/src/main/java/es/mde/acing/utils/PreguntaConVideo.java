package es.mde.acing.utils;

public class PreguntaConVideo implements ConVideo {
	
	private String audioURL;

	@Override
	public String getaudioURL() {
		return audioURL;
	}

	public void setaudioURL(String audioURL) {
		this.audioURL = audioURL;
	}

	@Override
	public String toString() {
		return "PreguntaConaudio [audioURL=" + audioURL + "]";
	}

}
