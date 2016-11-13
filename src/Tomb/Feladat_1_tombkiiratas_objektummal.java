package Tomb;


public class Feladat_1_tombkiiratas_objektummal {
	public static void main(String[] args) {
		int[] tomb = {9,5,6,7,8,2,3,4,1};
		
		TombPrint kiir = new TombPrint();
		
		System.out.println("1. feladat. Tomb elemeinek kiirasa");
		kiir.kiir(tomb);
		
		//buborekos rendezes
		System.out.println("\n");
		System.out.println("2. Feladat. Buborekeos rendezes");
		int i, j , seged, a = 0, b = 0;
		for(j = 8; j > 0; j--){
			for(i = 0; i < j; i++){
				if(tomb[i+1] < tomb[i]){
					seged = tomb[i+1];
					tomb[i+1] = tomb[i];
					tomb[i] = seged;	
				}
			}
		}
		kiir.kiir(tomb);
		
		//binaris kereses
		System.out.println("\n");
		System.out.println("3. feladat. Binaris kereses");
		int eleje = 0, vege = tomb.length, kozepe = vege/2;
		boolean talalat = false;
		int keresett = 6;
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
