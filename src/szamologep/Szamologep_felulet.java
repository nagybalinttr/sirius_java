package szamologep;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Szamologep_felulet implements ActionListener{
	String[] numerikusGombok = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
	String[][] logikaiGombok = {{"nullaz", "C"}, {"plusz", "+"}, {"minusz", "-"}, {"szoroz", "*"}, {"oszt", "÷"}, {"eredmeny", "="}};
	
	JFrame keret = new JFrame();
	JPanel panel = new JPanel(new FlowLayout());
	JTextArea szovegmezo = new JTextArea(1, 20);
	
	boolean logikai;
	double szam1, szam2, eredmeny;
	String muvelet;
	
	void felulet()
	{
		keret.setVisible(true);
		keret.setSize(300, 300);
		keret.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		keret.add(panel);
		panel.add(szovegmezo);
		
		for (int i = 0; i < numerikusGombok.length; i++) {
			createBtn(numerikusGombok[i], numerikusGombok[i], false);
		}
		
		for (int i = 0; i < logikaiGombok.length; i++) {
			createBtn(logikaiGombok[i][1], logikaiGombok[i][0], true);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String btnName = ((JButton) e.getSource()).getName();
		
		for (int i = 0; i < numerikusGombok.length; i++) {
			if (btnName == numerikusGombok[i]) {
				szovegmezo.append(numerikusGombok[i]);
				logikai = false;
				break;
			} else {
				logikai = true;
			}
		}
		
		if (logikai) {
			switch (btnName) {
				case "nullaz": 
					szovegmezo.setText("");
				break;
				case "plusz":
					muvelet = "+";
					szam1 = beolvas();
					szovegmezo.setText("");
				break;
				case "minusz":
					muvelet = "-";
					szam1 = beolvas();
					szovegmezo.setText("");
				break;
				case "szoroz":
					muvelet = "*";
					szam1 = beolvas();
					szovegmezo.setText("");	
				break;
				case "oszt":
					muvelet = "/";
					szam1 = beolvas();
					szovegmezo.setText("");
				break;
				case "eredmeny":
					if (szam1 != 0) {
						szam2 = beolvas();
					}
					
					if (szam1 == 0.0 && szam2 != 0.0) {
						szovegmezo.setText(String.valueOf(szam2));
					} else if (szam1 == 0.0 && szam2 == 0.0) { 
						szovegmezo.setText("0");
					} else {
						szovegmezo.setText(szamol(szam1, szam2, muvelet));
					}	
				break;
				default: break;
			}
		}
	}
	
	private Object createBtn(String btnName, String btnMethod, Boolean logicButton)
	{
		if (logicButton) {
			JButton btn = new JButton(btnName);
			btn.setName(btnMethod);
			panel.add(btn);
			btn.addActionListener(this);
		} else {
			JButton btn = new JButton(btnName);
			btn.setName(btnName);
			panel.add(btn);
			btn.addActionListener(this);
		}
		return null;
	}
	
	public double beolvas() {
		return Double.parseDouble(szovegmezo.getText());
	}
	
	public String szamol(double szam1, double szam2, String muvelet)
	{
		double eredmeny = 0;
		
		switch (muvelet) {
			case "+": eredmeny = szam1 + szam2; break;
			case "-": eredmeny = szam1 - szam2; break;
			case "*": eredmeny = szam1 * szam2; break;
			case "/": eredmeny = szam1 / szam2; break;
			default: eredmeny = 0; break;
		}
		
		if (eredmeny != 0) {
			return String.valueOf(eredmeny);
		} else {
			return "Error";
		}
	}
	
	public static void main(String[] args) {
		Szamologep_felulet uj = new Szamologep_felulet();
		uj.felulet();
	}
}
