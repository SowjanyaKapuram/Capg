package Practice_capg;

import java.util.Arrays;
import java.util.Scanner;
public class Merge {
	 //Scanner sc= new Scanner(System.in);
	private static void accept() {
		 
      Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter no of ele");
		int n1 = sc.nextInt();
		System.out.println("Enter array ele");
		 
		int arr1[] = new int[n1];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]= sc.nextInt();
			
		}
		System.out.println("Enter no of ele");
		int n2= sc.nextInt();

		System.out.println("Enter array ele");
		 
		int arr2[] = new int[n2];
		for (int i = 0; i < arr2.length; i++) {
			arr1[i]= sc.nextInt();
			
		}

		 
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int arr3[]= new int[n1+n2];
		 
			  
			 // int[] arr22 = new int[arr2.length + arr3.length];
			System.arraycopy(arr1, 0, arr3, 0, arr1.length);
			System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
			System.out.println(Arrays.toString(arr3));
			for (int j = 0; j < arr3.length; j++) {
				
			
			System.out.println(arr3[j]);
		}
	}
		
	

	 
		
		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		         accept();
             //accept();
             
	}

}
