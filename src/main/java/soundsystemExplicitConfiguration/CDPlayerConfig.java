package soundsystemExplicitConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
/**
	@ComponentScan(basePackages="soundsystem")
	@ComponentScan(basePackages={"soundsystem", "video"})
	@ComponentScan(basePackageClasses={CDPlayer.class, DVDPlayer.class}) //BEST WAY
 */
public class CDPlayerConfig {
	
	
	@Bean
	public CompactDisc sgtPeppers() {
		return new SgtPeppers();
	}
	
	@Bean
	public MediaPlayer getCDPlayer() {
		return new CDPlayer(sgtPeppers());
	}
	
//	@Bean
//	public CDPlayer getCDPlayerMethod2(CompactDisc cd) {
//		return new CDPlayer(cd);
//	}

}
