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

	
	}

	public void reset() {
		
		

	}

	public void nextRound() {

	}

	public void paint(Graphics g) {
		super.paintComponent(g);

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
		Rectangle rMouse = new Rectangle(mouse.getX(), mouse.getY(), 25, 25);

		Rectangle rMain = new Rectangle(oddBod.getX(), oddBod.getY(), oddBod.getWidth(), oddBod.getHeight());

		System.out.println("orig oddBod getX::" + oddBod.getX());
		System.out.println("orig oddBod getY::" + oddBod.getY());
// OddBod will fall down when the mouse is clicked on it
		if (rMouse.intersects(rMain)) {
			System.out.println("oddBod getX::" + oddBod.getX());
			System.out.println("oddBod getY::" + oddBod.getY());
			oddBod.setVy(10);
			oddBod.setVx(0);
			score++;

// Now that mouse clicked oddBod; duck will come now to pick up the oddBod
			duck.setX(oddBod.getX());
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			}

// Now check duck X and oddBod X position;
// matching then both oddBod and duck will go together towards right
			System.out.println("duck getX::" + duck.getX());
			int loopCounter = 0;
			while (true) {
				if (duck.getX() == oddBod.getX()) {
					System.out.println("duck and oddBod met at X:: " + duck.getX());
					duck.setVx(0);
				}
				loopCounter++;
				if (loopCounter == 500) {
					break;
				}
			}

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
// TODO Auto-generated method stub
		System.out.println(arg0.getKeyCode());

// spacebar continuye the round
		if (arg0.getKeyCode() == 32) {
// if(t.isRunning()) {
			t.start();
// }
			reset();
		}
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