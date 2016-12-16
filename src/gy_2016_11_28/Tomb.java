package gy_2016_11_28;

import java.util.Random;

public class Tomb {
	int i, hossz;
	public int[] Tomb_feltolt(int hossz){
		int[] tomb = new int[hossz];
		Random ran = new Random();
		for(i = 0; i < hossz; i++){
			tomb[i] = ran.nextInt(50) + 1;
		}
		return tomb;
	}
	public void Tomb_kiir(int[] t){
		for(i = 0; i < t.length; i++){
			System.out.print(t[i] + " ");
		}
	}
	public int[] Rendez_min(int[] t){
		int minindex, seged, j;
		for(i = 0; i < t.length; i++){
			minindex = i;
			for(j = i + 1; j < t.length; j++){
				if(t[j] < t[minindex]){
					seged = t[minindex];
					t[minindex] = t[j];
					t[j] = seged;
				}
			}
		}
		return t;
	}
	public int[] Rendez_bub(int[] t){
		int j, seged;
		boolean csere = true;
		for(j = t.length-1; j >= 0; j--){
			if(!csere) break;
			csere = false;
			for(i = 0; i < j; i++){
				if(t[i+1] < t[i]){
					seged = t[i+1];
					t[i+1] = t[i];
					t[i] = seged;
					csere = true;
				}
			}
		}		
		return t;
	}
	public int Keres_lin(int keresett, int[] t){
		int hol = -1; //azert kell -1 es erteket felvenni mert a tombnek a legkisebb indexe a 0
		for(i = 0; i < 10; i++){
			if(t[i] == keresett){
				hol = i;
				return hol;
			}
		}
		return -1;
	}
	public int Keres_bin(int keresett, int[] t){
		int eleje = 0;
		int vege = t.length;
		int kozepe = vege/2;
		while(eleje<=vege){
			if(t[kozepe] == keresett){
				System.out.println("A keresett elem a " + kozepe + ". indexen talalhat�");
				return kozepe;
			}
			else if(keresett > t[kozepe]){
				eleje = kozepe + 1;
			}
			else{
				vege = kozepe - 1;
			}
			kozepe = (vege + eleje) / 2;
		}
		return -1;
	}
}