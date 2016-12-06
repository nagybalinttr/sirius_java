package Feladatsor;
import java.util.Scanner;

public class Feladat_6{
	public static void main(String[] args) {
		int abs = 0;
		int szam = 0;
		Scanner sc = new Scanner(System.in);// itt példányos System.out.println("Adj meg két egész számot!");tom a Scanner tipusu sc objektumomat a System.in adja meg hogy a console bol varom az ertekolvasast
		System.out.println("Adj meg egy számot!");
		szam = sc.nextInt();
		if(szam < 0)
		{ //negativ oldal
			abs = szam * -1; 
		}
		else
		{ // pozitiv oldal
			abs = szam;
		}
		System.out.println("A megadott " + szam + " abszolut erteke " + abs);	
	}
}