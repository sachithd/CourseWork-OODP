/**
 * Sachith Dassanayake 
 * 
 */
package factory;

public class ImageFactory {
	
    public static ImageReader getImageFactoryObject(String fileExtension) {
        if (fileExtension.equalsIgnoreCase("gif"))
        {
           return new GifFileType();
        } 
        else if(fileExtension.equalsIgnoreCase("jpg"))
        {
           return new JpgFileType();
        }
        else
        {
        	return new OtherFileType();
        }
     }

}
