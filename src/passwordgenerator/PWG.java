package passwordgenerator;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JButton;

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
		frmJelszGenerls.setIconImage(Toolkit.getDefaultToolkit().getImage(PWG.class.getResource("/com/sun/javafx/scene/control/skin/caspian/dialog-information@2x.png")));
		frmJelszGenerls.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmJelszGenerls.setModalExclusionType(ModalExclusionType.TOOLKIT_EXCLUDE);
		frmJelszGenerls.setType(Type.POPUP);
		frmJelszGenerls.setTitle("Jelsz\u00F3 gener\u00E1tor");
		frmJelszGenerls.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 13));
		frmJelszGenerls.setBounds(100, 100, 775, 536);
		frmJelszGenerls.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(350, 50, 400, 400);
		frmJelszGenerls.getContentPane().add(scrollPane);
			
		JTextPane textArea = new JTextPane();
		textArea.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		scrollPane.setViewportView(textArea);

		JLabel lblMilyenHosszJelszt = new JLabel("Milyen hossz\u00FA jelsz\u00F3t k\u00E9rsz?");
		lblMilyenHosszJelszt.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblMilyenHosszJelszt.setBounds(24, 61, 166, 14);
		frmJelszGenerls.getContentPane().add(lblMilyenHosszJelszt);
		
		JLabel label = new JLabel("H\u00E1ny darab jelsz\u00F3t k\u00E9rsz?");
		label.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		label.setBounds(36, 91, 154, 14);
		frmJelszGenerls.getContentPane().add(label);
		
		JLabel lblJelszavak = new JLabel("Jelszavak:");
		lblJelszavak.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblJelszavak.setBounds(520, 25, 100, 25);
		frmJelszGenerls.getContentPane().add(lblJelszavak);
		
		JLabel lblMilyenKaraktereketSzeretnl = new JLabel("Milyen karaktereket szeretn\u00E9l l\u00E1tni a jelszavakban?");
		lblMilyenKaraktereketSzeretnl.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblMilyenKaraktereketSzeretnl.setBounds(10, 127, 290, 14);
		frmJelszGenerls.getContentPane().add(lblMilyenKaraktereketSzeretnl);
		
		JLabel lblJelszGenertor = new JLabel("Jelsz\u00F3 gener\u00E1tor");
		lblJelszGenertor.setToolTipText("");
		lblJelszGenertor.setIcon(null);
		lblJelszGenertor.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblJelszGenertor.setBounds(308, 11, 134, 25);
		frmJelszGenerls.getContentPane().add(lblJelszGenertor);
		
		JLabel lblKsztetteNagyBlint = new JLabel("K\u00E9sz\u00EDtette: Nagy B\u00E1lint");
		lblKsztetteNagyBlint.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKsztetteNagyBlint.setBounds(36, 425, 200, 25);
		frmJelszGenerls.getContentPane().add(lblKsztetteNagyBlint);
		
		JLabel label_1 = new JLabel("2016. 10. 30.");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_1.setBounds(36, 449, 200, 25);
		frmJelszGenerls.getContentPane().add(label_1);
		
		JSpinner spinner_hossz = new JSpinner();
		spinner_hossz.setToolTipText("Minimum 8, maximum 25 karakter hossz\u00FA jelsz\u00F3t tudsz k\u00E9rni.");
		spinner_hossz.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		spinner_hossz.setModel(new SpinnerNumberModel(8, 8, 25, 1));
		spinner_hossz.setBounds(200, 50, 100, 25);
		frmJelszGenerls.getContentPane().add(spinner_hossz);
		
		JSpinner spinner_db = new JSpinner();
		spinner_db.setToolTipText("Minimum 3db, maximum 5000db jelsz\u00F3t tudsz k\u00E9rni!");
		spinner_db.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		spinner_db.setModel(new SpinnerNumberModel(3, 3, 5000, 1));
		spinner_db.setBounds(200, 80, 100, 25);
		frmJelszGenerls.getContentPane().add(spinner_db);
		frmJelszGenerls.getContentPane().setLayout(null);
		
		JCheckBox check_nagybetu = new JCheckBox("Nagybet\u0171");
		check_nagybetu.setToolTipText("Szeretn\u00E9l nagybet\u0171ket a jelszavakba?");
		check_nagybetu.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		check_nagybetu.setBounds(90, 150, 100, 25);
		frmJelszGenerls.getContentPane().add(check_nagybetu);
		
		JCheckBox check_szam = new JCheckBox("Sz\u00E1m");
		check_szam.setToolTipText("Szeretn\u00E9l sz\u00E1mokat a jelszavadba?");
		check_szam.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		check_szam.setBounds(90, 178, 100, 25);
		frmJelszGenerls.getContentPane().add(check_szam);
		
		JCheckBox check_spec = new JCheckBox("Speci\u00E1lis karakter");
		check_spec.setToolTipText("Szeretn\u00E9l speci\u00E1lis karaktereket a jelszavadba?");
		check_spec.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		check_spec.setBounds(90, 206, 125, 25);
		frmJelszGenerls.getContentPane().add(check_spec);
		
		JButton btnGeneral = new JButton("Gener\u00E1l\u00E1s");
		btnGeneral.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnGeneral.setBounds(49, 238, 200, 25);
		btnGeneral.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int hossz = 0;
				int db = 0;
				int a_max = 0;
				int vegleges_tomb_hossza = 0;
				Boolean kisbetu = true;
				Boolean nagybetu = false;
				Boolean szam = false;
				Boolean spec = false;
				
				String[] tomb_kisbetu = {"q", "w", "e", "r", "t", "z", "u", "i", "o", "p", "a", "s", "d", "f", "g", "h", "j", "k", "l", "y", "x", "c", "v", "b", "n", "m"};
				String[] tomb_nagybetu = {"Q", "W", "E", "R", "T", "Z", "U", "I", "O", "P", "A", "S", "D", "F", "G", "H", "J", "K", "L", "Y", "X", "C",  "V", "B", "N", "M"};
				String[] tomb_szam = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
				String[] tomb_spec = {"+", "!", "%", "/", "=", "(", ")", "<", ">", "&", "@", "{", "}", "["};
				
				hossz = (int) spinner_hossz.getValue();
				db = (int) spinner_db.getValue();
				nagybetu = check_nagybetu.isSelected();
				szam = check_szam.isSelected();
				spec = check_spec.isSelected();
				//JOptionPane.showMessageDialog(null, check_nagybetu.isSelected());
				
				//hossz es db szam ellenorzes
				if(hossz >= 8 && hossz <= 25 && db >= 3 && db <= 5000){
					//a vegleges tomb hosszanak meghatarozasa
					if(kisbetu){vegleges_tomb_hossza += tomb_kisbetu.length;}
					if(nagybetu){vegleges_tomb_hossza += tomb_nagybetu.length;}
					if(szam){vegleges_tomb_hossza += tomb_szam.length;}
					if(spec){vegleges_tomb_hossza += tomb_spec.length;}		
					String[] tomb_vegleges = new String[vegleges_tomb_hossza];
					
					//vegleges tomb elmeinek inicializalasa
					if(kisbetu){
						for(int a = 0, b = 0; b < tomb_kisbetu.length; a++, b++){
							tomb_vegleges[a] = tomb_kisbetu[b];
							a_max = a;
						}
					}
					if(nagybetu){
						if(a_max != 0){ //erre azert van szukseg mert ha az elozo feltetelek kozul valamelyik false volt akkor az a_max erteke a cikus kezdetekor 1 lenne es igy a tomb_vegleges[0] helyen nem kerulne feltoltesre
							a_max++; //azert novelem a_max-ot hogy ne legyen felulirva a tomb_vegleges[] utolso helyen szereplo ertek
						}
						for(int a = a_max, b = 0; b < tomb_nagybetu.length; a++, b++){
							tomb_vegleges[a] = tomb_nagybetu[b];
							a_max = a;
						}
					}
					if(szam){
						if(a_max != 0){ //erre azert van szukseg mert ha az elozo feltetelek kozul valamelyik false volt akkor az a_max erteke a cikus kezdetekor 1 lenne es igy a tomb_vegleges[0] helyen nem kerulne feltoltesre
							a_max++; //azert novelem a_max-ot hogy ne legyen felulirva a tomb_vegleges[] utolso helyen szereplo ertek
						}
						for(int a = a_max, b = 0; b < tomb_szam.length; a++, b++){
							tomb_vegleges[a] = tomb_szam[b];
							a_max = a;
						}
					}
					if(spec){
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
				// hibauzenetek
				else if(db < 3 && hossz < 8){
					JOptionPane.showMessageDialog(null, "Minimum 8 karakterbõl kell álnia a jelszavadnak és minimum 3db-ot kell kérned!");
				}
				else if(db > 5000 && hossz > 25){
					JOptionPane.showMessageDialog(null, "Maximum 25 karakterbõl állhat a jelszavad és maximum 5000db jelszót kérhetsz!");
				}
				else if(hossz < 8){
					JOptionPane.showMessageDialog(null, "Minimum 8 karakterbõl kell állnia a jelszónak!");
				}
				else if(hossz > 25){
					JOptionPane.showMessageDialog(null, "Maximum 25 karakterbõl állhat a jelszó!");
				}
				else if(db < 3){
					JOptionPane.showMessageDialog(null, "Minimum 3db jelszót kell kérned!");
				}
				else if(db > 5000){
					JOptionPane.showMessageDialog(null, "Maximum 5000db jelszót kérhetsz!");
				}
			}
		});
		frmJelszGenerls.getContentPane().add(btnGeneral);
	}
}
