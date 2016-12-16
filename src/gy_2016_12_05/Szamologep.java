package gy_2016_12_05;

public class Szamologep {

	int osszead(int a, int b){
		int osszeg=a+b;
		return osszeg;
	}
	int kivon(int a, int b){
		int kulonbseg=a-b;
		return kulonbseg;
	}
	int szoroz(int a, int b){
		int szorzat=a*b;
		return szorzat;
	}
	double oszt(int a, int b){
		double hanyados=a+b;
		return hanyados;
	}
	
	
	int[] binaris(int a){
		int[] bin=new int[5];
		int alap=a;int i=4;
		
		while(alap>0){
			bin[i]=alap%2;
			alap=alap/2;
			i--;
		}
		return bin;
	}	
}