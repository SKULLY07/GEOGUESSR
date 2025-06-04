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

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Frame extends JPanel implements ActionListener, MouseListener, KeyListener {
	Location[] continents = new Location[6];
	Location[] countries = new Location[6];
	Location[] subdivisions = new Location[6];
	
	
	

	public void reset() {
		
		

	}

	public void nextRound() {

	}

	public void paint(Graphics g) {

		super.paintComponent(g);
		continents[0].paint(g);
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


		t.start();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		continents[0] = new Location("Africa.png", "Africa", "South Africa", "Western Cape");
		continents[1] = new Location("Africa.png", "North America", "USA", "California");
		continents[2] = new Location("Africa.png", "North America", "USA", "Washington");
		continents[2] = new Location("Africa.png", "South America", "Brazil", "Rio de Janeiro");
		continents[2] = new Location("Africa.png", "Asia", "India", "Uttar Pradesh");
		continents[2] = new Location("Africa.png", "Asia", "India", "Uttar Pradesh");
		continents[2] = new Location("Africa.png", "Asia", "India", "Maharashtra");
		continents[4] = new Location("Africa.png", "Asia", "Jordan", "Ma'an");
		continents[4] = new Location("Africa.png", "Europe", "Turkey", "Istanbul");
		continents[4] = new Location("Africa.png", "Asia", "Taiwan", "Taipei city");
		continents[4] = new Location("Africa.png", "Asia", "Japan", "Yamanashi");
		continents[4] = new Location("Africa.png", "Asia", "Jordan", "Ma'an");


		
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