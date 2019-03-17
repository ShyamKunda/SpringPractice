package soundsystemcnamespace;

public class CDPlayerProperty implements MediaPlayer {

	private CompactDisc compactDisc;

	public CompactDisc getCompactDisc() {
		return compactDisc;
	}

	public void setCompactDisc(CompactDisc cd) {
		this.compactDisc = cd;
	}

	@Override
	public String play() {
		return compactDisc.play();
	}

}
