package Feladatsor;
import java.util.Scanner;

public class Feladat_2 {
	public static void main(String[] args) {
		int a; int b; //bemeneti �rt�kek
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Adj meg k�t eg�sz sz�mot!");
		a = sc.nextInt();
		b = sc.nextInt();

		if(a == b)
		{
			System.out.println("A megadott k�t sz�m egyenl� (" + a + "=" + b + ")");
		}
		else if(a < b)
		{
			System.out.println("Az " + a + " kisebb mint a " + b);
		}
		else if(a > b)
		{
			System.out.println("Az " + a + " nagyobb mint a " + b);
		}
	}
}