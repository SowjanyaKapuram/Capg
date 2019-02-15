package programs;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		System.out.println("enter numbers");
		Scanner sc =new Scanner(System.in);
		double n1=sc.nextInt();
		double n2=sc.nextInt();
		System.out.println("enter the operator");
		String ch=sc.next();
		switch(ch) {
		case "+" :System.out.println("result is"+(n1+n2));
		break;
		case "-" :System.out.println("result is"+(n1-n2));
		break;
		case "*" :System.out.println("result is"+(n1*n2));
		break;
		case "/" :System.out.println("result is"+(n1/n2));
		break;
		case "%" :System.out.println("result is"+(n1%n2));
		break;
		}
	}

}
