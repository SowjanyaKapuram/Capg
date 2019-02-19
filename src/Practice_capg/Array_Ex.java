package Practice_capg;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Ex {

	private static void accept() {
		 
	      Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter no of ele");
			int n1 = sc.nextInt();
			System.out.println("Enter array ele");
			 
			int arr1[] = new int[n1];
			for (int i = 0; i < arr1.length; i++) {
				arr1[i]= sc.nextInt();
			}
				
				//int arr2[] = new int[n1];
				//int arr3[] = new int[n1];
				int c1=0;
				int c2=0;
				for (int k = 0; k < arr1.length; k++) {
					if(arr1[k]%2==0) {
						c1++;
					}
					else {
						c2++;
					}
				}
				int arr2[] = new int[c1];
				int arr3[] = new int[c2];
				int k=0;
				int j=0;
			
			for (int i = 0; i < arr1.length; i++) {
				
				
				if(arr1[i]%2==0) {
					
					arr2[k]=arr1[i];
					k++;
					
				}
				else {
					arr3[j]= arr1[i];
					j++;
				}
				
			
			}
			Arrays.sort(arr2);
			Arrays.sort(arr3);
			int m=0;
			int arr4[] = new int[c1+c2];
			for (int i = 0; i < arr4.length; i++) {
				
				if(i<c1) {
					
					arr4[i]=arr2[i];
				}
				else {
					arr4[i]=arr3[m];
				 
					m++;
				}
					
					
			 
			}
			for (int h = 0; h < arr4.length; h++) {
				
			
			System.out.println(arr4[h]);
			}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		         accept();
}
}

