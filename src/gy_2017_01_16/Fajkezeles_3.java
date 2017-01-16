package gy_2017_01_16;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Fajkezeles_3 {

	public static void main(String[] args) throws IOException {
		FileWriter f1 = new FileWriter("/Users/balintnagy/sirius_java/src/gy_2017_01_16/ki.txt");
		PrintWriter ki = new PrintWriter(f1);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("irj be valamit");
		String beir = sc.nextLine();
		
		ki.println(beir);
		sc.close();
		ki.close();
		f1.close();
	}

}
