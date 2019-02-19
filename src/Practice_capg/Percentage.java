package Practice_capg;

import java.util.Scanner;

public class Percentage {
double c1=0;
double  c2=0;
double  c3=0;
	public void plusMinus(int arr[]) {
		//System.out.println("Enter type of element");
		
		for(int i=0;i<arr.length;i++) {
		
		if(arr[i]>0) {
			c1++;
		}
		else if(arr[i]<0){
			c2++;
			
		}
		else {
			c3++;
		}
	}
		System.out.println(c1/arr.length);
		System.out.println(c2/arr.length);
		System.out.println(c3/arr.length);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Percentage p = new Percentage();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements");
		int n = sc.nextInt();
	
		int arr[] = new int[n];
		System.out.println("Enter array elements");
		for(int i= 0;i<n;i++) {
			arr[i] = sc.nextInt();
			
		}
		p.plusMinus(arr);
	}

}
