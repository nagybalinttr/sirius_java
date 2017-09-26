package sql;

import java.sql.*;
import java.util.Scanner;

public class adatbazis {
	
	final static String host = "jdbc:mysql://localhost/javasql";
	final static String username = "java";
	final static String password = "1234";

	static boolean seged(String nev) throws SQLException, ClassNotFoundException {
		String c = "SELECT count('id') AS rowcount FROM `kaloria` WHERE `etelnev` LIKE '%" + nev + "%';";

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(host, username, password);

		Statement s = con.createStatement();
		ResultSet r = s.executeQuery(c);
		r.next();
		int count = r.getInt("rowcount");
		r.close();
		s.close();
		con.close();
		if (count > 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		sc = new Scanner(System.in);

		String nev;

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(host, username, password);

		if (con != null) {
			System.out.println("sikeres kapcsolodas");
			System.out.println("Add meg a keresett etel nevet");
			nev = sc.next();

			if (nev != null && nev != "") {

				if (seged(nev)) {
					String sql = "SELECT * FROM `kaloria` WHERE `etelnev` LIKE '%" + nev + "%';";

					Statement stmt = con.createStatement();
					ResultSet result = stmt.executeQuery(sql);

					while (result.next()) {
						System.out.println(
								result.getString("id") + " => " + result.getString("etelnev") + " => "
								+ result.getString("kaloria") + " => " + result.getString("feherje") + " => "
								+ result.getString("szenhidrat")
						);
					}

					result.close();
					stmt.close();
					con.close();
				} else {
					System.out.println("Nincs találat");
				}

			} else {
				System.out.println("Valós értéket adj meg");
			}

		} else {
			System.out.println("Hiba a kapcsolatban!");
		}
	}

}
