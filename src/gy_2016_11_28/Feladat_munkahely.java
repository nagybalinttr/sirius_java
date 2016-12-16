package gy_2016_11_28;

import java.util.Scanner;

public class Feladat_munkahely {	
	public static void main(String[] args) {
		
		String nev, beoszt;
		int fiz;
		boolean csp;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Add meg a dolgozo adatait!"); //adatok bekerese
		
		System.out.println("Nev:");
		nev=sc.next();
		
		System.out.println("Beosztas:");
		beoszt=sc.next();
		
		System.out.println("Fizetes:");
		fiz=sc.nextInt();
		
		System.out.println("Csaladi potlek: (true/false)"); // true or false
		csp=sc.nextBoolean();
		
		Dolgozo dolg1 = new Dolgozo(nev,beoszt,fiz,csp); //peldanyositas
		
		System.out.println(dolg1.nev + " " + dolg1.beosztas + " " + dolg1.fizetes + " ");
		System.out.println(dolg1.csaladi_potlek ? " kap" : " nem kap"); //short if szerkezet
		/*
		 * Ha dolg1.csaladi_potlek true (igaz) akkor a kerdojell es a kettospont kozotti reszt írja ki
		 * Ha dolg1.csaladi_potlek false (hamis) akkor a kettospontttol jobbra eso reszt irja ki
		 * 
		 * A short if szerkezet csak az eldöntendő (logikai[boolean]) kerdesek eldontésében hasznalhato
		 */
	}
}