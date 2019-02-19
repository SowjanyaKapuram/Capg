package Practice;

import java.util.Scanner;
import java.math.*;
public class Diagonal {
	 public int row;
	 public int col;
	

	public void display(row , col) {
		this.row = row;
		this.col = col;
		if(row==col)
		{
			
	
		int arr[][]= new int[row][col];
		System.out.println("Enter elements");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j <col; j++) {
				
				
				arr[i][j] = sc.nextInt();
				
				System.out.print("arr[i][j]"+ " ");
				
			}
			System.out.println();
		}
		else
		{ 
			System.out.println("Enter square matrix");
		}
		}
	}
    
		public int difference(int arr[][])
		{ 
		    // Initialize sums of diagonals 
		    int d1 = 0, d2 = 0; 
		  
		    for (int i = 0; i < row; i++) 
		    { 
		        for (int j = 0; j < col; j++) 
		        { 
		            // finding sum of primary diagonal 
		            if (i == j) 
		                d1 += arr[i][j]; 
		  
		            // finding sum of secondary diagonal 
		            if (i == row- j - 1) 
		                d2 += arr[i][j]; 
		        } 
		    } 
		  
		    // Absolute difference of the sums 
		    // across the diagonals 
		    return abs(d1 - d2); 
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Diagonal d = new Diagonal();
Scanner sc = new Scanner(System.in);
System.out.println("Enter rows and cols");
int row = sc.nextInt();
int col = sc.nextInt();
 d.display(row , col);


	}

}
