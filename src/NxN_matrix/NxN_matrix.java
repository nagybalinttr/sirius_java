package NxN_matrix;

import java.util.Random;

public class NxN_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix = {
				{0, 1, 2, 3, 4},
				{1, 0, 2, 3, 4},
				{1, 2, 0, 3, 4},
				{1, 2, 3, 0, 4},
				{1, 2, 3, 4, 0}
		};
		int[] seged = new int[5];
		int i = 0, j = 0, k = 0;
		int seged2 = 0;
		Random rnd = new Random();
		
		//matrix feltoltese
		for(i = 0; i < matrix.length; i++){
			for(j = 0; j < matrix[i].length; j++){
				if(i == j){
					matrix[i][j] = 0;
				}
				else{
					matrix[i][j] = rnd.nextInt(999) + 1;
				}
			}
		}		
		
		
		//alap matrix kiirasa
		System.out.println("Alap matrix:");
		for(i = 0; i < matrix.length; i++){
			for(j = 0; j < matrix[i].length; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		//sorok osszegzese
		for(i = 0; i < matrix.length; i++){
			seged2 = 0;
			for(j = 0; j < matrix[i].length; j++){
				seged2 += matrix[i][j];
			}
			seged[i] = seged2;
		}
		
		//foatlo alatti elemek listazasa
		/*
		for(i = 0; i < matrix.length; i++){
			for(j = i; j < matrix[i].length; j++){
				System.out.print(matrix[j][i] + " ");
			}
			System.out.println(" ");
		}	
		*/
		//oszlop szerinti listazas
		/*
		System.out.println("oszlop szerinti listazas");
		for(i = 0; i < matrix.length; i++){
			for(j = 0; j < matrix[i].length; j++){
				System.out.print(matrix[j][i] + " ");
				seged[i] = seged[i] - matrix[j][i];
			}
			System.out.println(" ");
		}
		*/
		
		System.out.println("Egyes cegek eredmeny");
		for(k = 0; k < seged.length; k++){
			System.out.println((k + 1) + ". Ceg: " + seged[k] + " ");
		}
		
	}

}
