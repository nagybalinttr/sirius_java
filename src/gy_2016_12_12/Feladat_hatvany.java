package gy_2016_12_12;

import java.util.Scanner;

public class Feladat_hatvany {

	public static void main(String[] args) {
		//objektumok peldanyositasa
		Scanner sc = new Scanner(System.in);
		Szamologep calc = new Szamologep();
		//valtozok deklaralasa
		int a = 0, b = 0;
		System.out.println("Add meg a hatvany alapot: ");
		a = sc.nextInt();
		System.out.println("Add meg a hatvany erteket: ");
		b = sc.nextInt();
		System.out.println(a + " a " + b + " hatvanyon: " + calc.hatvanyzas(a, b));
		
	}

}
