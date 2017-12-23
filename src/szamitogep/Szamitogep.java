package szamitogep;

public class Szamitogep {

	private String processzor;
	private double sebesseg;
	private int ram;
	private int hdd;
	
	public Szamitogep(String p, double s, int r, int h){
		this.processzor=p;
		this.sebesseg=s;
		this.ram=r;
		this.hdd=h;
	}
	
	public Szamitogep(){
		
	}
	
	

	public String getProcesszor() {
		return processzor;
	}

	public void setProcesszor(String processzor) {
		this.processzor = processzor;
	}

	public double getSebesseg() {
		return sebesseg;
	}

	public void setSebesseg(double sebesseg) {
		this.sebesseg = sebesseg;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getHdd() {
		return hdd;
	}

	public void setHdd(int hdd) {
		this.hdd = hdd;
	}
	
	
	
}
