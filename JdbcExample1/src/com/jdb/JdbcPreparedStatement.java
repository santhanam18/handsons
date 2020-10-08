package com.jdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcPreparedStatement {

	public static void main(String[] args) {
 Connection con = null;
 try {
	Class.forName("com.mysql.cj.jdbc.Driver");
} catch (ClassNotFoundException e1) {
	e1.printStackTrace();
}
 try {
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "root");
  PreparedStatement pst=con.prepareStatement("insert into emp values (?,?,?)");
  pst.setInt(1, 3);
  pst.setString(2,"samcurran");
  pst.setString(3, "dubai");
  pst.executeUpdate();
  System.out.println("Updated Successfully");
  con.close();
 } catch (SQLException e) {
	e.printStackTrace();
}
	}



}
