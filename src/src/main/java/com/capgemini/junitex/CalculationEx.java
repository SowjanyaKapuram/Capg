package com.capgemini.junitex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CalculationEx {
	static int j,i;
	int add(int a,int b) {
		return a+b;
	}

	int sub(int a, int b) {
		return a-b;
	}
	int insertDb(int pcode,String pname, String pcat,String pdesc,int pprice) {
		
	 
		
		
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
			PreparedStatement preparedStatement = connection.prepareStatement("insert into product values(?,?,?,?,?)");
			
			preparedStatement.setInt(1, pcode);
			preparedStatement.setString(2, pname);
			preparedStatement.setString(3, pcat);
			preparedStatement.setString(4, pdesc);
			preparedStatement.setInt(5, pprice);
			
			i  = preparedStatement.executeUpdate();
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
			
	}
	
	int updateDb(int pprice, int pcode) {
		
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
			PreparedStatement preparedStatement = connection.prepareStatement("Update product set product_price=?  where product_code=?");
		 
		     preparedStatement.setInt(1, pprice);
		     preparedStatement.setInt(2, pcode);
		     
		  j= preparedStatement.executeUpdate();

		  
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return j;
		
		
	}
	
String selectDb( int pcode ) {
		
		
		

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
			Statement statement = connection.createStatement();
			ResultSet resultset= statement.executeQuery("select product_name=? from product where product_code =? ");
		
			String s= resultset.getString(1);
			
				
				
			}
				
			
			
		
		return 0;
			
		
		
	}
}
