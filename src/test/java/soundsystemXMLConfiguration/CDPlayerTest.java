package soundsystemXMLConfiguration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration ({"/soundSystem.xml"})
public class CDPlayerTest {
	
	
	@Autowired
	private CompactDisc cd;
	
	@Autowired
	private MediaPlayer player;
	
	@Autowired
	private BlankDisc blankDisk;

	@Autowired
	private CDPlayerProperty cdPlayerProp;
	
	@Autowired
	private BlankDiscPropertyInjectionXmL blankDiscPropertyInjectionXmL; 
	
	@Test
	public void cdShouldNotBeNull() {
		assertNotNull(cd);
	}
	
	@Test
	public void play()
	{
		String msg = player.play();
		assertEquals(msg,"Playing Lonely hearts club of sgtPeppers");
		assertEquals(blankDisk.play(),"Playing Shyam by The Man with Metal heart" );
	}
	
	@Test
	public void testTrackSize() {
		assertEquals(blankDisk.getTracksSize(),6);
	}
	
	@Test
	public void propTest() {
		System.out.println("This is Property injection Test");
		cdPlayerProp.play();
		assertEquals(cdPlayerProp.play(),"Playing Lonely hearts club of sgtPeppers");
		
		System.out.println("Literal value injects using property injection");
		
		blankDiscPropertyInjectionXmL.play();
		assertEquals(blankDiscPropertyInjectionXmL.getTracks().size(), 5);
	}
	
}
