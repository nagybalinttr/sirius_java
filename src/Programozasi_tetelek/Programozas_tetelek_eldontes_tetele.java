package Programozasi_tetelek;

public class Programozas_tetelek_eldontes_tetele {

	public static void main(String[] args) {
		int[] tomb = {2, 10, 3, 4, 6, 8, 9, 7, 1, 5};
		boolean talalat = false; //az�rt kell a false kezd� �rt�k mert felt�telezz�k hogy nem lesz tal�latunk a t�mben
		int i;
		/*
		 * eldontes tetele
		 */
		System.out.println("Eldontes tetele");
		System.out.println("A tomben tal�lhato-e paratlan szam?");
		for(i = 0; i < 10; i++){
			if(tomb[i] % 2 != 0){
				talalat = true;
				break; //az�rt kell break; mert minketcsak az �rdekelt hogy van-e p�ratlan sz�m a t�mben �gy feleseleges lenne v�gig menni az �sszes elemen
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
