package gy_2016_12_05;

import java.util.Random;

import gy_2016_11_28.Tomb;

public class Feladat_1 {

	public static void main(String[] args) {
		int a, b;
		Random ran = new Random();
		Muveletek muvelet = new Muveletek();
		a = ran.nextInt(29) + 1;
		b = ran.nextInt(29) + 1;
		System.out.println("Az a ertek: " + a +"\nA b érték: " + b);
		System.out.println("a + b = " + muvelet.Osszead(a, b));
		System.out.println("a - b = " + muvelet.Kivonas(a, b));
		System.out.println("a * b = " + muvelet.Szorzas(a, b));
		System.out.println("a / b = " + muvelet.Osztas(a, b));
		muvelet.Binaris(a);
	}

}
