package Feladatsor;
import java.io.*;
import java.util.Scanner;

public class Tizenkettedik{
	private static Scanner sc;
	public static void main(String[] args) {
		int a = 0;
		int negativ = 0;
		int pozitiv = 0;
		
		System.out.println("12. feladat");
		System.out.println("Adj meg egy szamot");
		sc = new Scanner(System.in);
		
		do
		{
			a =  sc.nextInt();
			if(a>0)
			{
				pozitiv++;
			}
			else if(a < 0)
			{
				negativ++;
			}
		}while(a != 0);
		System.out.println("Pozitiv: :" + pozitiv);
		System.out.println("Negativ :" + negativ);
	}
}