package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
	
	
	private CompactDisc cd;
	
	@Autowired(required=true)
	public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}

	public String play() {
		return cd.play();
	}

//	@Autowired
//	public void setCompactDisc(CompactDisc cd) {
//	  this.cd = cd;
//	}
}
