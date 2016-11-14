package gy_2016_11_14;

import java.util.Scanner;

public class Feladat_6 {
	public static void main(String[] args) {
		double homerseklet; //azert double a tipus mert tort erteket is felvehet a homerseklet
		Scanner sc = new Scanner(System.in);
		System.out.println("Add meg a homersekletet:");
		homerseklet = sc.nextDouble();
		if(homerseklet <= 0){
			System.out.println("Jeg halmazallapotu!!");
		}
		else if(0 < homerseklet && homerseklet < 100){ //azert kell ket feltetelt megadni mert a folyekony halmazállapot 0-tol nagyobb de 100 foknal kisebb
			System.out.println("Folyadek halmazallapotu!");
		}
		else {
			System.out.println("Goz halmazallapotu!");
		}
	}
}