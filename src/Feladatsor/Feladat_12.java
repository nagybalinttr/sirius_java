package Feladatsor;
import java.util.Scanner;

public class Feladat_12{
	private static Scanner sc;
	public static void main(String[] args) {
		int a = 0;
		int negativ = 0;
		int pozitiv = 0;
		Scanner sc = new Scanner(System.in);// itt p�ld�nyos System.out.println("Adj meg k�t eg�sz sz�mot!");tom a Scanner tipusu sc objektumomat a System.in adja meg hogy a console bol varom az ertekolvasast
		System.out.println("12. feladat");
		System.out.println("Adj meg egy szamot");
		
		
		do{
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