package Practice_capg;

import java.util.Arrays;
import java.util.Scanner;

public class Average {
	Average av= new Average();
	public void greaterThanAverage(double arr[]){
		
		 Arrays.Sort(arr);
		 int sum=0;
		 for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		 int avg= sum/arr.length;
		 for (int i = 0; i < arr.length; i++) {
			if()
		}
	}
	public static void main(String[] args) {
		//Average av= new Average();
		
	

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no of ele");
		int n = sc.nextInt();
		System.out.println("Enter array ele");
		 
		double arr[] = new double[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]= sc.nextInt();
			
		}
		
       av.greaterThanAverage(arr);
       
}
}