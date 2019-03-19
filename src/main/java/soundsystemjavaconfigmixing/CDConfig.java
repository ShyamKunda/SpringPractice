package soundsystemjavaconfigmixing;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
public class CDConfig {
	
	@Bean
	@Primary
	public CompactDisc sgtPeppers() {
		return new SgtPeppers();
	}

}
