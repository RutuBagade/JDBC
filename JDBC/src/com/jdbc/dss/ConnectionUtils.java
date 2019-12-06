package com.jdbc.dss;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtils
{
	
		public static Connection getconnection()
		{
			Connection con=null;
			try
			{
				//1.load Driver
				Class.forName("com.mysql.jdbc.Driver");
                 //configure url,root,password
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/southwind","root","root");
				
			}
			catch(Exception e)
			{
				System.out.println("Connection failed...");
			}
			return con;
		}
	
}
	  

