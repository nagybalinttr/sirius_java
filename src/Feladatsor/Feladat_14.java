package Feladatsor;
import java.util.Scanner;

public class Feladat_14{
	private static Scanner sc;
	public static void main(String[] args) {
		int a = 0;
		int osz = 0;
		int i = 1;
		Scanner sc = new Scanner(System.in);// itt példányos System.out.println("Adj meg két egész számot!");tom a Scanner tipusu sc objektumomat a System.in adja meg hogy a console bol varom az ertekolvasast
		
		System.out.println("11. Primszamos feladat");
		System.out.println("Adj meg egy szamot");
		a =  sc.nextInt();
		while(i<=a)
		{
			if(a % i == 0)
			{
				osz++;
			}
			i++;
		}
		if(osz==2)
		{
			System.out.println("A megadott szam (" + a + ") prim");
		}
		else
		{
			System.out.println("A megadott szam (" + a + ") nem prim");
		}
	}
}