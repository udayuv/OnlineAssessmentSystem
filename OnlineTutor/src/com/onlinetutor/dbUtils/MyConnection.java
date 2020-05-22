package com.onlinetutor.dbUtils;
import java.sql.*;

public class MyConnection {
  public static Connection getConnection() throws Exception
  {
	  String url="jdbc:mysql://localhost:3306/test";
	  //load JDBC drvr class 
	  Class.forName("com.mysql.jdbc.Driver");
	  return DriverManager.getConnection(url, "root","root");
  }
}
