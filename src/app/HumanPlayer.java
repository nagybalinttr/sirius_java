package app;

import java.awt.Color;
import java.awt.Graphics;

public class HumanPlayer implements Player{
	
	double y, yInc;
	int player, x;
	final double GRAVITY = 0.95;
	boolean up, down;
	
	public HumanPlayer(int player) {
		up = false;
		down = false;
		y = 210;
		yInc = 0;
		
		if (player == 1) {
			x = 20;
		} else {
			x = 660;
		}
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(x, (int) y, 20, 80);
	}
	
	public void setUp(boolean in) {
		up = in;
	}
	
	public void setDown(boolean in) {
		down = in;
	}
	
	public void move() {
		if(up) {
			yInc = yInc - 2;
		} else if(down) {
			yInc = yInc + 2;
		} else if (!up && !down) {
			yInc = yInc * GRAVITY;
		}
		
		if (5 < yInc) {
			yInc = 5;
		} else if (yInc < -5) {
			yInc = -5;
		}
		
		if (0 < y) {
			
		} else if (420 < y) {
			y = 420;
		}
		
		y = y + yInc;
	}
	
	public int getY() {
		return (int) y;
	}
}