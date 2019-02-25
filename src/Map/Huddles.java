package Map;

import java.util.Scanner;

public class Huddles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int k= sc.nextInt();
		int[] a= new int[n];
		for (int i = 0; i < n; i++) {
			a[i]=sc.nextInt();
			
		}
		 
		for (int i = 0; i < a.length-1; i++) {
			
			if(a[i]>a[i+1]) 
				 m = a[i];
		
		System.out.println(m-k);
		}
	}
	

}
