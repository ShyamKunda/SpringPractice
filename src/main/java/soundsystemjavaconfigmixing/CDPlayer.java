package soundsystemjavaconfigmixing;

public class CDPlayer implements MediaPlayer {
	
	
	private CompactDisc cd;
	
	public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}

	public String play() {
		return cd.play();
	}

}
