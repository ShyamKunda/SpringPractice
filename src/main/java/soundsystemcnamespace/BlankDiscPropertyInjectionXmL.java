package soundsystemcnamespace;

import java.util.List;

public class BlankDiscPropertyInjectionXmL implements CompactDisc{
	
	private String title;
	private String artist;
	private List<String> tracks;
	
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public List<String> getTracks() {
		return tracks;
	}

	public void setTracks(List<String> tracks) {
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
