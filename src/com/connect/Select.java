package com.connect;

import java.sql.*;


public class Select {
	public static void main(String args[]){  
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","charan9537");  
		  Statement st=con.createStatement();
		  ResultSet rs= st.executeQuery("Select * From emp");
		  while (rs.next())
		  {
			  int id=rs.getInt("id");
			  String namee =rs.getString("namee");
			  System.out.format("%d, %s",id,namee);
			  System.out.println();
			  }}
		  catch(Exception e){ System.out.println(e);}
	
	}
}