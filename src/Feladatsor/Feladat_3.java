package Feladatsor;
import java.util.Scanner;

public class Feladat_3 {
	public static void main(String[] args) {
		int a; int b; int c; //bemeneti �rt�kek
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Adj meg h�rom eg�sz sz�mot!");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if(a > b && b > c)
		{
			System.out.println(a + " a legnagyobb " + b + " a k�z�ps� " + c + " a legkissebb");
		}
		else if(a > c && c > b)
		{
			System.out.println(a + " a legnagyobb " + c + " a k�z�ps� " + b + " a legkisebb");
		}
		else if(b > a && a >c)
		{
			System.out.println(b + " a legnagyobb " + a + " a k�z�ps� " + c + " a legkissebb");
		}
		else if(b > c && c > a)
		{
			System.out.println(b + " a legnagyobb " + c + " a k�z�ps� " + a + " a legkissebb");	
		}
		else if(c > a && a > b)
		{
			System.out.println(c + " a legnagyobb " + a + " a k�z�ps� " + b + " a legkisebb");
		}
		else if(c > b && b > a)
		{
			System.out.println(c + " a legnagyobb " + b + " a k�z�ps� " + a + " a legkisebb");
		}
		else if(a == b && b > c)
		{
			System.out.println(a + " �s " + b + " egyenl� �s " + c + " a legkisebb");
		}
		else if(a == c && c > b)
		{
			System.out.println(a + " �s " + c +" egyenl� �s " + b + " a legkisebb");
		}
		else if(b == c && b > a)
		{
			System.out.println(b + " �s " + c + " egyenl� �s " + a + " a legkisebb");
		}
		else if(a == b && b == c)
		{
			System.out.println("Mind a h�rom sz�m egyenl�");
		}
	}
}
