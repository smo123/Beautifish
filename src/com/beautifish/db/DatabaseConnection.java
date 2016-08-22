/**
 * @author jinba
 *
 */
package com.beautifish.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	private static final String DBDRIVER = "org.gjt.mm.mysql.Driver";
 	private static final String DBURL = "jdbc:mysql://localhost:3306/beautifish" ;
	private static final String DBUSER = "root" ;
	private static final String DBPASSWORD = "868688" ;
	
	private Connection conn;
	
	public DatabaseConnection() throws Exception{
		Class.forName(DBDRIVER);
		conn = DriverManager.getConnection(DBURL, DBUSER, DBPASSWORD);
	}
	
	public Connection getConnection(){
		return conn;
	}
	
	public void close() throws Exception{
		if (conn != null) {
			conn.close();
		}
	}
	
}