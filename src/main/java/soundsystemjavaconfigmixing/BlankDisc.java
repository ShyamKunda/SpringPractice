package soundsystemjavaconfigmixing;

import java.util.List;

public class BlankDisc implements CompactDisc{
	
	private String title;
	private String artist;
	private List<String> tracks;
	
	public BlankDisc(String title, String artist, List<String> tracks) {
		this.title = title;
		this.artist = artist;
		this.tracks = tracks;
	}

	public String play() {
		tracks.stream().forEach(x -> System.out.println(x));
		return "Playing " + title + " by " + artist  ;
	}
	
	public int getTracksSize() {
		return tracks.size();
	}

}
