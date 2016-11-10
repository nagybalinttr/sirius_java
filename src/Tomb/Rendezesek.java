package Tomb;

public class Rendezesek {
	public static void main(String[] args) {
		int[] tomb = {4, 2, 6, 8, 9, 21, 65, 101, 400, 10};
		//buborekos rendezes
		/*int i, j , seged, f1=0, f2=0, f3=0;*/
		/*boolean csere = true;*/
		/*
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
		*/
		
		
		// ket iranyu tamadas
		/*
		for(j = 9; j > 0; j--){
			for(i = 0; i < j; i++){
				if(tomb[i+1] < tomb[i]){
					
					seged = tomb[i+1];
					tomb[i+1] = tomb[i];
					tomb[i] = seged;
					
				}
				f2++;
			}
		}
		*/
		
		// ket iranyu tamadas
		/*
		for(j = 9; j >= 0; j--){
			if(!csere) break;
			csere = false;
			for(i = 0; i < j; i++){
				if(tomb[i+1] < tomb[i]){
					
					seged = tomb[i+1];
					tomb[i+1] = tomb[i];
					tomb[i] = seged;
					csere = true;
					
				}
				f3++;
			}
		}
		*/
		
		//minimum kivalasztasos rendezes
		int min_index = 0; int i = 0; int j = 0; int seged = 0;
		for(i = 0; i < 9; i++){
			min_index = i;
			for(j = i + 1; j < 10; j++){
				if(tomb[j] < tomb[min_index]){
					min_index = j;
				}
			}
			seged = tomb[min_index];
			tomb[min_index] = tomb[i];
			tomb[i] = seged;
		}
		
		for(int k = 0; k < 10; k++){
			System.out.print(tomb[k] + " ");
		}
		//System.out.println("\n Futas 1: " + f1 + "\n Futas 2: " + f2 + "\n Futas 3: " + f3);
	}
}
