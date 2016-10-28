package Hazi_feladat;
import java.util.Random;
public class Osztalyzat {

	public static void main(String[] args) {
		int[] feladat = new int[5];
		int[] pontszam = {25, 30, 35, 40, 50};
		int szum = 0;
		
		Random veletlen = new Random();
		
		// feladatok feltoltese pontszamokkal
		for(int i = 0; i < 5; i++){
			feladat[i] = veletlen.nextInt(10);
			szum +=  feladat[i];
		}
		
		System.out.println("2. hazifeladat. Osztalyzatok meghatarozasa \n");

		// osztalyzat meghatarozasa
		if(szum < pontszam[0]){
			System.out.println("On " + szum + " pontot (" + szum / 0.5 + "%) ért el a dolgozatban amire 1-es azaz elegtelen erdemjegyet kaphat \n");
		}
		else if (szum >= pontszam[0] && szum < pontszam[1]){
			System.out.println("On " + szum + " pontot (" + szum / 0.5 + "%) ért el a dolgozatban amire 2-es azaz elegseges erdemjegyet kaphat \n");
		}
		else if(szum >= pontszam[1] && szum < pontszam[2]){
			System.out.println("On " + szum + " pontot (" + szum / 0.5 + "%) ért el a dolgozatban amire 3-es azaz kozepes erdemjegyet kaphat \n");
		}
		else if(szum >= pontszam[2] && szum < pontszam[3]){
			System.out.println("On " + szum + " pontot (" + szum / 0.5 + "%) ért el a dolgozatban amire 4-es azaz jo erdemjegyet kaphat \n");
		}
		else if(szum >= pontszam[3]){
			System.out.println("On " + szum + " pontot (" + szum / 0.5 + "%) ért el a dolgozatban amire 5-os azaz kivalo erdemjegyet kaphat \n");
		}
		else if(szum == pontszam[4]){
			System.out.println("On " + szum + " pontot (" + szum / 0.5 + "%) ért el a dolgozatban amire *5-os azaz kivalo erdemjegyet kaphat \n");
		}
		
		// osztalyzat skala
		System.out.println("50%-tol 2-es");
		System.out.println("60%-tol 3-as");
		System.out.println("70%-tol 4-es");
		System.out.println("80%-tol 5-os");
	}
}
