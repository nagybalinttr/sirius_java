package Feladatsor;
import java.util.Scanner;

public class Feladat_13{
	private static Scanner sc;
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int kisebb = 0;
		int nagyobb = 0;
		int db = 0;
		
		sc = new Scanner(System.in);
		
		System.out.println("13. feladat");
		System.out.println("Adj meg ket szamot");
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a>b)
		{
			kisebb = b;
			nagyobb = a;
		}
		else
		{
			kisebb = a;
			nagyobb = b;
		}
		do
		{
			if(kisebb % 11 == 0)
			{
				db++;
			}
			kisebb++;
		}while(kisebb < nagyobb);
		System.out.println(db + " db 11-el osztahto szam esik a megadott ertekek koze");
	}
}