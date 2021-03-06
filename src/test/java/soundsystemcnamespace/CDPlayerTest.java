package soundsystemcnamespace;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/soundSystemXMLCSpace.xml")
public class CDPlayerTest {
	
	@Autowired
	private CompactDisc cd;
	
	
	@Autowired
	private CDPlayer player;
	
	@Autowired
	private BlankDisc bdisc;
	
	@Autowired
	private CDPlayerProperty cdPlayerProp;
	
	@Autowired
	private BlankDiscPropertyInjectionXmL blankDiscPropertyInjectionXmL;
	
	@Test
	public void cdTest() {
		assertNotNull(cd);
		assertEquals(cd.play(), "Playing Lonely hearts club of sgtPeppers");
	}
	
	@Test
	public void cdPlayer() {
		assertNotNull(player);
		System.out.println(bdisc.play());
		assertEquals(player.play(), "Playing Lonely hearts club of sgtPeppers");
		
		
	}
	
	@Test
	public void propTest() {
		System.out.println("This is Property injection Test");
		cdPlayerProp.play();
		assertEquals(cdPlayerProp.play(),"Playing Lonely hearts club of sgtPeppers");
		blankDiscPropertyInjectionXmL.play();
		assertEquals(blankDiscPropertyInjectionXmL.getTracks().size(), 5);
		
	}

}
