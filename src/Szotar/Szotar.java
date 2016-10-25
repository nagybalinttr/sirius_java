package Szotar;

import java.util.Scanner;
import java.io.*;
public class Szotar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc = new Scanner(System.in);
		Boolean talalat = false;
		int tomb_hossza = 0;
		int i = 0;
		String szo = "";
		
		String szavak_magyar[] = {"Sajt", "Kenyer", "Sor", "Viz", "Toll", "Tenger", "Utca", "Ter", "Vonat", "Repulo", "Kutya", "Macska", "Lo", "Hal", "Asztal", "Lampa", "Telefon", "Auto", "Kerekpar", "Televizio", "Szamitogep", "Konyv", "Munka", "Feladat"};
		String szavak_angol[] = {"Cheese", "Bread", "Beer", "Water", "Pen", "Sea", "Street", "Square", "Train", "Aeroplane", "Dog", "Cat", "Horse", "Fish", "Desk", "Lamp", "Phone", "Car", "Bicycle", "Television", "Computer", "Book", "Job", "Task"};
		
		tomb_hossza = szavak_magyar.length; //a .lenght adja meg hany elemu a tombunk
		System.out.println("Jelenleg " + tomb_hossza + " darab szo talalhato az adatbazisban.");
		System.out.println("Adj meg egy magyar szot es megmondom az angol megefelelojet");
		szo = sc.nextLine();
		
		for(i=0; i < tomb_hossza; i++)
		{
			if(szo.equals(szavak_magyar[i]))
			{
				talalat = true;
				break; //azert van ra szokseg mert a for ciklus vegig menne a tombon es akkor a talalatkor ervenyes i erteket egy segedvaltozoba el kellene tarolni
			}
		}
		if(talalat) //mivel true -ra vizsgalunk ezert nem kell neki feltetelt adni
		{
			System.out.println(szavak_angol[i]);
		}
		else
		{
			System.out.println("Nincs talalat!");
		}
			
	}
}
