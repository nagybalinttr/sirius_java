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
					 * A külsõ ciklust azért indítjuk a tömb végérõl mert így miután azokaz elemek a helyükre kerültek így a belsõ függvénynek azt már nem kell vizsgálnia és így kevesebb lépéssel tudjuk rendezni a tömbünket.
					 */
					seged = tomb[i+1];
					tomb[i+1] = tomb[i];
					tomb[i] = seged;				
				}
				f1++;
			}
		}
		System.out.println("Lépésszám: " + f1);
	}
}
