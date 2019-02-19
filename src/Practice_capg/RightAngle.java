package Practice_capg;

import java.util.Scanner;

public class RightAngle {
	public void rTriangle(int a,int b, int c) {
		if(a*a==(b*b+c*c)) {
			System.out.println("Right angle triangle");
		}
		else if(b*b== (a*a+c*c)) {
			System.out.println("Right angle triangle");
		}
		else if(c*c==(b*b+a*a)) {
			System.out.println("Right angle triangle");
		}
		else 
			System.out.println("Not a Right angle triangle");
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		RightAngle r = new RightAngle();
		
		System.out.println("Enter three numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		r.rTriangle(a,b,c);
		
	}

}
