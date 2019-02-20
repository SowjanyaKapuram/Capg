package Practice_capg;

import java.util.Scanner;

public class Birthday {

	public static void chocolate() {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("No of times");
		int n= sc.nextInt();
		
		 
		for (int i = 0; i < n; i++) {
			System.out.println("Enter no of friends and no of chocolates");
			int x= sc.nextInt();
			int y= sc.nextInt();
		
		if(y%x==0) {
			System.out.println("Yes");
			
		}
		else {
			System.out.println("No");
		}
		}
	}
	public static void main(String[] args) {
		chocolate();
		
	}

}
