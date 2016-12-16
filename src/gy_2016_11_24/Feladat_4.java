package gy_2016_11_24;
import java.util.Scanner;
public class Feladat_4 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] tomb= new int[20];
		int i, j, seged, bekert;
		int e = 0, v = 19, k = v / 2;
		boolean megvan=false;
		
		for(i = 0; i < 20; i++){  // tomb elemek bekerese
			
			System.out.println("Add meg a" + i + " elemet");
			tomb[i] = sc.nextInt();
		}
		
		for(i = 0; i < 20; i++){  // tomb elemek kiirasa
			System.out.print(" " + tomb[i]);
		}
		
		// tomb rendezese buborekosan
		for(j = 19; j >= 0; j--){
			for(i = 0; i < j; i++){
				if(tomb[i+1] < tomb[i]){
					seged = tomb[i+1];
					tomb[i+1] = tomb[i];
					tomb[i] = seged;
				}
			}
		}
		for(i = 0; i < 20; i++){  // tomb elemek kirasa
			System.out.print(" " + tomb[i]);
		}
		System.out.println("Add meg a keresett szamot!");
		bekert = sc.nextInt();
		
		//kereses binarisan	
		while(e <= v){
			if(tomb[k] == bekert){
				System.out.println("Megvan a " + k + " indexen");
				megvan = true;
				break;
			}
			else if(bekert > tomb[k]){
				e = k + 1;
				k = (e + v) / 2;
			}
			else if(bekert < tomb[k]){
				v = k - 1;
				k = (e + v) / 2;
			}		
		}
		if(!megvan){
			System.out.println("Nincs benne");
		}
	}
}