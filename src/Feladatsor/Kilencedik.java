package Feladatsor;
import java.io.*;
import java.util.Scanner;

public class Kilencedik{
	public static void main(String[] args) {
		double avg = 0;
		double szum = 0;
		int x = 0;
		
		for(x=1; x <= 20; x++)
		{
			szum = szum + x;
		}
		avg = szum / x;
		System.out.println("Az elso 20 termeszetes szam atlaga: " + avg);
		System.out.println("Az elso 20 termeszetes szam osszege: " + szum);
	}
}