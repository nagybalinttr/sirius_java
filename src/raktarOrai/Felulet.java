package raktarOrai;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;


public class Felulet implements ActionListener{

	ArrayList<Termek> l=new ArrayList<Termek>();
	
	public Felulet(ArrayList<Termek> l){
		this.l=l;
	}
	
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	
	JLabel lname=new JLabel("Termék neve:");
	JTextField name=new JTextField(30);
	
	JLabel lar=new JLabel("Termék ára:");
	JTextField ar=new JTextField(10);
	
	JLabel ldb=new JLabel("Termékbõl raktáron van:");
	JTextField db=new JTextField(4);
	
	JButton keres=new JButton("keres");
	JButton plus=new JButton("+");
	JButton minus=new JButton("-");
	
	public void createFelulet(){
		
		frame.setVisible(true);
		frame.setSize(560, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(panel);
		panel.setBackground(Color.cyan);
		panel.add(lname);
		panel.add(name);
		panel.add(keres);
		panel.add(lar);
		panel.add(ar);
		panel.add(ldb);
		panel.add(db);
		
		
		panel.add(plus);
		panel.add(minus);
		
		keres.addActionListener(this);
		plus.addActionListener(this);
		minus.addActionListener(this);
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		
		Object c=e.getSource();
		
		int i;
		if(c==keres){
			
		for(i=0;i<l.size();i++){
			
			if(l.get(i).nev.equals(name.getText())){
				
				ar.setText(String.valueOf(l.get(i).ar));
				db.setText(String.valueOf(l.get(i).db));
			}
			}
		}
		if(c==plus){
			
			for(i=0;i<l.size();i++){
				
				if(l.get(i).nev.equals(name.getText())){
					l.get(i).setDb((l.get(i).db)+1);
					db.setText(String.valueOf(l.get(i).db));
				}
				}
			}
		if(c==minus){
			
			
			for(i=0;i<l.size();i++){
				
				if(l.get(i).nev.equals(name.getText())){
					l.get(i).setDb((l.get(i).db)-1);
					db.setText(String.valueOf(l.get(i).db));
				}
				}
			}
	}
	
	
}
