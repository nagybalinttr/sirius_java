package Feladatsor;
import java.io.*;
import java.util.Scanner;

public class Hetedik{
	private static Scanner sc;

	public static void main(String[] args) {
		int a = 0;
		int db = 0;
		int sum = 0;
		double atlag = 0;
		
		do
		{
			System.out.println("Adj meg egy számot!");
			sc = new Scanner(System.in);
			a =  sc.nextInt();
			if(a > 0)
			{
				if(a % 2 == 0)
				{
					sum = sum + a;
					db++;
				}
			}
		}while(a > 0);
		atlag = sum / db;
		System.out.println("A megadott számok átlaga: " + atlag);
	}
}