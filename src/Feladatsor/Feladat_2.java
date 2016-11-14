package Feladatsor;
import java.util.Scanner;

public class Feladat_2 {
	public static void main(String[] args) {
		int a; int b; //bemeneti értékek
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Adj meg két egész számot!");
		a = sc.nextInt();
		b = sc.nextInt();

		if(a == b)
		{
			System.out.println("A megadott két szám egyenlõ (" + a + "=" + b + ")");
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