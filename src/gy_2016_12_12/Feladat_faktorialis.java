package gy_2016_12_12;

import java.util.Scanner;

public class Feladat_faktorialis {

	public static void main(String[] args) {
		//objektumok peldanyositasa
		Scanner sc = new Scanner(System.in);
		Szamologep calc = new Szamologep(); 
		//valtozok deklaralasa
		double a = 0;
		double faktorialis = 0;
		System.out.println("Adj meg egy szamot: ");
		a = sc.nextDouble();
		faktorialis = calc.faktorialis(a);
		System.out.println("Az " + a + " faktorialisa: " + faktorialis);
	}

}
