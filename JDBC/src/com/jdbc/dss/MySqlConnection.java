package com.jdbc.dss;


import java.sql.*;

public class MySqlConnection {

	public static void main(String[] args)
	{   try {
		 Connection con=ConnectionUtils.getconnection();
		  Statement str=con.createStatement();
        ResultSet rs=str.executeQuery("select * from products");
        while(rs.next())
        {
        	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+  rs.getFloat(3));
        }
	}
		 catch(Exception e){}

}
}
