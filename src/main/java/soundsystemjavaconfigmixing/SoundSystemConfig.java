package soundsystemjavaconfigmixing;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import({CDConfig.class, CDPlayerConfig.class})
@ImportResource("classpath:cd-config.xml")
public class SoundSystemConfig {
	
//	@Bean
//	public CompactDisc getBlankDisc() {
//		List<String> allTracks = new ArrayList<String>();
//		allTracks.add("-> Track a");
//		allTracks.add("-> Track b");
//		allTracks.add("-> Track c");
//		allTracks.add("-> Track d");
//		return new BlankDisc("This awesome playlist", "Shyam", allTracks);
//	}

}
