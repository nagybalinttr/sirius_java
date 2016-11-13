package Tomb;

import java.util.Scanner;

public class Programozas_tetelek_tomb_ertekek_osszegzesenek_tetele {

	public static void main(String[] args) {
		int[] tomb = {2, 10, 3, 4, 6, 8, 9, 7, 1, 5};
		int szum = 0;
		int i;
		//tomb ertekek osszegzese
		System.out.println("Osszegzes tetele");
		for(i = 0; i < 10; i++){
			szum += tomb[i]; // osszeg = osszeg + tomb[i] a "+=" kifejezessel lehet roviditeni
		}
		System.out.println("A tomb elemeinek osszege: " + szum);	
	} 
}
