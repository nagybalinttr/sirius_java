package Tomb;

import java.util.Scanner;

public class Programozas_tetelek {

	public static void main(String[] args) {
		int[] tomb = {2, 10, 3, 4, 6, 8, 9, 7, 1, 5};
		
		//tomb elmeinek listazasa
		System.out.println("Listazas tetele");
		int i = 0;
		for(i = 0; i < 10; i++){
			System.out.print(tomb[i] + " ");
		}
		
		//tomb ertekek osszegzese
		System.out.println("\n"); //ures sor beszurasa
		System.out.println("Osszegzes tetele");
		int szum = 0;
		for(i = 0; i < 10; i++){
			szum += tomb[i]; // osszeg = osszeg + tomb[i] a "+=" kifejezessel lehet roviditeni
		}
		System.out.println("A tomb elemeinek osszege: " + szum);
		
		//megszamlalas tetele (parosbol mennyi van)
		System.out.println("\n"); //ures sor beszurasa
		System.out.println("Megszamlalas tetele");
		int db = 0;
		for(i = 0; i < 10; i++){
			if(tomb[i] % 2 == 0){
				db++;
			}
		}
		System.out.println(db + "db paros szam talalhato a Sen");
		
		//eldontes tetele
		System.out.println("\n"); //ures sor beszurasa
		System.out.println("Eldontes tetele");
		System.out.println("A tomben találhato-e paratlan szam?");
		Boolean talalat = false;
		for(i = 0; i < 10; i++){
			if(tomb[i] % 2 != 0){
				talalat = true;
				break;
			}
		}
		if(talalat){
			System.out.println("Igen");
		}
		else{
			System.out.println("Nem");
		}
		
		//kivalasztas tetele (biztos hogy benne)
		System.out.println("\n"); //ures sor beszurasa
		System.out.println("Kivalasztas tetele");
		int where = -1;
		for(i = 0; i < 10; i++){
			if(tomb[i] == 9){
				where = i;
				break;
			}
		}
		System.out.println("A 9 a " + where + ". helyen található");
		
		//kereses tetele (ha nem biztos hogy benne van)
		System.out.println("\n"); //ures sor beszurasa
		System.out.println("Kereses tetele");
		where = -1;
		for(i = 0; i < 10; i++){
			if(tomb[i] == 9){
				where = i;
				break;
			}
		}
		if(where != -1){
			System.out.println("A 9 a " + where + ". helyen található");
		}
		else{
			System.out.println("A 9 nem talalhato a tombben");
		}
		
		//binaris kereses
		/**
		 * csak sorba rendezett tombon lehet binaris kereset vegezni
		 */
		System.out.println("\n");
		System.out.println("Binaris kereses tetele");
		int[] tomb2 = {4, 2, 6, 8, 9, 21, 65, 101, 0, 10};
		int seged, j, k;
		for(j = 0; j < 10; j++){
			for(k = 0; k < 9; k++){ //azert megyunk csak 9-ig mert így i+1 maximum 9 lehet
				if(tomb2[k] > tomb2[k+1]){
					seged = tomb2[k+1];
					tomb2[k+1] = tomb2[k];
					tomb2[k] = seged;
				}
			}	
		}
		/*
		for(int x = 0; x < 10; x++){
			System.out.print(tombb[x] + " ");
		}
		*/
		Scanner sc = new Scanner(System.in);
		int eleje = 0, vege = 9, kozepe = vege/2;
		talalat = false;
		System.out.println("Add meg a keresett számot: ");
		int keresett = sc.nextInt();
		while(eleje<=vege){
			if(tomb2[kozepe] == keresett){
				System.out.println("A keresett elem a " + kozepe + ". helyen talalható");
				talalat = true;
				break;
			}
			else if(keresett > tomb2[kozepe]){
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
