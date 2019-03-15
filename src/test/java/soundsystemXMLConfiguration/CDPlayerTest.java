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
	
	@Test
	public void cdShouldNotBeNull() {
		assertNotNull(cd);
	}
	
	@Test
	public void play()
	{
		String msg = player.play();
		assertEquals(msg,"Playing Lonely hearts club of sgtPeppers");
		System.out.println(blankDisk.play());
		assertEquals(blankDisk.play(),"Playing Shyam by The Man with Metal heart" );
	}
	
	@Test
	public void testTrackSize() {
		assertEquals(blankDisk.getTracksSize(),6);
	}
	
}
