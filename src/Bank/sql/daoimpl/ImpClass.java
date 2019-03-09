package Bank.sql.daoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;
import Bank.sql.dao.*;
import Bank.sql.main.MainClass;
import Bank.sql.model.*;
public class ImpClass implements InterfaceEx {
	

	static Scanner sc = new Scanner(System.in);
	
		 public void customerLogin() {
		// TODO Auto-generated method stub
	
			ImpClass m1 = new ImpClass();
			
					try {
						Class.forName("com.mysql.jdbc.Driver");
					 
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
					Statement statement = connection.createStatement();
					 ResultSet resultset= statement.executeQuery("select * from employee ");
					
					 System.out.println("Enter account no");
					 System.out.println("Enter password");
					 long accno = sc.nextLong();
					 String pw= sc.next();
					  int count=0;
					 if(resultset.getInt(1)==accno && resultset.getString(4)==pw) {
						 
						 
						System.out.println("Welcome");
					m1.operations();
					 }
					 else
						 count++;
					
					 if(count==count) {
						 System.out.println("Customer does not exist");
						 
					 }
					 
					 
					 
					 
		 } catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

			 
			 
	}

		private void operations() {
			ImpClass m1 = new ImpClass();
			int menu =  sc.nextInt();
			System.out.println("Enter 1. for withdrawal 2. for deposit 3. for exit");
			switch(menu)
			{
			case 1: m1.withdrawl();
			break;

			case 2: m1.deposit();
			break;
			case 3: System.exit(0);
			break;
			default: System.out.println("Invalid Choice");
			break;

			}
		}






		private void deposit() {
			 
			Connection connection;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
			 
			Statement statement = connection.createStatement();
			 ResultSet resultset= statement.executeQuery("select * from employee ");
			
			 System.out.println("Enter amount");
              double amt = sc.nextDouble();
              //if(resultset.getInt(5)) {
            	  
             // }
            	  
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}






		private void withdrawl() {
			 
			
			
			
		}





		public void customerRegistration() {
			
			 Model model= new  Model();
				
				Random r = new Random();
				long accno = r.nextLong();
				model.setAccountNo(accno);
		        System.out.println("Enter fname");
		        model.setFirstName(sc.next());
		        System.out.println("Enter lname");
		        model.setLastName(sc.next());
		        System.out.println("Enter password");
		        model.setPassword(sc.next());
		        System.out.println("Enter balance");
		        model.setBalance(sc.nextDouble());
		        System.out.println("Enter aadhar no");
		        model.setAadharNo(sc.nextLong());
		      
		        System.out.println("Enter pan card no");
		         model.setPanCard(sc.next());
				
		        System.out.println("Enter moblie no");
		        model.setPhoneNo(sc.nextLong());
		        System.out.println("Enter address");
		        model.setAddress(sc.next());
		        System.out.println("accno:"+ " "+ accno);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		 
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
		
		PreparedStatement preparedStatement = connection.prepareStatement(" insert into custdetails values(?,?,?,?,?,?,?,?,?)");
		 	   
        preparedStatement.setLong(1, model.getAadharNo());
		preparedStatement.setString(2, model.getFirstName());
		preparedStatement.setString(3, model.getLastName());
		preparedStatement.setString(4, model.getPassword());
		preparedStatement.setDouble(5, model.getBalance());
		preparedStatement.setLong(6, model.getAadharNo());
		preparedStatement.setString(7, model.getPanCard());
		preparedStatement.setLong(8, model.getPhoneNo());
		preparedStatement.setString(9, model.getAddress());
		
		 int i = preparedStatement.executeUpdate();
	
		
		if (i==1) {
			System.out.println("Done");
		}
		else 
			System.out.println("Error");
			
	
		connection.close();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		   
	}
		  
		  
			  
			 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			  
		  }


 
	
		  
	
	 

	