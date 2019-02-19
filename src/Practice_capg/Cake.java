package Practice_capg;

import java.util.Scanner;

public class Cake {

	
	static int birthdayCakeCandles(int arr[]) {
		int temp,high,i;
		int count=0;
	
		for(int p=0;p<arr.length-1;p++) {
		for( i=0;i<(arr.length-p-1);i++) {
			if(arr[i]>arr[i+1]) {
				temp= arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				
				
		}
			
			
	}
		if(arr[i]==arr.length) {
		high= arr[arr.length-1];
		}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]== high) {
				count++;
			}
			//return count;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Cake c= new Cake();
Scanner sc = new Scanner(System.in);
System.out.println("Enter no of candles");
int n = sc.nextInt();
System.out.println("Enter candle height");
int arr[] = new int[n];
for(int i=0;i<n;i++) {
	arr[i] = sc.nextInt();
	
}
c.birthdayCakeCandles(arr);
//System.out.println(count);
	}

}
