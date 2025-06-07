package main;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.net.URL;

public class Map {
	
	private Image img;
	private AffineTransform tx;
	private int x,y;
	private double xScale, yScale;

	public Map(String image) {
		img = getImage("/imgs/"+image); // load the image for Tree
		
		tx = AffineTransform.getTranslateInstance(0, 0);
			// initialize the location of the image
					// use your variables
		init(x-100,y-100);
	}
		
		private Image getImage(String path) {
			Image tempImage = null;
			try {
				URL imageURL = Location.class.getResource(path);
				tempImage = Toolkit.getDefaultToolkit().getImage(imageURL);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return tempImage;
		
	}
		private void init(double a, double b) {
			tx.setToTranslation(a, b);
			tx.scale(xScale, yScale);
		}


}
