package gy_2016_12_12;

import java.util.Scanner;

public class Feladat_masodfoku {
	public static void main(String[] args) {
		//objektumok peldanyositasa
		Scanner sc = new Scanner(System.in);
		Szamologep calc = new Szamologep();
		//valtozok deklaralasa
		double a = 0, b = 0, c = 0;
		double[] dis;
		System.out.println("Add meg az a erteket: ");
		a = sc.nextDouble();
		System.out.println("Add meg az b erteket: ");
		b = sc.nextDouble();
		System.out.println("Add meg az c erteket: ");
		c = sc.nextDouble();
		//diszkriminanas vizsgalata
		dis = calc.masodfoku(a, b, c);
		if(dis[0] < 0){
			System.out.println("A diszkriminanas: " + dis[0] + " ezert nincs valos gyoke az egyenletnek.");
		}
		else if(dis[0] == 0){
			System.out.println("A diszkriminans: " + dis[0] + " ezert az egyenlenek egy valos gyoke van aminek az erteke: " + dis[1]);
		}
		else if(0 < dis[0]){
			System.out.println("A diszkriminans: " + dis[0] + " ezert az egyenlenek ket valos gyoke van aminek az erteke: " + dis[1] + " es " + dis[2]);
		}
	}
}
