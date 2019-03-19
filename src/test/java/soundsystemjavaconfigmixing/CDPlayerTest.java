package soundsystemjavaconfigmixing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=SoundSystemConfig.class)
public class CDPlayerTest {
	
	@Autowired
	private CompactDisc cd;
	
	@Autowired
	private MediaPlayer player;
	
	@Autowired
	private BlankDisc allDiscs;

	
	@Test
	public void cdShouldNotBeNull() {
		assertNotNull(cd);
	}
	
	@Test
	public void play()
	{
		String msg = player.play();
		assertEquals(msg,"Playing Lonely hearts club of sgtPeppers");
		System.out.println(allDiscs.play());
	}

}
