package jesus_express;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.*;

public class Felület implements ActionListener {
	static Kiszallitas k1 = new Kiszallitas("Maci", "Méz", 1, "2017-12-24", true);
	static Kiszallitas k2 = new Kiszallitas("Tigris", "Festék", 5, "2017-12-24", true);
	static Kiszallitas k3 = new Kiszallitas("Zsebi baba", "Méz", 3, "2017-12-27", true);
	static Kiszallitas k4 = new Kiszallitas("Malacka", "Borsó", 100, "2017-12-26", true);
	static Kiszallitas k5 = new Kiszallitas("Nyuszi", "Répa", 10, "2017-12-25", false);
	
	static ArrayList<Kiszallitas> list = new ArrayList<Kiszallitas>();
	
	/* felulet */
	static SpinnerModel mennyitmodel = new SpinnerNumberModel(1, 1, 10, 1);
	
	static int currentYear = Calendar.getInstance().get(Calendar.YEAR);
	static int min = currentYear - 0;
	static int max = currentYear + 10;
	static int step = 1;
	static SpinnerModel evlista = new SpinnerNumberModel(currentYear, min, max, step);

	//static String[] honapok = { "Január", "Február", "Március", "Június", "Július", "Augusztus", "Szeptember", "Október", "December" };
	//static SpinnerListModel honaplistamodel = new SpinnerListModel(honapok);
	static SpinnerModel honaplistamodel = new SpinnerNumberModel(1, 1, 12, 1);
	
	static SpinnerModel napok = new SpinnerNumberModel(1, 1, 31, 1);

	static JFrame keret = new JFrame();
	JPanel felso = new JPanel();
	JPanel also = new JPanel();
	JPanel bal = new JPanel();
	JPanel jobb = new JPanel();
	JPanel sor1 = new JPanel();
	JPanel sor2 = new JPanel();
	JPanel sor3 = new JPanel();
	JPanel sor4 = new JPanel();
	JPanel sor5 = new JPanel();
	JPanel sor6 = new JPanel();

	JLabel kinekText = new JLabel("Kinek adjam az ajándékot?");
	static JTextField kinek = new JTextField(15);

	JLabel mitText = new JLabel("Mit adjak ajándékba?");
	static JTextField mit = new JTextField(15);

	JLabel mennyitText = new JLabel("Mennyit adjak neki?");
	static JSpinner mennyit = new JSpinner(mennyitmodel);

	JLabel mikorText = new JLabel("Mikor vigyel el neki?");

	static JSpinner mikorEv = new JSpinner(evlista);
	static JSpinner mikorHo = new JSpinner(honaplistamodel);
	static JSpinner mikorNap = new JSpinner(napok);

	JLabel sikeresText = new JLabel("Sikeresen a szállítás?");
	static JRadioButton option1 = new JRadioButton("Sikeres");
	static JRadioButton option2 = new JRadioButton("Sikertelen");
	ButtonGroup group = new ButtonGroup();

	static JButton mentes = new JButton("Mentés / Módosítás");
	static JButton kereses = new JButton("Keresés");
	
	static JLabel statusHL = new JLabel("Művelet állapota:");
	static JLabel statusMsg = new JLabel("");

	final static String picPath = "/Users/balintnagy/sirius_java/src/jesus_express/giphy.gif";
	ImageIcon img = new ImageIcon(picPath);
	JLabel imgLabel = new JLabel();
	
	public void felulet() {
		keret.add(felso);
		felso.add(bal);
		
		// 1 sor
		bal.add(kinekText); bal.add(sor1); sor1.add(kinek);
		
		// 2 sor
		bal.add(mitText); bal.add(sor2); sor2.add(mit);

		// 3 sor
		bal.add(mennyitText); bal.add(sor3); mennyit.setPreferredSize(new Dimension(100, 20)); sor3.add(mennyit);
		
		// 4 sor
		bal.add(mikorText); bal.add(sor4); mikorEv.setPreferredSize(new Dimension(75, 20)); mikorHo.setPreferredSize(new Dimension(50, 20)); mikorNap.setPreferredSize(new Dimension(50, 20)); sor4.add(mikorEv); sor4.add(mikorHo); sor4.add(mikorNap);

		// 5 sor
		bal.add(sikeresText); bal.add(sor5); group.add(option1); group.add(option2); sor5.setLayout(new FlowLayout()); sor5.add(option1); sor5.add(option2);

		// 6 sor
		bal.add(kereses); bal.add(mentes);
		
		bal.setLayout(new GridLayout(6, 2));
		
		felso.add(jobb);
		jobb.add(imgLabel);
		imgLabel.setIcon(img);
		imgLabel.setBounds(0, 0, 60, 20);
		
		keret.add(also);
		also.add(statusHL); also.add(statusMsg);
		also.setLayout(new GridLayout(1, 2));
		
		keret.setLayout(new GridLayout(2, 1));
		
		keret.setSize(750, 750);
		keret.setVisible(true);
		keret.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void kereses()
	{
		String person = kinek.getText();
		Boolean empty = true;
		
		for (int i = 0; i < list.size(); i++) {
			if ((list.get(i).Addressee.toLowerCase()).equals(person.toLowerCase())) {
				empty = false;
				
				mit.setText(list.get(i).GiftName);
				mennyit.setValue(list.get(i).pty);
				String[] parts = list.get(i).date.split("-");
				mikorEv.setValue(Integer.parseInt(parts[0]));
				mikorHo.setValue(Integer.parseInt(parts[1]));
				mikorNap.setValue(Integer.parseInt(parts[2]));
				
				if (list.get(i).IsSuccess) {
					option1.setSelected(true);
					option2.setSelected(false);
				} else {
					option1.setSelected(false);
					option2.setSelected(true);
				}
				statusMsg.setText("A találatot megtalálod a fenti boxoba beírva.");
			}
		}
		
		if (empty) {
			statusMsg.setText("Nincs találat");
		}
	}
	
	public void mentes()
	{
		String person = kinek.getText();
		String gift = mit.getText();
		int pty = (int) mennyit.getValue();
		String time = mikorEv.getValue() + "-" + mikorHo.getValue() + "-" + mikorNap.getValue();
		Boolean status = option1.isSelected();
		
		for (int i = 0; i < list.size(); i++) {
			if ((list.get(i).Addressee.toLowerCase()).equals(person.toLowerCase())) {
				list.set(i, new Kiszallitas(person, gift, pty, time, status));
				statusMsg.setText("Sikeres módosítás!");
			} else {
				list.add(new Kiszallitas(person, gift, pty, time, status));
				statusMsg.setText("Sikeres mentés!");
			}
		}
		/*
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).Addressee);
			System.out.println(list.get(i).GiftName);
			System.out.println(list.get(i).pty);
			System.out.println(list.get(i).date);
			System.out.println(list.get(i).IsSuccess);
			System.out.println("");
		}
		*/
	}
	
	public void actionPerformed(ActionEvent event) {

	}

	public static void main(String[] args) {
		list.add(k1);
		list.add(k2);
		list.add(k3);
		list.add(k4);
		list.add(k5);
		
		Felület uj = new Felület();
		uj.felulet();
		
		mentes.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e)
		    {	
		    		uj.mentes();
		    }
		});
		
		kereses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				uj.kereses();
			}
		});
	}
}
