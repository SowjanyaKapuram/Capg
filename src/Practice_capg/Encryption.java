package Practice_capg;
import java.util.Scanner;
public class Encryption {
	private static String encrypt() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter statement");
		
		String s= sc.next();
		System.out.println("Enter alphabet rotation factor");
		int n= sc.nextInt();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++){
			sb.append((char)(byte)(s.charAt(i)+n));
		}
		System.out.println(sb);
		return sb;
	}

	private static void decrypt(StringBuilder sb, int n) {
		for(int i=0;i<s.length();i++){
			sb.append((char)(byte)(s.charAt(i)-n));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         encrypt();
	}

}
