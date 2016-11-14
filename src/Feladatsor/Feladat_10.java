package Feladatsor;

public class Feladat_10{
	public static void main(String[] args) {
		int i = 1;
		int szum = 0;
		int avg = 0;
		System.out.println("Irja ki az elso 15 paratlan szam osszegete es atlagat.");
		do
		{
			szum = szum + i;
			i = i + 2;
		}while(i<30);
		avg = szum / (i / 2); //azert osztom i-t 2 vel mert a lepeskozom i+2
		System.out.println("Atlaga: " + avg);
		System.out.println("Osszege: " + szum);
	}
}
