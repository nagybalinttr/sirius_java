package gy_2016_11_14;

import java.util.Random;
import java.util.Scanner;


public class Feladat_9 {
    public static int numGen(int Tomb[]) {
    	int i;
    	Random rand = new Random();
    	int random = (1+rand.nextInt(500)/3);
        for(i = 0; i < Tomb.length; i++){
            if(Tomb[i] == random){
                return numGen(Tomb);
            }
        }
        return random;
    }
    
	public static void main(String[] args) {
		int tomb_hossza = 20;
		int[] tomb = new int[tomb_hossza];
		int Tomb[] = new int [500];
		int keresett;
		int i, j, k=0, seged;
		boolean talalat = false;
		Scanner sc = new Scanner(System.in);
		//tomb feltoltese veletlen szamokkal
        for(i = 0; i < tomb.length; i++){
        	tomb[i] = numGen(Tomb);
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
		//keresett ertek bekerese
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
