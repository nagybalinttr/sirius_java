package Rendezesek;

import java.util.Random;

public class Rendezesek_minimum_elv_szerinti_rendezes {

	public static void main(String[] args) {
		int i, j, seged, minindex, random;
		int[] tomb = new int[6];
		Random rand = new Random();
		for(i = 0; i < 6; i++){
			random = rand.nextInt(9) + 1;
			tomb[i] = random;
		}
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
	}

}
