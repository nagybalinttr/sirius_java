package gy_2016_12_12;

public class Szamologep {
	double faktorialis(double a){
		int i;
		double fakt;
		fakt = 1;
		for(i = 2; i <= a; i++){
			fakt *= i;
		}
		return fakt;
	}
	double hatvanyzas(int a, int b){
		double eredmeny = a;
		int i = 0;
		for(i = 2; i <= b; i++){
			eredmeny *= a;
		}
		return eredmeny;
	}
	double[] masodfoku(double a, double b, double c){
		double tomb[] = new double[3];
		
		return tomb;
	}
}
