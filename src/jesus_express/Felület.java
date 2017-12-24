package jesus_express;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.*;

public class Felület implements ActionListener {
	
	int currentYear = Calendar.getInstance().get(Calendar.YEAR);
	int min = currentYear - 0;
	int max = currentYear + 10;
	int step = 1;
	SpinnerModel evlista = new SpinnerNumberModel(currentYear, min, max, step);
	
	String[] honapok = {"Január", "Február", "Március", "Június", "Július", "Augusztus", "Szeptember", "Október", "December"};
	SpinnerListModel honaplistamodel = new SpinnerListModel(honapok);
	
	SpinnerModel napok = new SpinnerNumberModel(1, 1, 31, 1);
	
	static JFrame keret = new JFrame();
	JPanel sor1 = new JPanel(new FlowLayout());
	JPanel sor2 = new JPanel(new FlowLayout());
	JPanel sor3 = new JPanel(new FlowLayout());
	JPanel sor4 = new JPanel(new FlowLayout());
	JPanel sor5 = new JPanel(new FlowLayout());
	JPanel sor6 = new JPanel(new FlowLayout());
	
	JLabel kinekText = new JLabel("Kinek adjam az ajándékot?");
	JTextField kinek = new JTextField(20);
	
	JLabel mitText = new JLabel("Mit adjak ajándékba?");
	JTextField mit = new JTextField(20);
	
	JLabel mennyitText = new JLabel("Mennyit adjak neki?");
	JSpinner mennyit = new JSpinner();
	
	JLabel mikorText = new JLabel("Mikor vigyel el neki?");
	
	JSpinner mikorEv = new JSpinner(evlista);
	JSpinner mikorHo = new JSpinner(honaplistamodel);
	JSpinner mikorNap = new JSpinner(napok);
	
	JLabel sikeresText = new JLabel("Sikeresen a szállítás?");
	JRadioButton option1 = new JRadioButton("Sikeres");
    JRadioButton option2 = new JRadioButton("Sikertelen");
    ButtonGroup group = new ButtonGroup();
    
	JLabel mentesText = new JLabel("Mentés");
	JButton mentes = new JButton("Mentés");
	
	void felulet()
	{
		System.out.print("App start");
		
		//1 sor
		keret.add(kinekText);
		keret.add(sor1);
		sor1.add(kinek);
		
		//2 sor
		keret.add(mitText);
		keret.add(sor2);
		sor2.add(mit);
		
		//3 sor
		keret.add(mennyitText);
		keret.add(sor3);
		sor3.add(mennyit);
		
		//4 sor
		keret.add(mikorText);
		keret.add(sor4);
		sor4.add(mikorEv);
		sor4.add(mikorHo);
		sor4.add(mikorNap);
		
		//5 sor
		keret.add(sikeresText);
		keret.add(sor5);
		group.add(option1);
	    group.add(option2);
	    sor5.setLayout(new FlowLayout());
	    sor5.add(option1);
	    sor5.add(option2);
		
	    //6 sor
		keret.add(mentesText);
		keret.add(sor6);
		sor6.add(mentes);
		
		keret.setLayout(new GridLayout(6,2));  
		keret.setSize(500, 500);  
		keret.setVisible(true);
		keret.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		Felület uj = new Felület();
		uj.felulet();
	}
}
