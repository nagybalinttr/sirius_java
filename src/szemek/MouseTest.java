package szemek;


import java.applet.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseTest  extends Applet implements MouseListener{

	public static final int RADIUS=7;
	
	int x=-1, y=-1; // azert ennyi, hogy ne latszon amig az egeret ra nem visszŁk az appletre
	
	public void init(){
		addMouseListener(this);
	}
		
	
	
	public void paint (Graphics g){
		
		g.setColor(Color.white);
		g.fillRect(0, 0, getSize().width-1, getSize().height-1);
		
		g.setColor(Color.BLACK);
		g.drawRect(0, 0, getSize().width-1, getSize().height-1);
	
		
		g.setColor(Color.RED);
		
		if(x>=0 && y>=0){
			g.fillOval(x, y,RADIUS*2 ,RADIUS*2);
		}	
	
	}
	
	public void update(Graphics g){
		paint(g);
	}

	public void mousePressed(MouseEvent e){
		x=e.getX();
		y=e.getY();
		
		repaint();
	}
	public void mouseClicked(MouseEvent e){}	
	public void mouseReleased(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e) {}

	
	
}
