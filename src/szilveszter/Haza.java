package szilveszter;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Haza {

	int[][] steps = {
			{1,1,1,0,1,0,1,0,1,1,1,0,1,0,0,1},
			{1,0,0,1,0,1,0,1,0,0,0,1,0,1,1,1}
	};
	
	int x;
	
	private static final int left = 100;
	private static final int right = 180;
	private static final int Fwidth = 60;
	private static final int Fheight = 20;
	
	private static final String LeftFoot = "/Users/balintnagy/sirius_java/src/szilveszter/footprint-left.png";
	private static final String RightFoot = "/Users/balintnagy/sirius_java/src/szilveszter/footprint-right.png";
	
	ImageIcon imgL = new ImageIcon();
	ImageIcon imgR = new ImageIcon();
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	public void createFelulet() {

		frame.setVisible(true);
		frame.setSize(1300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.setBackground(Color.white);
		imgL = new ImageIcon(LeftFoot);
		imgR = new ImageIcon(RightFoot);
		
		for (int i = 0; i < 16; i++) {
			System.out.println("BUÉK" + i);
			x = i * 60;
			if (steps[0][i] == 1) {
				//bal
				JLabel kep = new JLabel();
				kep.setIcon(imgL);
				panel.add(kep);
				kep.setBounds(x, left, 60, 20);
			} else if (steps[1][i] == 1) {
				//jobb
				JLabel kep = new JLabel();
				kep.setIcon(imgR);
				panel.add(kep);
				kep.setBounds(x, right, 60, 20);
			} else if (steps[0][i] == 1 && steps[1][i] == 1) {
				JLabel kep = new JLabel();
				kep.setIcon(imgL);
				panel.add(kep);
				kep.setBounds(x, left, 60, 20);
				
				JLabel kep2 = new JLabel();
				kep2.setIcon(imgR);
				panel.add(kep);
				kep2.setBounds(x, right, 60, 20);
			}
		}
	}
	
	public static void main(String[] args) {
		Haza h = new Haza();
		h.createFelulet();
	}
}
