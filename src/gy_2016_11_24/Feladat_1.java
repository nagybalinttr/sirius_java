package gy_2016_11_24;

import java.util.Scanner;


public class Feladat_1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		double homerseklet;
		
		System.out.println("Add meg a viz homersekletet!");
		
		homerseklet=sc.nextDouble();
		
		if(homerseklet>=100){
			System.out.println("Goz");
			
		}
		else if(homerseklet>0){
			System.out.println("Folyadek");
		}
		else{
				System.out.println("Jeg");
				}
	}
}