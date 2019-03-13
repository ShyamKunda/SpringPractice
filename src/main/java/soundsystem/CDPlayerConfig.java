package soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
/**
	@ComponentScan(basePackages="soundsystem")
	@ComponentScan(basePackages={"soundsystem", "video"})
	@ComponentScan(basePackageClasses={CDPlayer.class, DVDPlayer.class}) //BEST WAY
 */
public class CDPlayerConfig {

}
