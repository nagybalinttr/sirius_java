package passwordgenerator;

import java.util.Random;
import java.util.Scanner;
public class password {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc = new Scanner(System.in);
		int a = 0; int b = 0;
		int hossz = 0;
		int db = 0;
		int vegleges_tomb_hossza = 0;
		Boolean kisbetu = false;
		Boolean nagybetu = false;
		Boolean szam = false;
		Boolean spec = false;
		
		String[] tomb_kisbetu = {"q", "w", "e", "r", "t", "z", "u", "i", "o", "p", "a", "s", "d", "f", "g", "h", "j", "k", "l", "y", "x", "c", "v", "b", "n", "m"};
		String[] tomb_nagybetu = {"Q", "W", "E", "R", "T", "Z", "U", "I", "O", "P", "A", "S", "D", "F", "G", "H", "J", "K", "L", "Y", "X", "C",  "V", "B", "N", "M"};
		String[] tomb_szam = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
		String[] tomb_kulonleges = {"+", "!", "%", "/", "=", "(", ")", "<", ">", "&", "@", "{", "}", "["};
		String[] tomb_allin = {"q", "w", "e", "r", "t", "z", "u", "i", "o", "p", "a", "s", "d", "f", "g", "h", "j", "k", "l", "y", "x", "c", "v", "b", "n", "m", "Q", "W", "E", "R", "T", "Z", "U", "I", "O", "P", "A", "S", "D", "F", "G", "H", "J", "K", "L", "Y", "X", "C", "V", "B", "N", "M", "+", "!", "%", "/", "=", "(", ")", "<", ">", "&", "@", "{", "}", "[", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
		
		vegleges_tomb_hossza = tomb_kisbetu.length + tomb_nagybetu.length + tomb_szam.length + tomb_kulonleges.length;
		String[] tomb_vegleges  = new String[vegleges_tomb_hossza];
		
		System.out.println("Milyen hosszú  jelszót szeretnél?");
		hossz = sc.nextInt();
		System.out.println("Hány darab jelszót szeretnél?");
		db = sc.nextInt();
		System.out.println("Kisbetuket akarsz a jelszoba? (true / false)");
		kisbetu = sc.nextBoolean();
		
		System.out.println("Nagybetuket akarsz a jelszoba? (true / false)");
		nagybetu = sc.nextBoolean();
		
		System.out.println("Szamokat akarsz a jelszoba? (true / false)");
		szam = sc.nextBoolean();
		
		System.out.println("Specialais karaktereket akarsz a jelszoba? (true / false)");
		spec = sc.nextBoolean();
		
		if(kisbetu)
		{

		}
		if(nagybetu)
		{

		}
		if(szam)
		{
			
		}
		if(spec)
		{
		}
				for(int j = 1; j <= db; j++)
		{
			String jelszo = ""; //Azert kell itt deklaralni a valtozot mert amikor a belso for ciklus lefut utana a kovetkezp jelszohoz egy ures valtozora van szukseg kulonben a ".concat()" hozza fuzi a z elozo jelszohoz a random karakter
			for(int i = 0; i < hossz; i++)
			{
				Random ran = new Random();
				int x = ran.nextInt(tomb_vegleges.length);
				jelszo = jelszo.concat(tomb_vegleges[x]); //A ".concat()" fuzi hozza a veletlen karakter a jelszo valtozomhoz
			}
			System.out.println(j + ". jelszo: " + jelszo);
		}
		
	}
}