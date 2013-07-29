/**
 * Sachith Dassanayake 
 * Proxy Patten Test Case
 */


package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import proxy.HighResImage;
import proxy.ImageProxy;
import proxy.Pictures;

public class ProxyTest {

	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test after implementing the proxy
	 * Now the images are not loaded until we call the method showImage()
	 */
	
	@Test
	public void test2() {
		
		String expectedResults = "Displaying the loaded image : Image 2";
		String stringReturned = "";
				
		
		Pictures hRI1 = new ImageProxy("Image 1");
		Pictures hRI2 = new ImageProxy("Image 2");
		Pictures hRI3 = new ImageProxy("Image 3");
		
		stringReturned= hRI2.showImage();
		assertEquals("Wrong ", stringReturned, expectedResults);
	}

}
