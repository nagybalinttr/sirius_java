package gy_2017_01_16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Fajlkezeles_5 {
	public static void main(String[] args) throws IOException {
		FileReader f1 = new FileReader("/Users/balintnagy/sirius_java/src/gy_2017_01_16/be.txt");
		BufferedReader be = new BufferedReader(f1);
		int c = 0;
		char betu;
		int sum = 0;
		while((c = f1.read()) != -1){
			betu = (char)c;
			System.out.print(betu);
			if(betu != ';'){
				sum += Character.getNumericValue(betu);
			}
		}
		System.out.println("\n" + sum);
		f1.close();
		be.close();
	}
}