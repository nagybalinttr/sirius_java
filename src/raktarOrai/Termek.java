package raktarOrai;

public class Termek {
	String nev;
	
	double ar;
	double db;
	
	public Termek(String n, double a,double db)
	{
		this.ar=a;
		this.nev=n;
		this.db=db;
	}

	public double getDb() {
		return db;
	}

	public void setDb(double db) {
		this.db = db;
	}	
}
