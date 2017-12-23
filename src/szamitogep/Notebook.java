package szamitogep;

public class Notebook extends Szamitogep{

	double uzemido;
	
	public Notebook(String p, double s, int r, int h, double u) {
		super(p, s, r, h);
		this.uzemido=u;
		
	}

	public double getUzemido() {
		return uzemido;
	}

	public void setUzemido(double uzemido) {
		this.uzemido = uzemido;
	}
	

}
