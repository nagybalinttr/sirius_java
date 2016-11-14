package Feladatsor;
import java.util.Scanner;

public class Feladat_3 {
	public static void main(String[] args) {
		int a; int b; int c; //bemeneti értékek
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Adj meg három egész számot!");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if(a > b && b > c)
		{
			System.out.println(a + " a legnagyobb " + b + " a középsõ " + c + " a legkissebb");
		}
		else if(a > c && c > b)
		{
			System.out.println(a + " a legnagyobb " + c + " a középsõ " + b + " a legkisebb");
		}
		else if(b > a && a >c)
		{
			System.out.println(b + " a legnagyobb " + a + " a középsõ " + c + " a legkissebb");
		}
		else if(b > c && c > a)
		{
			System.out.println(b + " a legnagyobb " + c + " a középsõ " + a + " a legkissebb");	
		}
		else if(c > a && a > b)
		{
			System.out.println(c + " a legnagyobb " + a + " a középsõ " + b + " a legkisebb");
		}
		else if(c > b && b > a)
		{
			System.out.println(c + " a legnagyobb " + b + " a középsõ " + a + " a legkisebb");
		}
		else if(a == b && b > c)
		{
			System.out.println(a + " és " + b + " egyenlõ és " + c + " a legkisebb");
		}
		else if(a == c && c > b)
		{
			System.out.println(a + " és " + c +" egyenlõ és " + b + " a legkisebb");
		}
		else if(b == c && b > a)
		{
			System.out.println(b + " és " + c + " egyenlõ és " + a + " a legkisebb");
		}
		else if(a == b && b == c)
		{
			System.out.println("Mind a három szám egyenlõ");
		}
	}
}
