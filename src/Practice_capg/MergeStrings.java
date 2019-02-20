package Practice_capg;

import java.util.Scanner;

public class MergeStrings {
	public static void  mergeStringOneByOne() {
		
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter string1 length");
		//int n1 = sc.nextInt();
		System.out.println("Enter string1");
		String s1= sc.next();	
		//System.out.println("Enter string2 length");
		//int n2 = sc.nextInt();
		System.out.println("Enter string2");
		String s2= sc.next();
		 
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		char c3[] = new char[c1.length+c2.length];
		int k;
		StringBuilder sb=new StringBuilder();
		for (int j = 0; j < c1.length; j++) {
		k=j;
		sb.append( c1.charAt(k));
		sb.append(c2.charAt(k));
		System.out.println(sb);
		}
		
	}

	public static void main(String[] args) {
		 mergeStringOneByOne();
		 
	}

}
