package es.mde.acing.utils;

public class PreguntaConVideo implements ConVideo {
	
	private String videoURL;

	@Override
	public String getVideoURL() {
		return videoURL;
	}

	public void setVideoURL(String videoURL) {
		this.videoURL = videoURL;
	}

	@Override
	public String toString() {
		return "PreguntaConaudio [audioURL=" + videoURL + "]";
	}

}
