package gy_2017_01_16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Fajlkezeles_4 {
	public static void main(String[] args) throws IOException {
		FileReader f1 = new FileReader("/Users/balintnagy/sirius_java/src/gy_2017_01_16/be.txt");
		FileWriter f2 = new FileWriter("/Users/balintnagy/sirius_java/src/gy_2017_01_16/ki.jpg");
		PrintWriter ki = new PrintWriter(f2);
		BufferedReader be = new BufferedReader(f1);
		String sor = "";
		while((sor = be.readLine()) != null){
			ki.println(sor);
		}
		f1.close();
		f2.close();
		be.close();
	}
}