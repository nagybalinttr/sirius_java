package dolgozat_20180115;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Index {
	static ArrayList <String[]> adag = new ArrayList<String[]>();
	static ArrayList <String[]> etlap = new ArrayList<String[]>();
	static ArrayList <String[]> allergen = new ArrayList<String[]>();
	
	static ArrayList <String> vegleges = new ArrayList<String>();
	
	public static void main(String[] args) throws IOException {
		FileReader filePath = new FileReader("/Users/balintnagy/sirius_java/src/dolgozat_20180115/teszt.csv");
		BufferedReader input = new BufferedReader(filePath);
		
		FileOlvasas file = new FileOlvasas();
		adag = file.getAdag();
		etlap = file.getEtlap();
		allergen = file.getAllergen();
		
		String line = "";
		while((line = input.readLine()) != null){
			String param = line.substring(7, line.length()-1);
			if (line.substring(0, 1).equals("r")) {
				String[] params = param.split(",");
				rendel(params);
			} else if(line.substring(0, 1).equals("l")) {
				lemond(param);
			} else {
				Exception e = new SajatException();
			}
		}
		filePath.close();
		input.close();
		ir();
	}
	
	public static void rendel(String[] params) throws IOException {
		Boolean allergias = true;
		FileOlvasas file = new FileOlvasas();
		//mennyiseg vizsgalata
		for (int i = 0; i < adag.size(); i++) {
			if (0 < Integer.parseInt(adag.get(i)[1])) {
				//allergia vizsgalata
				for (int j = 0; j < allergen.size(); j++) {
					if (allergen.get(j)[1].toLowerCase().contains(params[1].toLowerCase()) == false) {
						allergias = false;
						break;
					}
				}
			}
			if (allergias) {
				adag.get(i)[1] = Integer.toString(Integer.parseInt(adag.get(i)[1]) - 1);
			}
		}
	}
	
	public static void lemond(String param) throws IOException {
		FileOlvasas file = new FileOlvasas();
		for (int i = 0; i < adag.size(); i++) {
			if (adag.get(i)[0].equals(param)) {
				adag.get(i)[1] = Integer.toString(Integer.parseInt(adag.get(i)[1]) + 1);
				break;
			}
		}
	}
	
	public static void ir() throws IOException {
		FileWriter f1 = new FileWriter("/Users/balintnagy/sirius_java/src/dolgozat_20180115/adag_kesz.csv");
		PrintWriter ki = new PrintWriter(f1);
		for (int i = 0; i < adag.size(); i++) {
			ki.println(adag.get(i)[0]+";"+adag.get(i)[1]);
		}
		ki.close();
		f1.close();
	}

}
