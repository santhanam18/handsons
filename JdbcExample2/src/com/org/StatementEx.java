package com.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementEx {

	public static void main(String[] args) {
 Connection con = null;
 Statement st = null;
 boolean create;
 try {
	Class.forName("com.mysql.cj.jdbc.Driver");
} catch (ClassNotFoundException e) {
	e.printStackTrace();
}
 try {
	con= DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
  if(con != null)
  {
	st = con.createStatement();
  create=st.execute("create table emps(id int,name varchar(100))");
  if(create)
  {
	  System.out.println("Table not created");
  }
  else
  {
	  System.out.println("Table created");
  }
  con.close();
  }
 } catch (SQLException e) {
	e.printStackTrace();
}
 
	}

}
