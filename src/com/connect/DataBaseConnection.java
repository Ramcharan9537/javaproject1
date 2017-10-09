package com.connect;

import java.sql.*;  
class DataBaseConnection{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/employee","root","charan9537");  
//here sonoo is database name, root is username and password  
//Statement stmt=con.createStatement();  
//ResultSet rs=stmt.executeQuery("select * from emp");  
//while(rs.next())  
//System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)); 
System.out.print("connected");
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  
