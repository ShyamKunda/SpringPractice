package soundsystemXMLConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CDPlayerConfig {
	
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("soundSystem.xml");
		
		CompactDisc cd = (CompactDisc) context.getBean("compactDisc");
		
		cd.play();
		
		CDPlayer player = (CDPlayer) context.getBean("cdPlayer");
		
		player.play();
		
	}
	
}
