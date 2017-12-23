package szilveszter;


import java.util.ArrayList;



public class Buli {

	private ArrayList<Élelmiszer> élelmiszerek=new ArrayList<Élelmiszer>();
	
	
	
	public void Vettek(Élelmiszer e) {
		élelmiszerek.add(e);
	}


	public void Elfogyott(Élelmiszer e){
		int i;
		for(i=0;i<élelmiszerek.size();i++){
			
			if(élelmiszerek.get(i).getNév()==e.getNév()){
				élelmiszerek.remove(i);
			}
		}
		
	}


	public ArrayList<Élelmiszer> getÉlelmiszerek() {
		return élelmiszerek;
	}


	public void setÉlelmiszerek(ArrayList<Élelmiszer> élelmiszerek) {
		this.élelmiszerek = élelmiszerek;
	}
}


