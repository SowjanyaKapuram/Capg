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

 


public class ViewUser {
	static int count =1;
	//User u = new User();
	public static User setInfo() {
		Scanner sc= new Scanner(System.in);
		User u = new User();
		
		System.out.println("Enter details of Person"+count);
		u.setFirstName(sc.next());
		u.setLastName(sc.next());
		u.setAadharNo(sc.nextLong());
		u.setAccountNo(sc.nextLong());
		u.setAccountType(sc.next());
		u.setPanCard(sc.next());
		u.setPhoneNo(sc.nextLong());
		u.setAddress(sc.next());
		count++;
		return u;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<User> sa= new ArrayList<>();
		sa.add(setInfo());
		//sa.add(setInfo());
		//sa.add(setInfo());
		
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\VJIT\\Desktop\\Program\\Demo5.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			 
			 
			objectOutputStream.writeObject(sa);
			
			
				 objectOutputStream.close();
			
			
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		
		/* try {
			FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Vjit\\Desktop\\Program\\Demo5.txt");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			
			ArrayList<User> s = (ArrayList<User>)objectInputStream.readObject(); 
			User b= new User();
			b= s.get(0);
			System.out.println(b.getFirstName());
			
			 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */

				 
		
	}

}
