package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connector {
	protected Connection con;
	
	public Connection getCn() {
		return con;
	}
	
	public void setCn(Connection con) {
		this.con = con;
	}
	
	public void conectar() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/biblioteca";
			con = (Connection) DriverManager.getConnection(url,"root",""); 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void cerrar() {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
