package Feladatsor;
import java.util.Scanner;

public class Feladat_8{
	private static Scanner sc;
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int eredmeny = 0;
		Scanner sc = new Scanner(System.in);// itt p�ld�nyos System.out.println("Adj meg k�t eg�sz sz�mot!");tom a Scanner tipusu sc objektumomat a System.in adja meg hogy a console bol varom az ertekolvasast
		System.out.println("Adj meg k�t sz�mot!");
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		for(int j = b; j >= 1; j--)
		{
			eredmeny = eredmeny + a;
		}
		System.out.println("A megadott sz�mok szorzata: " + eredmeny);
	}
}