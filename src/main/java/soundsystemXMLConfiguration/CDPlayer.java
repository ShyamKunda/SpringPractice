package soundsystemXMLConfiguration;

public class CDPlayer implements MediaPlayer {

	CompactDisc cd;
	
	public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}
		
	public String play() {
		return cd.play();
	}

}
