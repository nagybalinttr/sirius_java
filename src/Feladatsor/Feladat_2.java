package Feladatsor;
import java.util.Scanner;

public class Feladat_2 {
	public static void main(String[] args) {
		int a; int b; //bemeneti értékek
		Scanner sc = new Scanner(System.in);// itt példányos System.out.println("Adj meg két egész számot!");tom a Scanner tipusu sc objektumomat a System.in adja meg hogy a console bol varom az ertekolvasast
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