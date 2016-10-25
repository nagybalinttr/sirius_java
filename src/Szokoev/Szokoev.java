package Szokoev;

import java.util.Scanner;
import java.io.*;

public class Szokoev {
	private static Scanner sc;
	public static void main(String[] args) {
		int ev = 0;
		sc = new Scanner(System.in);
		System.out.println("Adj meg egy evet es megmondom neked, hogy az szokoev-e :D");
		ev = sc.nextInt();
		
		if((ev % 4 == 0 && ev % 400 == 0) || (ev % 4 == 0))
			System.out.println("Igen");
		else
			System.out.println("Nem");		
	}
}