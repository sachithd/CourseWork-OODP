/**
 * Sachith Dassanayake 
 * Initial Code
 */


package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import proxy.HighResImage;


public class ProxyTest {

	@Before
	public void setUp() throws Exception {
	}

	
	/**
	 * Test for code with out any pattern
	 */
	@Test
	public void test() {
		
		String expectedResults = "Displaying the loaded image : Image 2";
		String stringReturned = "";
				
		
		HighResImage hRI1 = new HighResImage("Image 1");
		HighResImage hRI2 = new HighResImage("Image 2");
		HighResImage hRI3 = new HighResImage("Image 3");
		
		stringReturned= hRI2.showImage();
		assertEquals("Wrong ", stringReturned, expectedResults);
	}
	


}
