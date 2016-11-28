package gy_2016_11_28;
import java.util.Scanner;
/*
 * Nagy Balint
 */
public class Feladat {
	public static void main(String[] args) {
		int hossz, keresett;
		Tomb tmb = new Tomb();
		Scanner sc = new Scanner(System.in);	
		//hibas adat kezeles TODO
		System.out.println("Add meg a tombod hosszat:");
		hossz = sc.nextInt();
		int[] tomb = new int[hossz];		
		//feltolt es kiir
		System.out.println("\nIme a feltoltott tombom:");
		tomb = tmb.Tomb_feltolt(hossz);
		tmb.Tomb_kiir(tomb);	
		//feltolt+rendez minimummal+kiir
		System.out.println("\nRendezes minimum kivalasztas szerint");
		tmb.Tomb_kiir(tmb.Rendez_min(tomb));
		//feltolt + rendez buborekkal + kiir
		System.out.println("\nRendezes buborekkal");
		tmb.Tomb_kiir(tmb.Rendez_bub(tomb));
		//keresett ertek bekerese
		System.out.println("\nAdd meg a keresett erteket:");
		keresett = sc.nextInt();
		//kereses linearisan
		System.out.println("Linearis kereses:");
		if(tmb.Keres_lin(keresett, tomb) > -1){
			System.out.println("A keresett ertek " + tmb.Keres_lin(keresett, tomb) + ". indexen talalhato");
		}
		else{
			System.out.println("A keresett ertek nem talalhato a tombben.");
		}
		
		
		//kereses binarias
		System.out.println("\nBinaris kereses:");
		if(tmb.Keres_bin(keresett, tomb) > -1){
			System.out.println("A keresett ertek " + tmb.Keres_bin(keresett, tomb) + ". indexen talalhato");
		}
		else{
			System.out.println("A keresett ertek nem talalhato a tombben.");
		}
	}

}
