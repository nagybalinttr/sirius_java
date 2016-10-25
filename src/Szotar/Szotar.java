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
		String mirol = "";
		
		String szavak_magyar[] = {"Sajt", "Kenyer", "Sor", "Viz", "Toll", "Tenger", "Utca", "Ter", "Vonat", "Repulo", "Kutya", "Macska", "Lo", "Hal", "Asztal", "Lampa", "Telefon", "Auto", "Kerekpar", "Televizio", "Szamitogep", "Konyv", "Munka", "Feladat"};
		String szavak_angol[] = {"Cheese", "Bread", "Beer", "Water", "Pen", "Sea", "Street", "Square", "Train", "Aeroplane", "Dog", "Cat", "Horse", "Fish", "Desk", "Lamp", "Phone", "Car", "Bicycle", "Television", "Computer", "Book", "Job", "Task"};
		
		tomb_hossza = szavak_magyar.length; //a .lenght adja meg hany elemu a tombunk
		System.out.println("Udv a szotar programban!");
		System.out.println("Jelenleg " + tomb_hossza + " darab szo talalhato az adatbazisban.");
		System.out.println("Ha magyarrol angolra szeretnel forditani ird be azt hogy magyarrol ha angolrol magyarra akkor ird be hogy angolrol");
		mirol = sc.nextLine();
		
		if(mirol.equals("magyarrol")){ //magyar -> angol
			System.out.println("Adj meg egy magyar szot es megmondom az angol megefelelojet.");
			System.out.print("A megadott szo: ");
			szo = sc.nextLine();
			
			for(i=0; i < tomb_hossza; i++)
			{
				if(szo.equals(szavak_magyar[i])) //a .equals() felel meg az == -nek
				{
					talalat = true;
					break; //azert van ra szukseg mert a for ciklus vegig megy a tombon es akkor a talalatkor ervenyes i erteket egy segedvaltozoba kellene tarolni
				}
			}
			if(talalat) //az if true-ra vizsgal ezert nem kell neki feltetelt adni
				System.out.println("A(z) '" + szo + "' angolul: " + szavak_angol[i]);
			else
				System.out.println("Nincs talalat!");			
		}
		else if(mirol.equals("angolrol")){ //angol -> magyar
			System.out.println("Adj meg egy angol szot es megmondom a magyar megefelelojet.");
			System.out.print("A megadott szo: ");
			szo = sc.nextLine();
			
			for(i=0; i < tomb_hossza; i++)
			{
				if(szo.equals(szavak_angol[i])) //a .equals() felel meg az == -nek
				{
					talalat = true;
					break; //azert van ra szukseg mert a for ciklus vegig megy a tombon es akkor a talalatkor ervenyes i erteket egy segedvaltozoba kellene tarolni
				}
			}
			if(talalat) //az if true-ra vizsgal ezert nem kell neki feltetelt adni
				System.out.println("A(z) '" + szo + "' magyarul: " + szavak_magyar[i]);
			else
				System.out.println("Nincs talalat!");			
		}
	}
}
