package gy_2017_01_09;

public class Feladat {

	public static void main(String[] args) {
		
		int[][] matrix = { {2, 3, 5}, {6, 0, 8}, {9, 1, 7} };
		
		int i = 0;
		int j = 0;
		
		//kiiras
		for(i = 0; i < matrix.length; i++){
			for(j = 0; j < matrix[i].length; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		//sorok osszege
		for(i = 0; i < matrix.length; i++){
			int sum = 0;
			for(j = 0; j < matrix[i].length; j++){
				sum += matrix[i][j];
			}
			System.out.println((i + 1) + ". sor osszege: " + sum);
		}
		
		//megforditas
		int[][] forditott_matrix = new int[3][3];
		int k = 0;
		int l = 0;
		
		for(i = matrix.length - 1, k = 0; i >= 0 && k < forditott_matrix.length; k++, i--){
			for(l = 0, j = matrix[i].length - 1; j >= 0 && l < forditott_matrix[k].length; l++, j--){
				forditott_matrix[k][l] = matrix[i][j];
			}
		}
		System.out.println("Fordított matrix");
		for(i = 0; i < forditott_matrix.length; i++){
			for(j = 0; j < forditott_matrix[i].length; j++){
				System.out.print(forditott_matrix[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		//egyseg matric 5x5
		int[][] egysegmatrix = new int[5][5];
		for(i = 0; i < 5; i++){
			for(j = 0; j < 5; j++){
				if(i != j){
					egysegmatrix[i][j] = 0;
				}
				else{
					egysegmatrix[i][j] = 1;
				}
			}
		}
		System.out.println("Egysegmatrix matrix");
		for(i = 0; i < egysegmatrix.length; i++){
			for(j = 0; j < egysegmatrix[i].length; j++){
				System.out.print(egysegmatrix[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		//mellekatlo 5x5
		int[][] mellekatlo = new int[5][5];
		int s = 0;
		for(i = 0, s = mellekatlo[i].length - 1; i < mellekatlo.length; i++, s--){
			for(j = 0; j < mellekatlo[i].length; j++){
				if(s == j){
					mellekatlo[i][j] = 1;
				}
				else{
					mellekatlo[i][j] = 0;
				}
			}
		}
		
		
		System.out.println("Mellek atlo");
		for(i = 0; i < mellekatlo.length; i++){
			for(j = 0; j < mellekatlo[i].length; j++){
				System.out.print(mellekatlo[i][j] + " ");
			}
			System.out.print("\n");
		}

	}
}
