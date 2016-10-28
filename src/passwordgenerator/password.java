package passwordgenerator;

import java.util.Random;
import java.util.Scanner;
public class password {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc = new Scanner(System.in);
		int hossz = 0;
		int db = 0;
		int a_max = 0;
		int vegleges_tomb_hossza = 0;
		Boolean kisbetu = false;
		Boolean nagybetu = false;
		Boolean szam = false;
		Boolean spec = false;
		
		String[] tomb_kisbetu = {"q", "w", "e", "r", "t", "z", "u", "i", "o", "p", "a", "s", "d", "f", "g", "h", "j", "k", "l", "y", "x", "c", "v", "b", "n", "m"};
		String[] tomb_nagybetu = {"Q", "W", "E", "R", "T", "Z", "U", "I", "O", "P", "A", "S", "D", "F", "G", "H", "J", "K", "L", "Y", "X", "C",  "V", "B", "N", "M"};
		String[] tomb_szam = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
		String[] tomb_spec = {"+", "!", "%", "/", "=", "(", ")", "<", ">", "&", "@", "{", "}", "["};
		
		System.out.println("Milyen hossz�  jelsz�t szeretn�l?");
		hossz = sc.nextInt();
		System.out.println("H�ny darab jelsz�t szeretn�l?");
		db = sc.nextInt();
		
		System.out.println("Kisbetuket akarsz a jelszoba? (true / false)");
		kisbetu = sc.nextBoolean();
		
		System.out.println("Nagybetuket akarsz a jelszoba? (true / false)");
		nagybetu = sc.nextBoolean();
		
		System.out.println("Szamokat akarsz a jelszoba? (true / false)");
		szam = sc.nextBoolean();
		
		System.out.println("Specialais karaktereket akarsz a jelszoba? (true / false)");
		spec = sc.nextBoolean();
		//a vegleges tomb hosszanak meghatarozasa
		if(kisbetu){vegleges_tomb_hossza += tomb_kisbetu.length;}
		if(nagybetu){vegleges_tomb_hossza += tomb_nagybetu.length;}
		if(szam){vegleges_tomb_hossza += tomb_szam.length;}
		if(spec){vegleges_tomb_hossza += tomb_spec.length;}		
		String[] tomb_vegleges = new String[vegleges_tomb_hossza];
		
		//vegleges tomb elmeinek inicializalasa
		
		if(kisbetu){
			for(int a = 0, b = 0; b < tomb_kisbetu.length; a++, b++){
				tomb_vegleges[a] = tomb_kisbetu[b];
				a_max = a;
			}
		}
		if(nagybetu){
			a_max++;
			for(int a = a_max, b = 0; b < tomb_nagybetu.length; a++, b++){
				tomb_vegleges[a] = tomb_nagybetu[b];
				a_max = a;
			}
		}
		if(szam){
			a_max++;
			for(int a = a_max, b = 0; b < tomb_szam.length; a++, b++){
				tomb_vegleges[a] = tomb_szam[b];
				a_max = a;
			}
		}
		if(spec){
			a_max++;
			for(int a = a_max, b = 0; b < tomb_spec.length; a++, b++){
				tomb_vegleges[a] = tomb_spec[b];
				a_max = a;
			}
		}
		
		// jelszavak eloallitasa
		for(int j = 1; j <= db; j++){
			String jelszo = ""; //Azert kell itt deklaralni a valtozot mert amikor a belso for ciklus lefut utana a kovetkezp jelszohoz egy ures valtozora van szukseg kulonben a ".concat()" hozza fuzi a z elozo jelszohoz a random karakter
			for(int i = 0; i < hossz; i++){
				Random ran = new Random();
				int x = ran.nextInt(tomb_vegleges.length);
				jelszo = jelszo.concat(tomb_vegleges[x]); //A ".concat()" fuzi hozza a veletlen karakter a jelszo valtozomhoz
			}
			System.out.println(j + ". jelszo: " + jelszo);
		}
	}
}