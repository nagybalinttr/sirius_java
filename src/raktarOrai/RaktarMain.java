package raktarOrai;
import java.util.ArrayList;
public class RaktarMain {
	public static void main(String[] args) {
		
		int i;
		
		double osszeg=0;
		
		Termek t1=new Termek("ruha",4000,21);
		Termek t2=new Termek("cipo",3000,30);
		Termek t3=new Termek("sál",1500,12);
		Termek t4=new Termek("kalap",2100,42);
		
		ArrayList<Termek> list=new ArrayList<Termek>();
		
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		
		
		
		Felulet f=new Felulet(list);
		f.createFelulet();
		
		
		ArrayList<Termek> kosar=new ArrayList<Termek>();
		
		kosar.add(t2);
		kosar.add(t4);
		
		System.out.println("Kosarad tartalma:");
		
		for(i=0;i<kosar.size();i++){
			
			System.out.println(kosar.get(i).nev);
			osszeg+=kosar.get(i).ar;
		}
		
		System.out.println("Kosarad értéke:"+osszeg);
	}
}
