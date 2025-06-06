package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Scanner;
import javax.swing.Timer;

public class Frame extends JPanel implements ActionListener, MouseListener, KeyListener {
	Location[] continents = new Location[6];
	Location[] countries = new Location[6];
	Location[] subdivisions = new Location[6];

	ArrayList<Location> locations = new ArrayList<Location>();
	int locationNum = 0;

	public void reset() {

	}

	public void nextRound() {

	}

	public void paint(Graphics g) {

		super.paintComponent(g);
		if(locations.size()>1){
			locations.get(locationNum).paint(g);
		}
	}

	public static void main(String[] arg) {
		Frame f = new Frame();
		
	
        
	}

	public Frame() {
		JFrame f = new JFrame("Duck Hunt");
		f.setSize(new Dimension(900, 600));
		f.setBackground(Color.blue);
		f.add(this);
		f.setResizable(false);
		f.setLayout(new GridLayout(1, 2));
		f.addMouseListener(this);
		f.addKeyListener(this);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

		locations.add(new Location("CapeTown.png", "Africa", "South Africa", "Western Cape"));
		locations.add(new Location("UCLA.png", "North America", "USA", "California"));
		locations.add(new Location("UW.png", "North America", "USA", "Washington"));
		locations.add(new Location("Dumbo.png", "North America", "USA", "New York"));
		locations.add(new Location("Rio.png", "South America", "Brazil", "Rio de Janeiro"));
		locations.add(new Location("Agra Fort.png", "Asia", "India", "Uttar Pradesh"));
		locations.add(new Location("Taj Mahal.jpg", "Asia", "India", "Uttar Pradesh"));
		locations.add(new Location("Mumbai.png", "Asia", "India", "Maharashtra"));
		locations.add(new Location("JORDAN.png", "Asia", "Jordan", "Ma'an"));
		locations.add(new Location("Istanbul.png", "Europe", "Turkey", "Marmara Region"));
		locations.add(new Location("Taipei.png", "Asia", "Taiwan", "Taipei city"));
		locations.add(new Location("Fuji.png", "Asia", "Japan", "Yamanashi"));
		locations.add(new Location("Tokyo.png", "Asia", "Japan", "Tokyo"));
		locations.add(new Location("MexicoCity.png", "North America", "Mexico", "Federal District"));
		locations.add(new Location("MexicoCity2.png", "North America", "Mexico", "Federal District"));
		locations.add(new Location("Chichen Itza.png", "North America", "Mexico", "Yucatan"));
		locations.add(new Location("WV.png", "North America", "USA", "California"));
		locations.add(new Location("SF.png", "North America", "USA", "California"));
		locations.add(new Location("ChiTown.jpg", "North America", "USA", "Illinois"));
		locations.add(new Location("Honululu.png", "North America", "USA", "Hawaii"));
		locations.add(new Location("Dubai.png", "Asia", "UAE", "Dubai"));
		locations.add(new Location("Singapore.png", "Asia", "Singapore", "Singapore"));
		locations.add(new Location("Barcelona.png", "Europe", "Spain", "Catalonia"));
		locations.add(new Location("Sydney.png", "Australia", "Australia", "New South Wales"));
		locations.add(new Location("Bangkok.png", "Asia", "Thailand", "Central"));
		locations.add(new Location("Seoul.png", "Asia", "South Korea", "Seoul"));
		
		t.start();
		Scanner input = new Scanner(System.in);
	    
	    System.out.println("Enter your continent guess: ");
        String continent = input.nextLine();
        for(int i =0; i<5; i++) {
        	 if(continent.equals(locations.get(locationNum).getContinent())) {
 	        	System.out.println("Nice! What country?");
 	        	String country = input.nextLine();
 	        	if(country.equals(locations.get(locationNum).getCountry())) {
 	        		System.out.println("Awesome! What state are you thinking?");
 	 	        	String state = input.nextLine();
 	 	        	if(state.equals(locations.get(locationNum).getSubdivision())) {
 	 	        		System.out.println("Wow! You got the exact state! 5000 points");
 	 	        		locationNum++;
 	 	        	}


 	        	}
 	        	

 	        }
 	        else {
 	        	System.out.println("Aww, try again by hitting space");
 	        	locationNum++;
 	        }
        }
       
        
	       


	}

// now
	Timer t = new Timer(16, this);

	@Override
	public void mouseClicked(MouseEvent arg0) {
// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent mouse) {
// TODO Auto-generated method stub

	}

	/*
	 * This code was making oddBod sit at a particular position, we do not want now
	 * if (oddBod.getY() < 400 && oddBod.getY() > 75) {
	 * System.out.println(" Y is 50"); oddBod.setVy(0); }
	 */

	@Override
	public void mouseReleased(MouseEvent arg0) {
// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
// TODO Auto-generated method stub
		repaint();
	}

	@Override
	public void keyPressed(KeyEvent arg0) {

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
// TODO Auto-generated method stub

	}

}