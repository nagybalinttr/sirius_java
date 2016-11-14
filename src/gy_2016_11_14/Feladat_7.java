package gy_2016_11_14;

import java.util.Scanner;

public class Feladat_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int parameter;
		System.out.println("Adj meg egy egesz szamot 1 es 7 kozott");
		parameter = sc.nextInt();
		switch(parameter){
			case 1: System.out.println("Hetfo"); break;
			case 2: System.out.println("Kedd"); break;
			case 3: System.out.println("Szerda"); break;
			case 4: System.out.println("Csutortok"); break;
			case 5: System.out.println("Pentek"); break;
			case 6: System.out.println("Szombat"); break;
			case 7: System.out.println("Vasarnap"); break;
			default: System.out.println("A megadott ertek hibas!");
		}
	}

}
