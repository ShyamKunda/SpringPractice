package soundsystemcnamespace;


public class CDPlayer implements MediaPlayer{
	
	private CompactDisc cda;
	
	
	public CDPlayer(CompactDisc cda) {
		this.cda = cda;
	}

	
	public String play() {
		return cda.play();
	}

}
