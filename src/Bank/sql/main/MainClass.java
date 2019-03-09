package Bank.sql.main;

import java.util.Scanner;

import Bank.sql.dao.*;
import Bank.sql.model.*;
import Bank.sql.daoimpl.*;

public class MainClass extends ImpClass {

		 
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	     //InterfaceEx interfaceEx = new ImpClass();
	   //customerRegistration(setInfo());
	     
		System.out.println("Enter 1 for Registration. 2 for Login");
		int menu = sc.nextInt();
		InterfaceEx  mc = new ImpClass();
		switch(menu)
		{
		case 1: mc.customerRegistration();
		break;

		case 2: mc.customerLogin();
		break;

		default: System.out.println("Invalid Choice");
		break;

		}

	}

	@Override
	public void customerRegistration() {
		// TODO Auto-generated method stub
		
	}

}
