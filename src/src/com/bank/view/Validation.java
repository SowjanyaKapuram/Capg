package com.bank.view;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import com.bank.model.User;

public class Validation  {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 
	       Scanner sc= new Scanner(System.in);
	       System.out.println("Enter first name");
			String fname= sc.next();
			 System.out.println("Enter last name");
				String lname= sc.next();
				System.out.println("Enter accountno");
			    long accountno= sc.nextInt();
				System.out.println("Enter aadharno");
				long aadharno= sc.nextInt();
				System.out.println("Enter account type");
				String accounttype= sc.next();
				System.out.println("Enter pancardno");
				String pancard= sc.next();
				System.out.println("Enter phoneno");
			    long phoneno= sc.nextInt();
				System.out.println("Enter address");
				String address=sc.next();
				
				try {
					FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Vjit\\Desktop\\Program\\Demo5.txt");
					ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
					
					ArrayList<User> al = (ArrayList<User>)objectInputStream.readObject(); 
					User u= new User();
					int n = al.size();
					int count=0;
					for (int i = 0; i <al.size(); i++) {
						u= al.get(i);
						
						if(u.getAccountNo()== aadharno) {
							System.out.println("Already Exist");
							break;
						}
						else
							count++;
							
						}
						
						if(count==n) {
							System.out.println("Not Exist");
				 
							u.setFirstName(fname);
							u.setLastName(lname);
							u.setAadharNo(aadharno);
							u.setAccountNo(accountno);
							u.setAccountType(accounttype);
							u.setPanCard(pancard);
							u.setPhoneNo(phoneno);
							u.setAddress(address);
							 
							FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\VJIT\\Desktop\\Program\\Demo5.txt");
							ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
							 
							 
							objectOutputStream.writeObject(u);
							
							
								fileOutputStream.close();
							
						
					}
					 
					 
					
					 
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
}
				
		 