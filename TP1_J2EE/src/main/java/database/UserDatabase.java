package database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import metier.User;

public class UserDatabase {
	private String dburl = "jdbc:mysql://localhost:3306/tp1";
	private String dbuname = "root";
	private String dbpw = "";
	private String dbdriver = "com.mysql.jdbc.Driver";
	public void loadDriver(String dbDriver) {
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Connection getConnection() {
		loadDriver(dbdriver);
		Connection conn=null;
		try {
			conn = DriverManager.getConnection(dburl, dbuname, dbpw);
			System.out.println("You're connected to database");
			return conn;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return conn;
		}
	}	
public String insert(User usr) {
	Connection conn = getConnection();
	String result = "Data entered successfully";
	String sql = "INSERT INTO tp1.users VALUES(?,?,?,?,?,?,?)";
	try {
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, "test");//usr.getFirstName());
		ps.setString(2, "test");//usr.getLastName());
		ps.setString(3, "test");//usr.getEmail());
		ps.setString(4, "test");//usr.getMobile());
		ps.setString(5, "test");//usr.getDateOfBirth());
		ps.setString(6, "test");//usr.getUsername());
		ps.setString(7, "test");//usr.getPassword());
		ps.executeUpdate();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		result = "Something went wrong !!";
	}
	return result;
}
}
