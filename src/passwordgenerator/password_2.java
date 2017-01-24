package passwordgenerator;

import java.util.Random;
class General{
    private static final String lowerCase = "abcdefghijklmnopqrstuvwxyz";
    private static final String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String specChar = "@#$%!&*<>(){}[]_:;";
    private static final String intChar = "0123456789";
    
	String All(int length){
	    Random r = new Random();
	    String pass = "";
	    while (pass.length () != length){
	        int rPick = r.nextInt(4);
	        if (rPick == 0){
	            int spot = r.nextInt(lowerCase.length());
	            pass += lowerCase.charAt(spot);
	        }
	        else if (rPick == 1) {
	            int spot = r.nextInt (upperCase.length());
	            pass += upperCase.charAt(spot);
	        }
	        else if (rPick == 2) {
	            int spot = r.nextInt (specChar.length());
	            pass += specChar.charAt(spot);
	        }
	        else if (rPick == 3){
	            int spot = r.nextInt (9);
	            pass += intChar.charAt (spot);
	        }
	    }
	    return pass;
	}
	
	String Lower(int length){
	    Random r = new Random();
	    String pass = "";
	    while (pass.length () != length){
	    	int spot = r.nextInt(lowerCase.length());
	        pass += lowerCase.charAt(spot);
	    }
	    return pass;
	}
	
	String LowerAndUpperCase(int length){
	    Random r = new Random();
	    String pass = "";
	    while (pass.length () != length){
	        int rPick = r.nextInt(2);
	        if (rPick == 0){
	            int spot = r.nextInt(lowerCase.length());
	            pass += lowerCase.charAt(spot);
	        }
	        else if (rPick == 1) {
	            int spot = r.nextInt (upperCase.length());
	            pass += upperCase.charAt(spot);
	        }
	    }
	    return pass;
	}
	
	String LowerAndNumber(int length){
	    Random r = new Random();
	    String pass = "";
	    while (pass.length () != length){
	        int rPick = r.nextInt(2);
	        if (rPick == 0){
	            int spot = r.nextInt(lowerCase.length());
	            pass += lowerCase.charAt(spot);
	        }
	        else if (rPick == 1){
	            int spot = r.nextInt (9);
	            pass += intChar.charAt (spot);
	        }
	    }
	    return pass;
	}

	String LowerAndSpec(int length){
	    Random r = new Random();
	    String pass = "";
	    while (pass.length () != length){
	        int rPick = r.nextInt(2);
	        if (rPick == 0){
	            int spot = r.nextInt(lowerCase.length());
	            pass += lowerCase.charAt(spot);
	        }
	        else if (rPick == 1) {
	            int spot = r.nextInt (specChar.length());
	            pass += specChar.charAt(spot);
	        }
	    }
	    return pass;
	}

	String LowerAndUpperAndNumber(int length){
	    Random r = new Random();
	    String pass = "";
	    while (pass.length () != length){
	        int rPick = r.nextInt(3);
	        if (rPick == 0){
	            int spot = r.nextInt(lowerCase.length());
	            pass += lowerCase.charAt(spot);
	        }
	        else if (rPick == 1) {
	            int spot = r.nextInt (upperCase.length());
	            pass += upperCase.charAt(spot);
	        } 
	        else if (rPick == 2){
	            int spot = r.nextInt (9);
	            pass += intChar.charAt (spot);
	        }
	    }
	    return pass;
	}

	String LowerAndUpperAndSpec(int length){
	    Random r = new Random();
	    String pass = "";
	    while (pass.length () != length){
	        int rPick = r.nextInt(3);
	        if (rPick == 0){
	            int spot = r.nextInt(lowerCase.length());
	            pass += lowerCase.charAt(spot);
	        }
	        else if (rPick == 1) {
	            int spot = r.nextInt (upperCase.length());
	            pass += upperCase.charAt(spot);
	        }
	        else if (rPick == 2) {
	            int spot = r.nextInt (specChar.length());
	            pass += specChar.charAt(spot);
	        }
	    }
	    return pass;
	}

	String LowerAndNumberAndSpec(int length){
	    Random r = new Random();
	    String pass = "";
	    while (pass.length () != length){
	        int rPick = r.nextInt(3);
	        if (rPick == 0){
	            int spot = r.nextInt(lowerCase.length());
	            pass += lowerCase.charAt(spot);
	        }
	        else if (rPick == 1) {
	            int spot = r.nextInt (intChar.length());
	            pass += intChar.charAt(spot);
	        }
	        else if (rPick == 2) {
	            int spot = r.nextInt (specChar.length());
	            pass += specChar.charAt(spot);
	        }
	    }
	    return pass;
	}
}
public class password_2{
    //Verison 1.0
    public static void main (String[] args) {
    	General gen = new General();
    	for(int i = 0; i < 1000; i++){
        	System.out.println(i + ". jelszo: " + gen.All(8));
        	System.out.println(i + ". jelszo: " + gen.Lower(8));
        	System.out.println(i + ". jelszo: " + gen.LowerAndUpperCase(8));
        	System.out.println(i + ". jelszo: " + gen.LowerAndNumber(8));
        	System.out.println(i + ". jelszo: " + gen.LowerAndSpec(8));
        	System.out.println(i + ". jelszo: " + gen.LowerAndUpperAndNumber(8));
        	System.out.println(i + ". jelszo: " + gen.LowerAndUpperAndSpec(8));
        	System.out.println(i + ". jelszo: " + gen.LowerAndNumberAndSpec(8));
    	}
    }
}