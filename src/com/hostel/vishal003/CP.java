package com.hostel.vishal003;


import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
	
	 static Connection con;
		
	  public static Connection createC() {
		  try {
		  // load the driver
		  Class.forName("com.mysql.jdbc.Driver");
		  
		  //create the connection ..
		  String user = "root";
		  String password = "root";
		  String url = "jdbc:mysql://localhost:3306/hostel_manage";
		  
		  con = (Connection) DriverManager.getConnection(url, user ,password);
		  
		  }catch(Exception e) {
			  e.printStackTrace();
		  }
		  return con;
	  }

}
