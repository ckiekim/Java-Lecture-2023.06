package mysql.ex07_bbs.dao;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class UsersDao {
	private String host;
	private String user;
	private String password;
	private String database;
	private String port;
	
	public UsersDao() {
		try {
			Properties props = new Properties();
			InputStream is = new FileInputStream("D:/JavaWorkspace/JavaLecture/src/mysql/ex07_bbs/mysql.properties");
			props.load(is);
			is.close();
			
			host = props.getProperty("host");
			user = props.getProperty("user");
			password = props.getProperty("password");
			database = props.getProperty("database");
			port = props.getProperty("port");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Connection myConnection() {
		Connection conn = null;
		try {
			String connStr = "jdbc:mysql://" + host + ":" + port + "/" + database;
			conn = DriverManager.getConnection(connStr, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
