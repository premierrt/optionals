package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import opcjonale.JakisSerwis;

public class JakisSerwisTest {

	private JakisSerwis serwis;
	
	@Before
	public void init(){
		 serwis = new JakisSerwis();
	}
	
	@Test
	public void testSprawdzFlageNPL() {
		Assert.assertNotNull( serwis.sprawdzFlageNPL());
	}

	@Test
	public void testSprawdzFlageOptional() {
		Assert.assertNotNull(serwis.sprawdzFlageOptional());	
		}

	@Test
	public void testSprawdzFlagaOptionalZParametrem(){
		Assert.assertNull(serwis.sprawdzFlageOptionalZParmaterm(null));
		Assert.assertEquals(true, serwis.sprawdzFlageOptionalZParmaterm(true));
		Assert.assertEquals(false, serwis.sprawdzFlageOptionalZParmaterm(false));
		
	}
}
