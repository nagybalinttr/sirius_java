package gy_2017_01_16;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Fajlkezeles {
	public static void main(String[] args) throws IOException {
		String elvalaszto = File.separator; // elvalszto karakter
		int c = 0;
		int db = 0;
		char betu;
		FileReader f1 = new FileReader("/Users/balintnagy/sirius_java/src/gy_2017_01_16/be.txt");
		System.out.println(f1.getEncoding());
		while((c = f1.read()) != -1){
			betu = (char)c;
			System.out.print(betu);
			if(betu == 'e'){
				db++;
			}
		}
		System.out.println("\ndb: " + db);
		f1.close();
	}
}