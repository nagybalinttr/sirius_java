package Programozasi_tetelek;

import java.util.Scanner;

public class Programozas_tetelek_megszamlalas_tetele {

	public static void main(String[] args) {
		int[] tomb = {2, 10, 3, 4, 6, 8, 9, 7, 1, 5};
		int db = 0;
		int i;
		/*
		 * megszamlalas tetele (parosbol mennyi van)
		 */
		System.out.println("Megszamlalas tetele");
		for(i = 0; i < 10; i++){
			if(tomb[i] % 2 == 0){
				db++;
			}
		}
		System.out.println(db + "db paros szam talalhato a tomben");	
	} 
}
