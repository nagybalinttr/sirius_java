package jesus_express;

public class Kiszallitas {
	String Addressee;
	String GiftName;
	int pty;
	String date;
	Boolean IsSuccess;
	
	public Kiszallitas(String Cimzett, String AjandekNeve, int db, String datum, Boolean sikeres)
	{
		this.Addressee = Cimzett;
		this.GiftName = AjandekNeve;
		this.pty = db;
		this.date = datum;
		this.IsSuccess = sikeres;
	}

	public String getCimzett()
	{
		return Addressee;
	}
	
	
	public String getAjandek()
	{
		return GiftName;
	}
	
	public int getDarab()
	{
		return pty;
	}
	
	public String getIdopont()
	{
		return date;
	}
	
	public boolean getSikeres()
	{
		return IsSuccess;
	}
	
	public String toString() //Visszadaja a kiszállítás String reprezentációját
	{
		StringBuilder sb = new StringBuilder();
		sb.append("");
		sb.append(date);
		String text = sb.toString();
		
		return text;
	}
	
	public void kiszállítva() //Amennyiben megtörtént a kiszállítás beállítja a Sikeres értékét.
	{
		IsSuccess = true;
	}
	
	public void maskor(String ido) //Az időpontot változtatja meg.
	{
		date = ido;
	}
}
