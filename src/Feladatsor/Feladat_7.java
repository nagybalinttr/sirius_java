package Feladatsor;
import java.util.Scanner;

public class Feladat_7{
	private static Scanner sc;

	public static void main(String[] args) {
		int a = 0;
		int db = 0;
		int sum = 0;
		double atlag = 0;
		Scanner sc = new Scanner(System.in);// itt p�ld�nyos System.out.println("Adj meg k�t eg�sz sz�mot!");tom a Scanner tipusu sc objektumomat a System.in adja meg hogy a console bol varom az ertekolvasast
		
		do{
			System.out.println("Adj meg egy sz�mot!");
			a =  sc.nextInt();
			if(a > 0)
			{
				if(a % 2 == 0)
				{
					sum = sum + a;
					db++;
				}
			}
		}while(a > 0);
		atlag = sum / db;
		System.out.println("A megadott sz�mok �tlaga: " + atlag);
	}
}