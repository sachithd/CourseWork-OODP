/**
 * Sachith Dassanayake 
 * Proxy Factory Patten Test Case
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
	 *  Test case for extending the Proxy pattern with the Factory design pattern
	 */
	
	@Test
	public void test() {
		
		String expectedResults = "gif file reading logic";
		String stringReturned = "";
				
		
		Pictures hRI1 = new ImageProxy("Image 1");
		Pictures hRI2 = new ImageProxy("Image 2");
		Pictures hRI3 = new ImageProxy("Image 3");
		
		//We assume Image 2 is a gif file type
		stringReturned= hRI2.showImage();
		assertEquals("Wrong ", stringReturned, expectedResults);
	}
	

}
