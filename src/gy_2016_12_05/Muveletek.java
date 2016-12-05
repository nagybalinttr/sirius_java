package gy_2016_12_05;

public class Muveletek {
	public double Osszead(int a, int b){
		double eredmeny = a + b;
		return eredmeny;
	}
	public double Kivonas(int a, int b){
		double eredmeny = a - b;
		return eredmeny;
	}
	public double Szorzas(int a, int b){
		double eredmeny = a * b;
		return eredmeny;
	}
	public double Osztas(int a, int b){
		double eredmeny = a / b;
		return eredmeny;
	}
	public void Binaris(int szam){
		StringBuilder binary = new StringBuilder();
		int ertek = 0;
	    while(szam > 0){
	    	ertek = szam % 2;
	    	binary.append(ertek);
	        szam = szam / 2;
	    }
	    System.out.print(binary.reverse());
	    return;
	}
}
