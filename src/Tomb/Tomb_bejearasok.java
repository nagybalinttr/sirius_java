package Tomb;

public class Tomb_bejearasok {
	public static void main(String[] args) {
		int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
		
		// teljes bejaras
		System.out.println("Teljes bejaras");
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				System.out.print(matrix[i][j] + " ");
			}
		}
		
		System.out.print("\n \n");
		System.out.println("\"Oda vissza\" bejaras ");
		//"Oda vissza" bejaras
		/*
		 * 123654789
		 * 
		 * */
		int s = 0; //sor
		int o = 0; //oszlop
		for(s = 0; s < 3; s++){
			if(s % 2 == 0){
				for(o = 0; o < 3; o++){
					System.out.print(matrix[s][o] + " ");
				}
			}
			else if(s % 2 == 1){
				for(o = 2; o >= 0; o--){
					System.out.print(matrix[s][o] + " ");
				}				
			}
		}
		
		System.out.print("\n \n");
		System.out.println("\"Spiralis\" bejaras ");
		//"Spiralis" bejaras
		/*
		 * 123698745
		 * 
		 * */
		for(s = 0; s <= 3; s++){
			if(s == 0){
				for(o = 0; o < 3; o++){
					System.out.print(matrix[s][o] + " ");
				}
			}
			else if(s == 1){
				System.out.print(matrix[s][2] + " ");		
			}
			else if(s == 2){
				for(o = 2; o >= 0; o--){
					System.out.print(matrix[s][o] + " ");
				}
			}
			else if(s == 3){
				for(o = 0; o < 2; o++){
					System.out.print(matrix[s-2][o] + " ");
				}
				
			}
		}
	}
}
