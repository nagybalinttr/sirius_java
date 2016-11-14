package gy_2016_11_14;

import java.util.Scanner;

public class Feladat_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double bekert;
		int pozitiv = 0;
		int negativ = 0;
		
		do
		{
			System.out.println("Adj meg egy szamot: ");
			bekert = sc.nextDouble();
			if(bekert > 0){
				pozitiv++;
			}
			else if(bekert < 0){
				negativ++;
			}
		}while(bekert != 0);
		System.out.println(pozitiv + "db pozitiv szamot adtal meg\n" + negativ + "db negativ szamot adtal meg");
	}	
}
