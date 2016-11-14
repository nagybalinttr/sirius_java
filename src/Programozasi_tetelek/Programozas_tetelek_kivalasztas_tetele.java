package Programozasi_tetelek;

import java.util.Scanner;

public class Programozas_tetelek_kivalasztas_tetele {

	public static void main(String[] args) {
		int[] tomb = {2, 10, 3, 4, 6, 8, 9, 7, 1, 5};
		int hol = -1;
		int keresett = 9;
		int i;
		/*
		 * kivalasztas tetele (biztos hogy benne van)
		 */
		System.out.println("Kivalasztas tetele");
		
		for(i = 0; i < 10; i++){
			if(tomb[i] == keresett){
				hol = i;
				break;
			}
		}
		System.out.println("A " + keresett + " a " + hol + ". helyen található");		
	} 
}
