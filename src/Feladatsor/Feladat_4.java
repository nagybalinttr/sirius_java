package Feladatsor;
import java.util.Scanner;

public class Feladat_4 {
	public static void main(String[] args) {
		int a = 0;
		int n = 0;
		int db = 0;
		int seged = 0;
		
		Scanner sc = new Scanner(System.in);// itt p�ld�nyos System.out.println("Adj meg k�t eg�sz sz�mot!");tom a Scanner tipusu sc objektumomat a System.in adja meg hogy a console bol varom az ertekolvasast
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
