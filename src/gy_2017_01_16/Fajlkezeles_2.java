package gy_2017_01_16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Fajlkezeles_2 {
	public static void main(String[] args) throws IOException {
		String elvalaszto = File.separator; // elvalszto karakter
		FileReader f1 = new FileReader("/Users/balintnagy/sirius_java/src/gy_2017_01_16/be.txt");
		//System.out.println(f1.getEncoding()); //file kodolas
		BufferedReader be = new BufferedReader(f1);
		String sor = "";
		while((sor = be.readLine()) != null){
			System.out.println(sor);
		}
		f1.close();
		be.close();
	}
}