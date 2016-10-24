package Feladatsor;
import java.io.*;
import java.util.Scanner;

public class Negyedik {
	public static void main(String[] args) {
		int a = 0;
		int n = 0;
		int db = 0;
		int seged = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Adj meg egy számot!");
		n = sc.nextInt();
		if(n < 0)
		{
			System.out.println("Nem lehet nullánál kisebb számot megadni!");
		}
		else
		{
			seged = n + 1;
			while(n > 0)
			{
				System.out.println("Adj meg az " + (seged-n) + ". számot:");
				a = sc.nextInt();
				if(a > 0)
				{
					db++;
				}
				n--;
			}
		}
		System.out.println("Összesen " + db + " páros számot adtál meg");
	}
}
