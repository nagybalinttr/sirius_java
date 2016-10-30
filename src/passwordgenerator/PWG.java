package passwordgenerator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Checkbox;
import java.awt.TextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;

public class PWG {

	private JFrame frmJelszGenerls;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PWG window = new PWG();
					window.frmJelszGenerls.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PWG() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJelszGenerls = new JFrame();
		frmJelszGenerls.setTitle("Jelsz\u00F3 gener\u00E1l\u00E1s");
		frmJelszGenerls.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
		frmJelszGenerls.setBounds(100, 100, 775, 536);
		frmJelszGenerls.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Checkbox checkbox = new Checkbox("Nagybet\u0171");
		checkbox.setBounds(45, 80, 95, 25);
		frmJelszGenerls.getContentPane().add(checkbox);
		Checkbox checkbox_1 = new Checkbox("Sz\u00E1m");
		checkbox_1.setBounds(145, 80, 95, 25);
		frmJelszGenerls.getContentPane().add(checkbox_1);
		
		Checkbox checkbox_2 = new Checkbox("Spec karakter");
		checkbox_2.setBounds(90, 100, 100, 25);
		frmJelszGenerls.getContentPane().add(checkbox_2);
		
		TextField textField = new TextField();
		textField.setText("8");
		textField.setBounds(200, 20, 100, 25);
		frmJelszGenerls.getContentPane().add(textField);
		
		TextField textField_1 = new TextField();
		textField_1.setText("3");
		textField_1.setBounds(200, 50, 100, 25);
		frmJelszGenerls.getContentPane().add(textField_1);

		JLabel lblMilyenHosszJelszt = new JLabel("Milyen hossz\u00FA jelsz\u00F3t k\u00E9rsz?");
		lblMilyenHosszJelszt.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMilyenHosszJelszt.setBounds(10, 25, 185, 14);
		frmJelszGenerls.getContentPane().add(lblMilyenHosszJelszt);
		
		JLabel label = new JLabel("H\u00E1ny darab jelsz\u00F3t k\u00E9rsz?");
		label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label.setBounds(20, 53, 175, 14);
		frmJelszGenerls.getContentPane().add(label);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(350, 50, 400, 400);
		frmJelszGenerls.getContentPane().add(scrollPane);
			
		JTextPane textArea = new JTextPane();
		scrollPane.setViewportView(textArea);
		textArea.setEditable(false);
		
		JLabel lblJelszavak = new JLabel("Jelszavak:");
		lblJelszavak.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblJelszavak.setBounds(520, 25, 100, 25);
		frmJelszGenerls.getContentPane().add(lblJelszavak);
		
		Button button = new Button("Gener\u00E1l\u00E1s");
		button.setBounds(45, 144, 200, 25);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int hossz = 0;
				int db = 0;
				int a_max = 0;
				int vegleges_tomb_hossza = 0;
				String kisbetu = "true";
				String nagybetu = null;
				String szam = null;
				String spec = null;
				
				String[] tomb_kisbetu = {"q", "w", "e", "r", "t", "z", "u", "i", "o", "p", "a", "s", "d", "f", "g", "h", "j", "k", "l", "y", "x", "c", "v", "b", "n", "m"};
				String[] tomb_nagybetu = {"Q", "W", "E", "R", "T", "Z", "U", "I", "O", "P", "A", "S", "D", "F", "G", "H", "J", "K", "L", "Y", "X", "C",  "V", "B", "N", "M"};
				String[] tomb_szam = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
				String[] tomb_spec = {"+", "!", "%", "/", "=", "(", ")", "<", ">", "&", "@", "{", "}", "["};
				
				hossz = Integer.parseInt(textField.getText());
				db = Integer.parseInt(textField_1.getText());
				nagybetu = String.valueOf(checkbox.getState());
				szam = String.valueOf(checkbox_1.getState());
				spec = String.valueOf(checkbox_2.getState());
				
				//hossz es db szam ellenorzes
				if(hossz < 8){
					hossz = 8;
				}
				if(db < 3){
					db = 3;
				}
				
				//a vegleges tomb hosszanak meghatarozasa
				if(kisbetu.equals("true")){vegleges_tomb_hossza += tomb_kisbetu.length;}
				if(nagybetu.equals("true")){vegleges_tomb_hossza += tomb_nagybetu.length;}
				if(szam.equals("true")){vegleges_tomb_hossza += tomb_szam.length;}
				if(spec.equals("true")){vegleges_tomb_hossza += tomb_spec.length;}		
				String[] tomb_vegleges = new String[vegleges_tomb_hossza];
				
				//vegleges tomb elmeinek inicializalasa
				if(kisbetu.equals("true")){
					for(int a = 0, b = 0; b < tomb_kisbetu.length; a++, b++){
						tomb_vegleges[a] = tomb_kisbetu[b];
						a_max = a;
					}
				}
				if(nagybetu.equals("true")){
					if(a_max != 0){ //erre azert van szukseg mert ha az elozo feltetelek kozul valamelyik false volt akkor az a_max erteke a cikus kezdetekor 1 lenne es igy a tomb_vegleges[0] helyen nem kerulne feltoltesre
						a_max++; //azert novelem a_max-ot hogy ne legyen felulirva a tomb_vegleges[] utolso helyen szereplo ertek
					}
					for(int a = a_max, b = 0; b < tomb_nagybetu.length; a++, b++){
						tomb_vegleges[a] = tomb_nagybetu[b];
						a_max = a;
					}
				}
				if(szam.equals("true")){
					if(a_max != 0){ //erre azert van szukseg mert ha az elozo feltetelek kozul valamelyik false volt akkor az a_max erteke a cikus kezdetekor 1 lenne es igy a tomb_vegleges[0] helyen nem kerulne feltoltesre
						a_max++; //azert novelem a_max-ot hogy ne legyen felulirva a tomb_vegleges[] utolso helyen szereplo ertek
					}
					for(int a = a_max, b = 0; b < tomb_szam.length; a++, b++){
						tomb_vegleges[a] = tomb_szam[b];
						a_max = a;
					}
				}
				if(spec.equals("true")){
					if(a_max != 0){ //erre azert van szukseg mert ha az elozo feltetelek kozul valamelyik false volt akkor az a_max erteke a cikus kezdetekor 1 lenne es igy a tomb_vegleges[0] helyen nem kerulne feltoltesre
						a_max++; //azert novelem a_max-ot hogy ne legyen felulirva a tomb_vegleges[] utolso helyen szereplo ertek
					}
					for(int a = a_max, b = 0; b < tomb_spec.length; a++, b++){
						tomb_vegleges[a] = tomb_spec[b];
						a_max = a;
					}
				}
				
				// jelszavak eloallitasa
				String jelszo_out = "";
				for(int j = 1; j <= db; j++){
					String jelszo = ""; //Azert kell itt deklaralni a valtozot mert amikor a belso for ciklus lefut utana a kovetkezp jelszohoz egy ures valtozora van szukseg kulonben a ".concat()" hozza fuzi a z elozo jelszohoz a random karakter
					for(int i = 0; i < hossz; i++){
						Random ran = new Random();
						int x = ran.nextInt(tomb_vegleges.length);
						jelszo = jelszo.concat(tomb_vegleges[x]); //A ".concat()" fuzi hozza a veletlen karakter a jelszo valtozomhoz
					}
					jelszo_out = jelszo_out.concat(jelszo) + "\n";
				}
				
				//jelszavak kiiratasa
				textArea.setText(jelszo_out);
			}
		});
		frmJelszGenerls.getContentPane().setLayout(null);
		frmJelszGenerls.getContentPane().add(button);
	}
}
