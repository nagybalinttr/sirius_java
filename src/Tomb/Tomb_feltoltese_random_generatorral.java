package Tomb;
import java.util.Random;
public class Tomb_feltoltese_random_generatorral {

	public static void main(String[] args) {
		int[] tomb = new int[10];
		int i = 0;
		Random rand = new Random();
		for(i = 0; i < 10; i++){
			tomb[i] = rand.nextInt(50);
		}
		for(i = 0; i < 10; i++){
			System.out.print(tomb[i] + " ");
		}
	}
}