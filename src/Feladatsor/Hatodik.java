package Feladatsor;
import java.io.*;
import java.util.Scanner;

public class Hatodik{
	public static void main(String[] args) {
		int abs = 0;
		int szam = 0;
		System.out.println("Adj meg egy számot!");
		Scanner sc = new Scanner(System.in);
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