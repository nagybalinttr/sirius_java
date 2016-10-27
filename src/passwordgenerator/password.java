package passwordgenerator;

import java.util.Random;
import java.util.Scanner;
public class password {
	public static void main(String[] args) {
		int hossz = 0;
		int db = 0;
		Scanner sc = new Scanner(System.in);
		sc = new Scanner(System.in);
		String tomb[] = {"q", "w", "e", "r", "t", "z", "u", "i", "o", "p", "a", "s", "d", "f", "g", "h", "j", "k", "l", "y", "x", "c", "v", "b", "n", "m", "Q", "W", "E", "R", "T", "Z", "U", "I", "O", "P", "A", "S", "D", "F", "G", "H", "J", "K", "L", "Y", "X", "V", "B", "N", "M", "+", "!", "%", "/", "=", "(", ")", "<", ">", "&", "@", "{", "}", "[", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
		System.out.println("Milyen hosszú  jelszót szeretnél?");
		hossz = sc.nextInt();
		System.out.println("Hány darab jelszót szeretnél?");
		db = sc.nextInt();
		for(int j = 0; j <= db; j++)
		{
			System.out.println("");
			for(int i = 0; i < hossz; i++)
			{
				Random ran = new Random();
				int x = ran.nextInt(tomb.length);
				System.out.print(tomb[x]);	
			}
			
		}

}
}