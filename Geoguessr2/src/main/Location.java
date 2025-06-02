package main;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.net.URL;


public class Location {

	private String continent;
	private String country;
	private String subdivision;
	private double latitude;
	private double longitude;
	private Image img;					
	private AffineTransform tx;
	private int vx, vy;							//for movement
	private int x, y;							//position
	private double xScale = 0.3, yScale = 0.27;	//scaling (sizing)
	private int width = 1000, height = 1000;
	
	public Location(String fileName) {
		img = getImage("/imgs/"+fileName); // load the image for Tree

		tx = AffineTransform.getTranslateInstance(0, 0);
			// initialize the location of the image
					// use your variables
		init(x,y);
	}

	
	public Location() {
		img = getImage("/imgs/AFRICA.png"); // load the image for Tree

		tx = AffineTransform.getTranslateInstance(0, 0);
		init(x,y);

	}
	public void paint(Graphics g) {
		//these are the 2 lines of code needed draw an image on the screen
		Graphics2D g2 = (Graphics2D) g;
		g2.drawImage(img, tx, null);

	}

	private void init(double a, double b) {
		tx.setToTranslation(a, b);
		tx.scale(xScale, yScale);
	}
	public void setWidthHeight(int w, int h) {
		this.width = w;
		this.height = h;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setScale(double xScale, double yScale) {
		this.xScale = xScale;
		this.yScale = yScale;
	
	}
	
	
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}


	public double getLat(){
		return latitude;
	}
	
	public void setLat(double lat) {
		latitude = lat;
	}
	
	public double getLong(){
		return latitude;
	}
	
	public void setLong(double lon) {
		longitude = lon;
	}
	
	public String getContinent(){
		return continent;
	}
	
	public void setContinent(String cont) {
		
		continent = cont;
	}
	
	public String getCountry(){
		return country;
	}
	
	public void setCountry(String coun) {
		country = coun;
	}
	
	public String getsubdivision(){
		return subdivision;
	}
	
	public void setsubdivision(String sub) {
		subdivision = sub;
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
	
}
