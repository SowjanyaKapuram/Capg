package condition;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter num");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==0)
		{
			n=n+10;
			
		}
		else
		{
			
		
			n=n+15;
		}
		System.out.println(n);

	}
	

}
