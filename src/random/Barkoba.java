package random;
import java.util.Random;
import java.util.Scanner;
public class Barkoba {
	public static void main(String[] args) {
		int bekert = 0, random = 0;
		Scanner sc = new Scanner(System.in);
		sc = new Scanner(System.in);
		
		Random ran = new Random();
		random = ran.nextInt(50);
		
		//System.out.println("A veletlen szam: " + random);
		for(int i = 0; i < 9; i++){
			bekert = sc.nextInt();
			if(random == bekert){
				System.out.println("Talált!");
				break;
			}
			else if(bekert < random){
				System.out.println("Nem talalt!\nAdj meg nagyobb szamot!");
			}
			else if(bekert > random){
				System.out.println("Nem talalt!\nAdj meg kisebb szamot!");
			}
		}

	}

}
