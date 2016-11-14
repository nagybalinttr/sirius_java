package Programozasi_tetelek;

public class Programozas_tetelek_eldontes_tetele {

	public static void main(String[] args) {
		int[] tomb = {2, 10, 3, 4, 6, 8, 9, 7, 1, 5};
		boolean talalat = false; //azért kell a false kezdõ érték mert feltételezzük hogy nem lesz találatunk a tömben
		int i;
		/*
		 * eldontes tetele
		 */
		System.out.println("Eldontes tetele");
		System.out.println("A tomben találhato-e paratlan szam?");
		for(i = 0; i < 10; i++){
			if(tomb[i] % 2 != 0){
				talalat = true;
				break; //azért kell break; mert minketcsak az érdekelt hogy van-e páratlan szám a tömben így feleseleges lenne végig menni az összes elemen
			}
		}
		if(talalat){
			System.out.println("Igen");
		}
		else{
			System.out.println("Nem");
		}	
	} 
}
