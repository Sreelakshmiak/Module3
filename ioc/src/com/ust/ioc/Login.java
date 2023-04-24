package com.ust.ioc;

public class Login {
	private static String username;
	private static String password;
	DBConnection db;
	

	public DBConnection getDb() {
		return db;
	}
	public void setDb(DBConnection db) {
		this.db = db;
	}
	public String validate() {
		//obtain connection and wrte sql
		//to verify username and password exists
		//in database
		//db =new DBConnection();
		Connection con=db.getConnection();
		return "Login Validated";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
