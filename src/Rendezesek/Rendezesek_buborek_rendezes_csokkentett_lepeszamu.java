package Rendezesek;

public class Rendezesek_buborek_rendezes_csokkentett_lepeszamu {
	public static void main(String[] args) {
		int[] tomb = {4, 2, 6, 8, 9, 21, 65, 101, 400, 10};
		/*
		 * buborekos rendezes
		 */
		int i, j , seged, f1=0;
		for(j = 9; j > 0; j--){
			for(i = 0; i < j; i++){
				if(tomb[i+1] < tomb[i]){
					/*
					 * A k�ls� ciklust az�rt ind�tjuk a t�mb v�g�r�l mert �gy miut�n azokaz elemek a hely�kre ker�ltek �gy a bels� f�ggv�nynek azt m�r nem kell vizsg�lnia �s �gy kevesebb l�p�ssel tudjuk rendezni a t�mb�nket.
					 */
					seged = tomb[i+1];
					tomb[i+1] = tomb[i];
					tomb[i] = seged;				
				}
				f1++;
			}
		}
		System.out.println("L�p�ssz�m: " + f1);
	}
}
