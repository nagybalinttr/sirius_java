package Tomb;
import java.util.Scanner;

public class Programozas_tetelek_binaris_kereses {

	public static void main(String[] args) {
		int[] tomb = {2, 10, 3, 4, 6, 8, 9, 7, 1, 5};
		boolean talalat;
		Scanner sc = new Scanner(System.in);
		int eleje = 0;
		int vege = 9;
		int kozepe = vege/2;
		//binaris kereses
		/*
		 * csak sorba rendezett tombon lehet binaris kereset vegezni
		 */
		System.out.println("Binaris kereses tetele");
		int seged, j, k;
		for(j = 0; j < 10; j++){
			for(k = 0; k < tomb.length-1; k++){
				//tomb.length => a ".length" megadja a tombomnek a hosszat es azert .length-1 mert k+1 miatt tulcsordulna a tombom
				if(tomb[k] > tomb[k+1]){
					seged = tomb[k+1];
					tomb[k+1] = tomb[k];
					tomb[k] = seged;
				}
			}	
		}
		talalat = false;
		System.out.println("Add meg a keresett számot: ");
		int keresett = sc.nextInt();
		while(eleje<=vege){
			if(tomb[kozepe] == keresett){
				System.out.println("A keresett elem a " + kozepe + ". indexen talalható");
				talalat = true;
				break;
			}
			else if(keresett > tomb[kozepe]){
				eleje = kozepe + 1;
			}
			else{
				vege = kozepe - 1;
			}
			kozepe = (vege + eleje) / 2;
		}
		if(!talalat){
			System.out.println("Nem talalhato a keresett ertek!");
		}
	} 
}
