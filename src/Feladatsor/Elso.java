package Feladatsor;
import java.io.*;
import java.util.Scanner;

public class Elso {
	public static void main(String[] args) {
		int a; int b; //bemeneti �rt�kek
		double q =0; int m = 0; //sz�molt �rt�kek
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Adj meg k�t eg�sz sz�mot!");
		a = sc.nextInt();
		b = sc.nextInt();
		do{
			q = a / b;
			m = a % b;
			a = b;
			b = m;
		}while( m > 0 );
		System.out.println("A megadott k�t sz�m legnagyobb k�z�s oszt�ja a: " + a);
	}
}
