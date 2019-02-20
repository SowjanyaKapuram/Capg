package Practice_capg;

import java.util.Scanner;

public class Photo {
public static void display() {
	
	
	int l= 45;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter width and height");
	int w= sc.nextInt();
	int h= sc.nextInt();
	
	if(w<l || h<l) {
		System.out.println("UPLOAD ANOTHER");
	}
	else if(w>l || h>l) {
		
		if(w==h) {
			System.out.println("ACCEPTED");
		}
		else {
			System.out.println("CROP IT");
		}
	}
	
	
	
}
	public static void main(String[] args) {
		display();
		
	}

}
