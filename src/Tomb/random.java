package Tomb;
import java.util.Random;
public class random {

	public static void main(String[] args) {
		int[] tomb = new int[10];
		
		Random rand = new Random();
		
		int i = 0;
		for(i = 0; i < 10; i++){
			tomb[i] = rand.nextInt(50);
		}
		for(i = 0; i < 10; i++){
			System.out.print(tomb[i] + " ");
		}
	}
}
/*
 * egy diak dolgozatanak ertekelese
 * a dolgozatban 5 feladat van
 * minden feladatra 0 és 10 pont kozotti pontot lehet adni
 * generaljuk random a feladatok pontszamait
 * irjuk hanyas a dolgozata
 * 80% tol 5os
 * 70% tol 4
 * 60% tol 3
 * 50% tol 2
 * az erdemjegyet szammal es betuvel is irjuk ki
 */