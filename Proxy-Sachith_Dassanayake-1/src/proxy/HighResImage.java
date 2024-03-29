/**
 * Sachith Dassanayake 
 * Initial Code
 */

package proxy;

public class HighResImage {
	
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

	/**
	 * Method to show the image when required
	 * @return
	 */

	public String showImage() {

		return "Displaying the loaded image : " + this.imagePath;

	}

}
