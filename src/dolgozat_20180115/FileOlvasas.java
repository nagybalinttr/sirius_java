package dolgozat_20180115;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileOlvasas {
	static ArrayList <String[]> adag = new ArrayList<String[]>();
	static ArrayList <String[]> etlap = new ArrayList<String[]>();
	static ArrayList <String[]> allergen = new ArrayList<String[]>();
	
	public ArrayList<String[]> getAdag() throws IOException {
		if (adag.size() == 0) { // ezzel oldom meg hogy csak egyszer keruljon at a file tartalama az array listbe
			FileReader filePath = new FileReader("/Users/balintnagy/sirius_java/src/dolgozat_20180115/adag.csv");
			BufferedReader input = new BufferedReader(filePath);

			String line = "";
			while((line = input.readLine()) != null){
				String[] parts = line.split(";");
				adag.add(parts);
			}
			filePath.close();
			input.close();
		}
		return adag;
	}
	
	public ArrayList<String[]> getEtlap() throws IOException {
		if (etlap.size() == 0) {
			FileReader filePath = new FileReader("/Users/balintnagy/sirius_java/src/dolgozat_20180115/etlap.csv");
			BufferedReader input = new BufferedReader(filePath);

			String line = "";
			while((line = input.readLine()) != null){
				String[] parts = line.split(";");
				etlap.add(parts);
			}
			filePath.close();
			input.close();
		}
		
		return etlap;
	}
	
	public ArrayList<String[]> getAllergen() throws IOException {
		if (allergen.size() == 0) {
			FileReader filePath = new FileReader("/Users/balintnagy/sirius_java/src/dolgozat_20180115/allergen.csv");
			BufferedReader input = new BufferedReader(filePath);

			String line = "";
			while((line = input.readLine()) != null){
				String[] parts = line.split(";");
				allergen.add(parts);
			}
			filePath.close();
			input.close();
		}
		
		return allergen;
	}
	
	
}
