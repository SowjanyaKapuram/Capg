package condition;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first");
		int n1=sc.nextInt();
		System.out.println("enter sec");
		int n2=sc.nextInt();
		System.out.println("enter third");
		int n3=sc.nextInt();
		if(n1==n2&&n2==n3&&n3==n1)
			System.out.println("cant find");
		else {
		if(n1>n2&&n1>n3)
			System.out.println("first number is largest"+n1);
		else if(n2>n1&&n2>n3)
			System.out.println("second number is largest"+n2);
		else
			System.out.println("third number is largest"+n3);
		}

	}

}
