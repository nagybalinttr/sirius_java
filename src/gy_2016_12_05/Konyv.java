package gy_2016_12_05;
public class Konyv {
	String cim;
	String szerzo;
	String ISBN;
	int ir;
	int kiadas_eve;
	Konyv(String cim, String szerzo, String ISBN, int ir, int kiadas_eve){
		this.cim = cim;
		this.szerzo = szerzo;
		this.ISBN = ISBN;
		this.ir = ir;
		this.kiadas_eve = kiadas_eve;
	}
}