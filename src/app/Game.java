package app;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@SuppressWarnings("deprecation")
public class Game extends Applet implements KeyListener, Runnable {

	final int WIDTH = 700, HEIGHT = 500;

	Thread thread;

	HumanPlayer p1;

	public void init() {
		this.setSize(WIDTH, HEIGHT);
		this.addKeyListener(this);

		p1 = new HumanPlayer(1);

		thread = new Thread(this);
		thread.start();
		
	}

	public void paint(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, WIDTH, HEIGHT);

		p1.draw(g);
	}

	public void update(Graphics g) {
		paint(g);
	}

	public void run() {
		for (;;) {
			p1.move();
			repaint();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void keyTyped(KeyEvent e) {

	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			p1.setUp(true);
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			p1.setDown(true);
		}
	}

	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			p1.setUp(false);
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			p1.setDown(false);
		}
	}
}
