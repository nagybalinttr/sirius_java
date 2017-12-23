package szamitogep;

public class SZgMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Szamitogep sz=new Szamitogep("Intel Pentium II",2.1,2,100);
		
		System.out.println(sz.getProcesszor());
		
		sz.setProcesszor("AMD 64");
		
		System.out.println(sz.getProcesszor());
		
		
		Szamitogep sz1=new Szamitogep("AMD", 3.2, 4096, 400);
		
		Szamitogep sz2=new Szamitogep("Intel", 2.6, 2048, 500);
		
		Szamitogep sz3=new Szamitogep();
		
		System.out.println(sz3.toString());
		
		
		
	}

}