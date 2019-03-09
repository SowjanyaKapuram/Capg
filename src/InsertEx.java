import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import java.sql.PreparedStatement;

public class InsertEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		 
//1
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
			PreparedStatement preparedStatement = connection.prepareStatement("insert into employee values(?,?,?,?,?,?)");
			 
			System.out.println("Enter id");
			int id = sc.nextInt();
			System.out.println("Enter name");
			String name = sc.next();
			System.out.println("Enter dept");
			String dept = sc.next();
			System.out.println("Enter age");
			int age = sc.nextInt();
			System.out.println("Enter address");
			String address = sc.next();
			System.out.println("Enter salary");
			int salary = sc.nextInt();
			
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2,name);
			preparedStatement.setString(3, dept);
			preparedStatement.setInt(4, age);
			preparedStatement.setString(5,address);
			preparedStatement.setInt(6, salary);
            			
			int i= preparedStatement.executeUpdate();
			
			if(i==1) 
				System.out.println("Done");
			else
				System.out.println("Error");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
