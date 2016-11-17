package gy_2016_11_17;

import java.util.Random;

public class Feladat_1 {

	public static void main(String[] args) {
		int[] tomb = new int[6];
		int i, j, seged, minindex;
		int random = 0;
		int db = 0;
		int faktorialis = 0;
		//1-10->random
		//db->5
		//rendezve minimummal
		//tomb sziommetrikus megforditasa
		Random rand = new Random();
		//tomb feltoltese
		for(i = 0; i < 6; i++){
			random = rand.nextInt(9) + 1;
			tomb[i] = random;
		}
		for(i = 0; i < 6; i++){
			System.out.print(tomb[i] + " ");
		}
		//megszamlalas
		for(i = 0; i < 6; i++){
			if(tomb[i] == 5 ){
				db++;
			}
		}
		System.out.println("\n" + db + "db 5-os erteku elem talalhato a tombben!");
		
		//rendezes minimum elv szerint
		for(i = 0; i < 5; i++){
			minindex = i;
			for(j = i + 1; j < 6; j++){
				if(tomb[j] < tomb[minindex]){
					seged = tomb[minindex];
					tomb[minindex] = tomb[j];
					tomb[j] = seged;
				}
			}
		}
		for(i = 0; i < 6; i++){
			System.out.print(tomb[i] + " ");
		}
		//faktorialis szamolas (3. elemtol)
		for(i = 0; i < 2; i++){
			faktorialis = faktorialis + (tomb[i] * tomb[i+1]);
		}
		System.out.println("\nA tomb 3. elemenek (" + tomb[3] + ") faktorialisa: " + faktorialis);
		System.out.println("Szimmetriokus megfordítás:");
		//szimmetrikus megforditas
		for(i = 0, j = 5; i<=j; i++, j--){
			seged = tomb[i];
			tomb[i] = tomb[j];
			tomb[j] = seged;
		}
		for(i = 0; i < 6; i++){
			System.out.print(tomb[i] + " ");
		}

	}

}
