package loop;

import java.util.Scanner;

public class Multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first");
		int n1=sc.nextInt();
		int i=0;
		while(i<=10) {
			System.out.println(n1+" X "+i+" = "+n1*i);
			i++;
		}

	}

}
