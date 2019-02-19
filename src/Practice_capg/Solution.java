package Practice_capg;

import java.util.Scanner;

public class Solution {
	
	
 static void countAppleAndOranges(int s, int t, int a, int b,int[]apples, int[]oranges) {
	 
	 int applec=0; 
	 int orangec=0;
	 for(int i=0;i<apples.length;i++) {
		 if((a+apples[i]>s)&& (b+oranges[i]<t)) {
			 applec++;
		 }
			 
	 }
	 for(int i=0;i<oranges.length;i++) {
		 if((a+apples[i]>s) && (b+oranges[i]<t)) {
			 orangec++;
		 }
	 }
	 System.out.println(applec);
	 System.out.println(orangec);
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution p = new Solution();
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter starting point");
		int s  = sc.nextInt();
		System.out.println("Enter ending point");
		int t = sc.nextInt();
		System.out.println("Enter apple tree point");
		int a = sc.nextInt();
		System.out.println("Enter orange tree point");
        int b = sc.nextInt();
        System.out.println("Apple count");
		int c = sc.nextInt();
		System.out.println("oranges count");
        int d = sc.nextInt();
        System.out.println("Enter position of apples");
        int apples[] = new int[c];
        
        for(int i=0;i<apples.length;i++) {
        	
        	apples[i]= sc.nextInt();
        	
        }
        System.out.println("Enter position of oranges");
        int oranges[] = new int[d];
for(int i=0;i<apples.length;i++) {
        	
        	oranges[i]= sc.nextInt();
}
        	p.countAppleAndOranges(s, t, a, b, apples, oranges);
        	
        }
	}


