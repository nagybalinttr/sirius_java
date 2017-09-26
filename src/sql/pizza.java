package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class pizza {
	
	final static String host = "jdbc:mysql://localhost/pizza";
	final static String username = "java";
	final static String password = "1234";
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(host, username, password);
		
		if(con != null) {
			System.out.println("Sikeres csatlakozas");
			
			//1. feladat
			System.out.println("1. feladat:");
			String sql = "SELECT fnev FROM `pfutar`;";
			Statement stmt = con.createStatement();
			ResultSet result = stmt.executeQuery(sql);
			while (result.next()) {
				System.out.println(result.getString("fnev"));
			}
			
			//2. feladat
			System.out.println("2. feladat:");
			sql = "SELECT pnev, par FROM `ppizza`;";
			result = stmt.executeQuery(sql);
			while (result.next()) {
				System.out.println(result.getString("pnev") + result.getString("par"));
			}
			
			//3. feladat
			System.out.println("3. feladat:");
			sql = "SELECT AVG(par) as atlag FROM `ppizza`;";
			result = stmt.executeQuery(sql);
			while (result.next()) {
				System.out.println("Pizzak atlagara: " + result.getString("atlag") + " Fabatka");
			}
			
			
			//4. feladat
			System.out.println("4. feladat:");
			sql = "SELECT pnev FROM ppizza WHERE par < 300;";
			result = stmt.executeQuery(sql);
			Integer i = 0;
			while (result.next()) {
				System.out.println(result.getString("pnev"));
				i++;
			}
			if(i == 0) {
				System.out.println("nincs 300ft nal olcsobb pizza");
			}
			
			//5. feladat
			System.out.println("5. feladat:");
			sql = "SELECT fnev FROM `prendeles` JOIN pfutar ON prendeles.fazon=pfutar.fazon WHERE razon LIKE 1";
			result = stmt.executeQuery(sql);
			while (result.next()) {
				System.out.println(result.getString("fnev"));
			}
			
			//6. feladat
			System.out.println("6. feladat:");
			sql = "SELECT vnev FROM `prendeles` JOIN pvevo ON prendeles.vazon=pvevo.vazon WHERE ido > 12.00";
			result = stmt.executeQuery(sql);
			while (result.next()) {
				System.out.println(result.getString("vnev"));
			}
			
			//7. feladat
			System.out.println("7. feladat:");
			sql = "SELECT ppizza.pnev as pizzaneve FROM `prendeles` JOIN pvevo ON prendeles.vazon=pvevo.vazon JOIN ppizza ON prendeles.pazon=ppizza.pazon WHERE vnev LIKE 'Derrik' GROUP BY ppizza.pnev";
			result = stmt.executeQuery(sql);
			while (result.next()) {
				System.out.println(result.getString("pizzaneve"));
			}
			
			//8. feladat
			System.out.println("8. feladat:");
			sql = "SELECT pfutar.fnev as futarneve FROM `prendeles` JOIN pfutar ON prendeles.fazon=pfutar.fazon JOIN pvevo ON pvevo.vazon=prendeles.vazon WHERE pvevo.vnev LIKE 'Piedone'";
			result = stmt.executeQuery(sql);
			while (result.next()) {
				System.out.println(result.getString("futarneve"));
			}

			result.close();
			stmt.close();
			con.close();
			
			System.out.println(Math.ceil(33.012)-1);
		}
		
	}

}
