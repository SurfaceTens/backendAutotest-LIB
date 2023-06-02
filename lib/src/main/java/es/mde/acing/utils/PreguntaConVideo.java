package es.mde.acing.utils;

public class PreguntaConVideo implements ConVideo {
	
	private String videoURL;

	@Override
	public String getaudioURL() {
		return videoURL;
	}

	public void setaudioURL(String audioURL) {
		this.videoURL = audioURL;
	}

	@Override
	public String toString() {
		return "PreguntaConaudio [audioURL=" + videoURL + "]";
	}

}
