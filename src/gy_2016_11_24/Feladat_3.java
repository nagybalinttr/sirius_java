package gy_2016_11_24;
import java.util.Scanner;
public class Feladat_3 {
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			int a, pozitiv=0, negativ=0; 
			do{
				System.out.println("Adj meg egy szamot!");
				a=sc.nextInt();
				if(a > 0){
					pozitiv++;				
				}
				else if(a < 0){
					negativ++;
				}
			}while(a != 0);
			System.out.println("pozitiv: "+ pozitiv+ " negativ" + negativ);	
		}
}