package gy_2016_11_24;
import java.util.Scanner;
public class Feladat_2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int nap;

		System.out.println("Adja meg a nap sorszamat!");
		nap=sc.nextInt();

		switch(nap){
		case 1: System.out.println("Hetfo"); break;
		case 2: System.out.println("Kedd"); break;
		case 3:System.out.println("Szerda"); break;
		case 4: System.out.println("Csutortok"); break;
		case 5: System.out.println("Pentek"); break;
		case 6: System.out.println("Szombat"); break;
		case 7: System.out.println("Vasernap"); break;
		default : System.out.println("Nincs ilyen nap");
		}
	}
}