package Programozasi_tetelek;

public class Programozas_tetelek_kereses_tetele {

	public static void main(String[] args) {	
		/*
		 * kereses tetele (ha nem biztos hogy benne van) 
		 * */
		int[] tomb = {2, 10, 3, 4, 6, 8, 9, 7, 1, 5};
		int hol;
		int i;
		int keresett = 9; // keresett �rt�k
		//kereses tetele (ha nem biztos hogy benne van)
		System.out.println("Kereses tetele");
		hol = -1; //az�rt kell -1 es �rt�ket felvenni mert a �mb�knek a legkisebb indexe a 0
		for(i = 0; i < 10; i++){
			if(tomb[i] == keresett){
				hol = i;
				break;
			}
		}
		if(hol != -1){
			System.out.println("A " + keresett + " a " + hol + ". helyen tal�lhat�");
		}
		else{
			System.out.println("A " + keresett + " nem talalhato a tombben");
		}		
	} 
}
