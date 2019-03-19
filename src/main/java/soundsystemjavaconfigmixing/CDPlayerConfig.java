package soundsystemjavaconfigmixing;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {
	
	@Bean
	public CDPlayer getCDPlayerMethod2(CompactDisc cd) {
		return new CDPlayer(cd);
	}

}
