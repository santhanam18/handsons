package com.jdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcExample {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "root");
			if (con != null) {
				st = con.createStatement();
				rs = st.executeQuery("select * from emp");
				while(rs.next())
				{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
				}
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
