package Feladatsor;
import java.io.*;
import java.util.Scanner;

public class Nyolcadik{
	private static Scanner sc;
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int eredmeny = 0;
		
		System.out.println("Adj meg két számot!");
		sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		for(int j = b; j >= 1; j--)
		{
			eredmeny = eredmeny + a;
		}
		System.out.println("A megadott számok szorzata: " + eredmeny);
	}
}