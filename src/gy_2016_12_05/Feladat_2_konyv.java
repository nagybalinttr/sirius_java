package gy_2016_12_05;
import java.util.Scanner;
public class Feladat_2_konyv {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Szamologep szam=new Szamologep();
					
		int a,b, szorzat,osszeg,kulonbseg;
		double hanyados;
		int[] kettes=new int[5];

		System.out.println("Add meg az elso szamot! a:");
		a=sc.nextInt();
		System.out.println("Add meg a masodik szamot! b:");
		b=sc.nextInt();
		
		osszeg=szam.osszead(a, b);
		kulonbseg=szam.kivon(a, b);
		szorzat=szam.szoroz(a, b);
		hanyados=szam.oszt(a, b);		
		
		System.out.println(a + "+" + b + "=" + osszeg);
		System.out.println(a + "-" + b + "=" + kulonbseg);
		System.out.println(a + "*" + b + "=" + szorzat);
		System.out.println(a + "/" + b + "=" + hanyados);
		
		System.out.println(a + "->");
		int i;
		kettes=szam.binaris(a);
		
		for(i = 0; i < kettes.length; i++)
		{
			System.out.print(kettes[i] + " ");
		}
		System.out.println("");
		Konyv konyv1 = new Konyv("Nyird_ki_ezt_a_naplot", "Keri_Smith", "9789632616780",2100,2016);
		Konyv konyv2 = new Konyv ("Gyuruk_ura", "J.R.R._Tolkien", "4536782312435", 5600, 2001);
		
		Konyv[] vasarolt = new Konyv[2]; // konyvek tarolasa egy Konyv tombben
		vasarolt[0] = konyv1;
		vasarolt[1] = konyv2;
		
		int osszes_ir = konyv1.ir * 21;
		System.out.println("Osszesen: " + osszes_ir);
		osszes_ir = 0;
		for(i = 0; i < vasarolt.length; i++){
		osszes_ir = osszes_ir + vasarolt[i].ir;
			}
		
		System.out.println("Osszesen: " + osszes_ir);
		
	}

}
