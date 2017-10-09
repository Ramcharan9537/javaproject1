package com.connect;
import java.sql.*;
import java.util.*;
public class Scanning {
	public static void main(String args[]){  
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","charan9537");  
		  
		PreparedStatement stmt=con.prepareStatement("insert into emp values(?,?)"); 
		int i=1;
		@SuppressWarnings("resource")
		Scanner a=new Scanner(System.in);
		do
		{
			switch(i){
			case 1:
		    int id=a.nextInt();
			stmt.setInt(1, id);
			String namee=a.next();
			stmt.setString(2, namee);
	int j=stmt.executeUpdate();
		if (j>0){
			System.out.println("registered");
		}
		break;
			}
			System.out.println("enter your choice 1(yes) or 2(no)");
			i=a.nextInt();
	}while (i==1);
		
}
		catch(Exception e){ System.out.println(e);}
	}
}
  
