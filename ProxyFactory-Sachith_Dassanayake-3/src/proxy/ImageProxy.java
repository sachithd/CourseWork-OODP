/**
 * Sachith Dassanayake 
 * 
 */
package proxy;

public class ImageProxy implements Pictures {
	
	private String imagePath;
	
	/**
	 * Reference to HighResImage
	 */
	private HighResImage highResImage;
	
	public ImageProxy(String imagePath) {
		this.imagePath= imagePath;	
	}

	@Override
	public String showImage() {
	
		String outPut;
		
		// create the Image Object only when the image is needed to be displayed
		if (highResImage == null) {
			highResImage = new HighResImage(this.imagePath);
         } 
		
		// call showImage method on HighResImage
		outPut = highResImage.showImage();
		return outPut;
		
	}

}
