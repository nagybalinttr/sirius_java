package szilveszter;


public class Élelmiszer {
	
	private String név;
	private int mennyiség;
	private boolean típus;
	private String ki_hozza;
	
	public Élelmiszer(String n, int m, boolean t, String kh ){
		
		this.név=n;
		this.mennyiség=m;
		this.típus=t;
		this.ki_hozza=kh;
	}

	

	public void setMennyiség(int mennyiség) {
		this.mennyiség = mennyiség;
	}

	public void setKi_hozza(String ki_hozza) {
		this.ki_hozza = ki_hozza;
	}

	
	
	public String toString() {
		return "Élelmiszer [név=" + név + ", mennyiség=" + mennyiség
				+ ", típus=" + típus + ", ki_hozza=" + ki_hozza + "]";
	}



	public String getNév() {
		return név;
	}
}

