package Practice_capg;

import java.util.Scanner;

public class Array {
	Scanner sc = new Scanner(System.in);
	public void small(int arr[]) {
		
	int temp;
		for(int p=1;p<=arr.length-1;p++) {
			for( int i=1;i<=(arr.length-p-1);i++) {
				if(arr[i]>arr[i+1]) {
					temp= arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					
				}
			}
				}
		System.out.println("Enter position");
		int b = sc.nextInt();
		if(b<arr.length) {
			for(int i=1;i<=arr.length;i++) {
				System.out.println(arr[b]);
				break;
			}
		}
		
	}

	public static void main(String[] args) {
		Array a = new Array();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements");
		int n = sc.nextInt();
		System.out.println("Enter array elements");
		int arr[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i]= sc.nextInt();
			
		}
		a.small(arr);
		//a.large(arr);
		
	}

}
