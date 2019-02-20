package Practice_capg;

import java.util.Scanner;

public class Bricks {
	
	public static void  lastBrick() {
		
		
Scanner sc = new Scanner(System.in);
System.out.println("Enter no");
int n = sc.nextInt();
 int sum=0;
for (int i = 1;i<n; i++) {
	
	sum = sum + i+i*2;
if(sum==n) {
	
	if((sum-i*2)>=n) {
		
		System.out.println("Patlu");
		//break;
	}
	else {
		System.out.println("Motu");
	}
	 
}
	}
	}
	public static void main(String[] args) {
		 
     lastBrick();

	}

}
