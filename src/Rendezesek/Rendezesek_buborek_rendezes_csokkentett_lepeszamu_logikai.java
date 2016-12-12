package Rendezesek;

public class Rendezesek_buborek_rendezes_csokkentett_lepeszamu_logikai {
	public static void main(String[] args) {
		int[] tomb = {4, 2, 6, 8, 9, 21, 65, 101, 400, 10};
		/*
		 * buborekos rendezes
		 */
		int i, j , seged, f1=0;
		boolean csere = true;
		for(j = 9; j >= 0; j--){
			if(!csere) break; //az if trura vizsgal ez�rt ha a bels� f�ggv�ny�nkben megt�rt�nt a csere �gy az adott k�rb�l breakelhet�nk is mert m�r rendezve vannak az elemek
			csere = false;
			for(i = 0; i < j; i++){
				if(tomb[i+1] < tomb[i]){
					seged = tomb[i+1];
					tomb[i+1] = tomb[i];
					tomb[i] = seged;
					csere = true;
				}
				f1++;
			}
		}
		System.out.println("Lepesszam: " + f1);
	}
}
