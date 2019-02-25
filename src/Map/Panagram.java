package Map;

import java.util.Scanner;
import java.util.TreeSet;

public class Panagram {

	public static void main(String[] args) {
		 
Scanner sc =new Scanner(System.in);
		
		String s1= sc.next();
		char[] ch1 = s1.toCharArray();
		String s2= "abcdefghijklmnopqrstuvwxyz";
		char[] ch2 = s2.toCharArray();
		int count=0;
		//TreeSet<String>  treeSet = new TreeSet<>();
		 for (int i = 0; i < ch1.length; i++) {
				for (int j = 0; j < ch2.length; j++) {
					
					count++;
				}
				
				 
			}
		
		if(count>26) 
	
		 System.out.println("Panagram");
		else
			System.out.println(" Not panagram");
	}

}
