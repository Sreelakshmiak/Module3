package com.ust.ioc;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection implements Connection {
	private String url;
	private String dbUserName;
	private String dbPassword;
	
	public void setUrl(String url) {
		this.url = url;
	}

	public void setDbUserName(String dbUserName) {
		this.dbUserName = dbUserName;
	}

	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}
	

	public String getUrl() {
		return url;
	}

	public String getDbUserName() {
		return dbUserName;
	}

	public String getDbPassword() {
		return dbPassword;
	}

	public DBConnection getConnection() {
		try {
			java.sql.Connection con=DriverManager.getConnection(url,dbUserName,dbPassword);
			System.out.println("connected to mysql");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Connection called");
		return new DBConnection();
	}
}
