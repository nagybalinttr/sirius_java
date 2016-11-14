package gy_2016_11_14;

import java.util.Random;
import java.util.Scanner;


public class Feladat_9 {

	public static void main(String[] args) {
		int[] tomb = new int[20];
		int keresett;
		int random;
		int i, j, k, seged;
		boolean talalat = false;
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		for(i = 0; i<20; i++){
			random = rand.nextInt(2500);
			for(j = 0; j < i; j++){
				if(tomb[j] != random){
					tomb[i] = random;
				}
			}
		}
		//rendezes	
		for(j = 0; j < tomb.length; j++){
			for(k = 0; k < tomb.length-1; k++){
				if(tomb[k+1] < tomb[k]){
					seged = tomb[k+1];
					tomb[k+1] = tomb[k];
					tomb[k] = seged;
				}
			}
		}
		//ellenorzo kiiratas
		for(i = 0; i < tomb.length; i++){
			System.out.print(tomb[i] + " ");
		}
		/////
		//ertek be
		System.out.println("\nAdj meg egy erteket: ");
		keresett = sc.nextInt();
		// kereses
		for(i = 0; i < tomb.length; i++){
			if(tomb[i] == keresett){
				talalat = true;
				System.out.println("A keresett ertek a tomb " + i + ". indexen talalhato!");
				break;
			}
		}
		if(!talalat){
			System.out.println("\nNem talalhato a keresett ertek!");
		}
	}
}
