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
	private double xScale = 1.0, yScale = 1.0;	//scaling (sizing)
	private int width = 50, height = 50;
	
	public Location(String fileName) {
		img = getImage("/imgs/"+fileName); // load the image for Tree

		tx = AffineTransform.getTranslateInstance(0, 0);
			// initialize the location of the image
					// use your variables
	}

	
	public Location() {
		img = getImage("/imgs/duck.gif"); // load the image for Tree

		tx = AffineTransform.getTranslateInstance(0, 0);
		
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

	public Location( String cont, String coun, String sub, double lat, double lon) {
	
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
			URL imageURL = Background.class.getResource(path);
			tempImage = Toolkit.getDefaultToolkit().getImage(imageURL);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tempImage;
	}
	
}
