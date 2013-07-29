/**
 * Sachith Dassanayake 
 * Proxy Pattern
 */

package proxy;

public class HighResImage implements Pictures {
	
	private String imagePath;

	/**
	 * HighResImage Constructor calls the loadImage method. 
	 * 
	 * @param imagePath
	 */
	public HighResImage(String imagePath) {

		this.imagePath = imagePath;
		loadImage();
	}
	
	/**
	 * Method to load the image from the disk into the memory
	 * Expensive Operation
	 * @param imagePath
	 */
	private void loadImage() {

		System.out.println("Loading High Resolution image : " + this.imagePath);
		
	}

	/* (non-Javadoc)
	 * @see proxy.Pictures#showImage()
	 */
	//@Override
	@Override
	public String showImage() {

		return "Displaying the loaded image : " + this.imagePath;

	}

}
