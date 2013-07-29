/**
 * Sachith Dassanayake 
 * 
 */
package proxy;

import factory.ImageFactory;

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
	@Override
	public String showImage() {
		
		/**
		 *  Code to determine the file extension
		 *  In this example we assume the file extension is gif
		 */
		
		String fileExtension = "gif";
		
		//ImageFactory imagef = new ImageFactory();
		return ImageFactory.getImageFactoryObject(fileExtension).getImage();
		
		//return "Displaying the loaded image : " + this.imagePath;

	}
	

}
