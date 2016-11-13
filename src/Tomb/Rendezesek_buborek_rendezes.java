package Tomb;

public class Rendezesek_buborek_rendezes {
	public static void main(String[] args) {
		int[] tomb = {4, 2, 6, 8, 9, 21, 65, 101, 400, 10};
		//buborek rendezes
		int i, j, seged, f1=0;
		for(j = 0; j < 10; j++){
			for(i = 0; i < 9; i++){
				if(tomb[i+1] < tomb[i]){
					seged = tomb[i+1];
					tomb[i+1] = tomb[i];
					tomb[i] = seged;
				}
				f1++;
			}
		}
		for(i=0; i < tomb.length; i++){
			System.out.print(" " + tomb[i]);
		}
		System.out.println("");
		System.out.println("Lépés szám: " + f1);
	}
}
