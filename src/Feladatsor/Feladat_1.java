package Feladatsor;
import java.util.Scanner;

public class Feladat_1 {
	public static void main(String[] args) {
		int a; int b; //bemeneti értékek
		double q =0; int m = 0; //számolt értékek
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Adj meg két egész számot!");
		a = sc.nextInt();
		b = sc.nextInt();
		do{
			q = a / b;
			m = a % b;
			a = b;
			b = m;
		}while( m > 0 );
		System.out.println("A megadott két szám legnagyobb közös osztója a: " + a);
	}
}
