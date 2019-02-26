package Map;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Panagram {

	public static void main(String[] args) {
		 
Scanner sc =new Scanner(System.in);
		
		String s1= sc.next();
		 HashSet<Character> al = new HashSet<Character>();
		 //int count=0;
		 for (int i = 0; i < s1.length()-1; i++) {
			al.add(s1.charAt(i));
			 
		}
		
		int count= al.size();
		
		if(count==27) 
		 System.out.println("Panagram");
		else
			System.out.println(" Not panagram");
	}

}
