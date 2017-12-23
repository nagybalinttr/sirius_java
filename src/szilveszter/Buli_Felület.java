package szilveszter;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class Buli_Felület implements ActionListener{

	Buli b=new Buli();
	
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	
	JLabel lfo=new JLabel("Élelmiszerek kezelõfelülete");
	JLabel ln=new JLabel("Élelmiszer neve:");
	JLabel lm=new JLabel("Mennyiség:");
	JLabel lmi=new JLabel("Étel vagy ital:");
	JLabel lkh=new JLabel("Ki hozza:");
	
	JTextField n=new JTextField(10);
	JTextField m=new JTextField(10);
	JTextField mi=new JTextField(10);
	JTextField kh=new JTextField(10);
	
	
	
	
	JButton fel=new JButton("Felvisz");
	JButton cs=new JButton("Csökkent");
	
	public void createFelület(){
		
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 250);
		panel.setLayout(null);
		frame.add(panel);
		
		
		panel.add(lfo);
		lfo.setBounds(15, 10, 190, 20);
		
		panel.add(ln);
		ln.setBounds(0, 50, 110, 20);
		panel.add(n);
		n.setBounds(100, 50, 150, 20);
		
		
		panel.add(lm);
		lm.setBounds(0, 70, 100, 10);
		panel.add(m);
		m.setBounds(100, 70, 150, 20);
		
		panel.add(lmi);
		lmi.setBounds(0, 90, 100, 10);
		panel.add(mi);
		mi.setBounds(100, 90, 150, 20);
		
		
		
		panel.add(lkh);
		lkh.setBounds(0, 110, 100, 10);
		panel.add(kh);
		kh.setBounds(100, 110, 150, 20);
		
		
		
		
		
		panel.add(fel);
		fel.setBounds(35,160,200,20);
		
		panel.add(cs);
		cs.setBounds(35,180,200,20);
		
		cs.addActionListener(this);
		fel.addActionListener(this);
		
	}

	
	private boolean beolvasbool(JTextField sz){
		Boolean szam;
		
		szam=Boolean.valueOf(sz.getText());
		
		return szam;
		
	}
	private int beolvas(JTextField sz){
		int szam;
		
		szam=Integer.valueOf(sz.getText());
		
		return szam;
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		
		Object lenyom= e.getSource();
		
		if(lenyom==fel){
			
			
			String nev=n.getText();
			n.setText("");
			
			int meny=beolvas(m);
			m.setText("");
			
			boolean miaz=beolvasbool(mi);
			mi.setText("");
			
			String ki=kh.getText();
			kh.setText("");
			
			
			
			Élelmiszer e1=new Élelmiszer(nev,meny,miaz,ki);
			
			b.Vettek(e1);
			kiir(b);
			
		}
		if(lenyom==cs){
			String nev=n.getText();
			n.setText("");
			
			int meny=beolvas(m);
			m.setText("");
			
			boolean miaz=beolvasbool(mi);
			mi.setText("");
			
			String ki=kh.getText();
			kh.setText("");
			
			
			
			Élelmiszer e1=new Élelmiszer(nev,meny,miaz,ki);
			
			b.Elfogyott(e1);
			
		}
	}
	
		
	public static void main (String agrs[]){
		Buli_Felület bf=new Buli_Felület();
		
		bf.createFelület();
	}
	
	
	
	private void kiir(Buli b){
		int i;
		
		for(i=0;i<b.getÉlelmiszerek().size();i++){
			System.out.println(b.getÉlelmiszerek().get(i));
		}
	}
	
	
}

