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
		System.out.println("Adj meg egy sz�mot!");
		n = sc.nextInt();
		if(n < 0)
		{
			System.out.println("Nem lehet null�n�l kisebb sz�mot megadni!");
		}
		else
		{
			seged = n + 1;
			while(n > 0)
			{
				System.out.println("Adj meg az " + (seged-n) + ". sz�mot:");
				a = sc.nextInt();
				if(a > 0)
				{
					db++;
				}
				n--;
			}
		}
		System.out.println("�sszesen " + db + " p�ros sz�mot adt�l meg");
	}
}
