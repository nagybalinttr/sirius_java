package Objektum;
import java.util.Scanner;

public class Feladat_1 {
	public static void main(String[] args) {
		double radius = 0;
		double area = 0;
		double distric = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Add meg a kor sugarat: ");
		radius = sc.nextDouble();
		Kor kor = new Kor();
		area = kor.area(radius);
		distric = kor.distric(radius);

		System.out.println("A kor terulete: " + area);
		System.out.println("A kor kerulete: " + distric);

	}

}
