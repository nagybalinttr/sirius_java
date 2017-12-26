package jesus_express;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Adatbazis {
	
	final static String host = "jdbc:mysql://localhost/jesus_express";
	final static String username = "java";
	final static String password = "1234";

	String ir(String kinek, String mit, int mennyit, String mikor, boolean szallitva) throws SQLException, ClassNotFoundException {
		int szallitvaInt = 0;
		if (szallitva) {
			szallitvaInt = 1;
		} else {
			szallitvaInt = 0;
		}
		
		String sql = "SELECT count('kinek') AS rowcount FROM `szallitas` WHERE `kinek` = '" + kinek + "';";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(host, username, password);
		Statement stmt = con.createStatement();
		ResultSet result = stmt.executeQuery(sql);
		int update;
		result.next();
		int count = result.getInt("rowcount");
		
		if (count > 0) {
			sql = "UPDATE `szallitas` SET `mit` = '"+mit+"', `mennyit` = '"+mennyit+"', `mikor` = '"+mikor+"', `szallitva` = '"+szallitvaInt+"' WHERE `kinek` = '"+kinek+"';";
			update = stmt.executeUpdate(sql);
			
			if (update == 1) {
				return "Sikeres módosítás";
			} else {
				return "Sikertelen módosítás";
			}
		} else {
			sql = "INSERT INTO `szallitas` (`kinek`, `mit`, `mennyit`, `mikor`, `szallitva`) VALUES ('"+kinek+"', '"+mit+"', '"+mennyit+"', '"+mikor+"', '"+szallitvaInt+"');";
			update = stmt.executeUpdate(sql);
			
			if (update == 1) {
				return "Sikeres mentés";
			} else {
				return "Sikertelen mentés";
			}
		}
	}
	
	String[] keres(String kinek) throws SQLException, ClassNotFoundException {
		String sql = "SELECT COUNT('kinek') AS rowcount, kinek, mit, mennyit, mikor, szallitva FROM `szallitas` WHERE `kinek` = '"+kinek+"';";

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(host, username, password);
		Statement stmt = con.createStatement();
		ResultSet result = stmt.executeQuery(sql);
		
		int count;

		result = stmt.executeQuery(sql);
		String[] datas = new String[6];
		
		while (result.next()) {
			count = result.getInt("rowcount");
			if (0 < count) {
				datas[0] = Integer.toString(count);
				datas[1] = result.getString("kinek");
				datas[2] = result.getString("mit");
				datas[3] = result.getString("mennyit");
				datas[4] = result.getString("mikor");
				datas[5] = result.getString("szallitva");
			} else {
				datas[0] = null;
				datas[1] = null;
				datas[2] = null;
				datas[3] = null;
				datas[4] = null;
				datas[5] = null;
			}
		}
		return datas;
	}
}
