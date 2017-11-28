package szemek;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Felulet implements ActionListener{

	
	JFrame jframe=new JFrame();
	
	JPanel jpanel=new JPanel();
	
	JTextField jsugar=new JTextField(20);
	JTextField jker=new JTextField(20);
	JTextField jter=new JTextField(20);
	
	
	JLabel jlabels=new JLabel("Add meg a kŲr sugarŠt!");
	
	JLabel jlabelk=new JLabel("A kŲr kerŁlete:");
	JLabel jlabelt=new JLabel("A kŲr terŁlete:");
	
	JButton jbutton1=new JButton("SzŠmol");
	

	
	
	
	 void felulet(){
		
		jframe.setVisible(true);
		jframe.setSize(300,200);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		jframe.add(jpanel);
		
		jpanel.add(jlabels);
		jpanel.add(jsugar);
		
		jpanel.add(jlabelk);
		jpanel.add(jker);		
		
		jpanel.add(jlabelt);
		jpanel.add(jter);
		
		jpanel.add(jbutton1);
		jpanel.setBackground(Color.yellow);
		
		jbutton1.addActionListener(this);
		
		
		
	}
	
	 private final static double pi=Math.PI;
		
		public static double kerulet(int r){
			
			double k=2*r*pi;
			
			return k;
		}
		
		public static double terulet(int r){
			
			double t=r*r*pi;
			
			return t;
		}
	 
	private double beolvas(JTextField szov){
		
		double a;
		String s;
		
		s=szov.getText();
		a=Double.valueOf(s);
			
			
		return a;
	}
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		Object click =e.getSource();
		
		
		
		
		if(click==jbutton1){
			int s;
			s=(int) beolvas(jsugar);
			
			
			jker.setText(Double.toString(kerulet(s)));
			jter.setText(Double.toString(terulet(s)));
			
			
		}
		
	}

	

	
	
	

}
