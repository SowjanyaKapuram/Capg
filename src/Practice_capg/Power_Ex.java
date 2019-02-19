package Practice_capg;

import java.util.Scanner;

public class Power_Ex {
   public void powerM(int base[],int power[] ) {
	   
	   for(int i=0;i<base.length;i++){
	   
	   for(int j=0;i<power.length;j++) {
		  
			   try {
			   System.out.println(Math.pow(base[i], power[i]));
			   }
			
			   catch(Exception e) {
				   System.out.println("Do not enter negative numbers");
			   
		   }
	   }
   }
   }
   
	public static void main(String[] args) {
		 Power_Ex obj = new  Power_Ex();
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter no of elements");
		 int s= sc.nextInt();
		 
		 int base[] =new int[s];
		 int power[] =new int[s];
		 System.out.println("Enter base array elements");
		 for(int i=0;i<s;i++) {
			 base[i]= sc.nextInt(); 
		 }
		 System.out.println("Enter power array elements");
		 for(int i=0;i<s;i++) {
			 power[i]= sc.nextInt(); 
		 }
		 
obj.powerM(base,power);

		 
		 
		
	}

}
