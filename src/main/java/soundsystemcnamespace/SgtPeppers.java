package soundsystemcnamespace;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc{

	public String play() {
		System.out.println("Playing Lonely hearts club of sgtPeppers");
		return "Playing Lonely hearts club of sgtPeppers";
	}
}
