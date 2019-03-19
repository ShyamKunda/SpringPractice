package soundsystemjavaconfigmixing;

import org.springframework.context.annotation.Primary;


public class SgtPeppers implements CompactDisc {
	
	public String play() {
		System.out.println("Playing Lonely hearts club of sgtPeppers");
		return "Playing Lonely hearts club of sgtPeppers";
	}

}
