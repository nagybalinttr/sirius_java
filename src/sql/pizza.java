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
			
			//9. feladat
			System.out.println("9. feladat:");
			sql = "SELECT pfutar.fnev AS futnev, pvevo.vnev AS vevonev FROM `prendeles` JOIN pvevo ON prendeles.vazon=pvevo.vazon JOIN pfutar ON prendeles.fazon=pfutar.fazon";
			result = stmt.executeQuery(sql);
			while (result.next()) {
				System.out.println(result.getString("futnev") + " szallitott " + result.getString("vevonev") + "-nak/nek");
			}
			
			//10. feladat
			System.out.println("10. feladat");
			sql = "SELECT SUM(ppizza.par) AS osszes FROM `prendeles` JOIN pvevo ON prendeles.vazon = pvevo.vazon JOIN ppizza ON prendeles.pazon = ppizza.pazon WHERE pvevo.vnev LIKE 'Columbo'";
			result = stmt.executeQuery(sql);
			while (result.next()) {
				System.out.println("Columbo osszesen: " + result.getString("osszes") + "Ft-ot koltott pizzara.");
			}
			
			//11. feladat
			System.out.println("11. feladat");
			sql = "SELECT count(*) AS db FROM `prendeles` JOIN pvevo ON prendeles.vazon = pvevo.vazon JOIN ppizza ON prendeles.pazon = ppizza.pazon WHERE pvevo.vnev LIKE 'Piedone' AND ppizza.pnev LIKE 'Kacagós'";
			result = stmt.executeQuery(sql);
			while (result.next()) {
				System.out.println("Piedone " + result.getString("db") + " alkalommal rendelt Kacagós pizzát");
			}
			
			//12. feladat
			System.out.println("12. feladat");
			sql = "SELECT count(*) AS c FROM `prendeles` WHERE vazon = (SELECT prendeles.vazon FROM `prendeles` JOIN pvevo ON prendeles.vazon = pvevo.vazon WHERE pvevo.vnev LIKE 'Derrik' GROUP BY pvevo.vnev)";
			result = stmt.executeQuery(sql);
			while (result.next()) {
				System.out.println("Derrik " + result.getString("c") + " db pizzát evett");
			}
			
			//13. feladat
			System.out.println("13. feladat");
			sql = "SELECT count(*) AS c FROM `prendeles` JOIN pvevo ON prendeles.vazon = pvevo.vazon WHERE pvevo.vnev LIKE 'Derrik'";
			result = stmt.executeQuery(sql);
			while (result.next()) {
				System.out.println("Derrik " + result.getString("c") + "x rendelt pizzát");
			}
			
			//14. feladat
			System.out.println("14. feladat");
			sql = "SELECT count(ppizza.pazon) AS c FROM prendeles JOIN ppizza ON prendeles.pazon = ppizza.pazon WHERE ppizza.pnev LIKE 'Nevetős'";
			result = stmt.executeQuery(sql);
			while (result.next()) {
				System.out.println(result.getString("c") + "db nevetős pizza fogyott el");
			}
			
			//15. feladat
			System.out.println("15. feladat");
			sql = "SELECT SUM(ppizza.par) AS osszes FROM `prendeles` JOIN ppizza ON prendeles.pazon = ppizza.pazon";
			result = stmt.executeQuery(sql);
			while (result.next()) {
				System.out.println("osszesen: " + result.getString("osszes") + "ft-ot koltottek pizzara");
			}
			
			//16. feladat
			System.out.println("16. feladat");
			sql = "SELECT COUNT(ppizza.pazon) AS db, ppizza.pnev AS nev FROM `prendeles` JOIN ppizza ON prendeles.pazon = ppizza.pazon GROUP BY ppizza.pazon";
			result = stmt.executeQuery(sql);
			while (result.next()) {
				System.out.println(result.getString("nev") + " pizzabol " + result.getString("db") + " db-ot vettek");
			}
			
			//17. feladat
			System.out.println("17. feldat");
			sql = "SELECT COUNT(*) AS db, prendeles.datum AS datum, pfutar.fnev AS futar FROM `prendeles` JOIN pfutar ON prendeles.fazon = pfutar.fazon GROUP BY prendeles.datum, pfutar.fazon";
			result = stmt.executeQuery(sql);
			while (result.next()) {
				String nev = result.getString("futar");
				Integer db = result.getInt("db");
				String datum = result.getString("datum");
				System.out.println(nev + " " + db + " db rendelest kapott " + datum + " -an/en");
			}
			
			//18. feladat
			System.out.println("18. feladat");
			sql = "SELECT COUNT(*) AS db, pvevo.vnev AS nev, prendeles.datum AS datum FROM prendeles JOIN pvevo ON prendeles.vazon = pvevo.vazon GROUP BY prendeles.datum, pvevo.vazon";
			result = stmt.executeQuery(sql);
			while (result.next()) {
				String nev = result.getString("nev");
				Integer db = result.getInt("db");
				String datum = result.getString("datum");
				System.out.println(nev + " " + db + " db rendelest adott le " + datum + " -an/en");
			}
			
			//19. feladat
			System.out.println("19. feladat");
			sql = "SELECT prendeles.datum AS datum, SUM(ppizza.par) AS bevetel FROM `prendeles` JOIN ppizza ON prendeles.pazon = ppizza.pazon GROUP by prendeles.datum";
			result = stmt.executeQuery(sql);
			while (result.next()) {
				System.out.println(result.getString("datum") + "-an/en a bevetel: " + result.getInt("bevetel") + "Ft volt.");
			}
			
			//20. feladat
			System.out.println("20. feladat");
			sql = "SELECT COUNT(*) AS db, datum FROM `prendeles` GROUP BY datum";
			result = stmt.executeQuery(sql);
			while (result.next()) {
				System.out.println(result.getString("datum") + "-an/en " + result.getInt("db") + " db rendeles volt");
			}
			
			//21. feladat
			System.out.println("21. feladat");
			sql = "SELECT prendeles.vazon AS vazon FROM `prendeles` JOIN pfutar ON prendeles.fazon = pfutar.fazon WHERE pfutar.fnev = 'Hurrikán' GROUP BY prendeles.vazon";
			result = stmt.executeQuery(sql);
			while (result.next()) {
				String vevo = result.getString("vazon");
				String sql2 = "SELECT pfutar.fnev AS futar FROM `prendeles` JOIN pfutar ON prendeles.fazon = pfutar.fazon WHERE prendeles.vazon = " + vevo + " AND NOT pfutar.fazon = 1";
				Statement stmt2 = con.createStatement();
				ResultSet result2 = stmt2.executeQuery(sql2);
				while (result2.next()) {
					System.out.println(result2.getString("futar"));
				}
				result2.close();
				stmt2.close();
			}
			
			//22. feladat
			System.out.println("22. feladat");
			
			//23. feladat
			System.out.println("23. feladat");
			
			//24. feladat
			System.out.println("24. feladat");
			sql = "SELECT pvevo.vnev AS nev FROM `prendeles` JOIN pvevo ON prendeles.vazon = pvevo.vazon WHERE prendeles.pazon IN (SELECT prendeles.pazon AS pizza FROM `prendeles` JOIN pvevo ON prendeles.vazon = pvevo.vazon WHERE pvevo.vnev = 'Columbo' GROUP BY prendeles.pazon) AND NOT pvevo.vnev = 'Columbo' GROUP BY pvevo.vnev";
			result = stmt.executeQuery(sql);
			while (result.next()) {
				System.out.println(result.getString("nev"));
			}
			
			//25. feladat
			System.out.println("25. feladat");
			sql = "SELECT ppizza.pnev AS nev FROM `prendeles` JOIN ppizza ON prendeles.pazon = ppizza.pazon WHERE prendeles.datum IN (SELECT prendeles.datum AS datum FROM `prendeles` JOIN ppizza ON prendeles.pazon = ppizza.pazon WHERE ppizza.pnev = 'Sorrento' GROUP BY prendeles.datum) AND NOT ppizza.pnev = 'Sorrento' GROUP BY ppizza.pnev";
			result = stmt.executeQuery(sql);
			while (result.next()) {
				System.out.println(result.getString("nev"));
			}
			
			//26. feladat
			System.out.println("26. feladat");
			sql = "SELECT pnev FROM `ppizza` WHERE par < (SELECT AVG(par) FROM ppizza)";
			result = stmt.executeQuery(sql);
			while (result.next()) {
				System.out.println(result.getString("pnev"));
			}
			
			
			
			
			result.close();
			stmt.close();
			con.close();
			
			System.out.println(Math.ceil(33.012)-1);
		}
		
	}

}
