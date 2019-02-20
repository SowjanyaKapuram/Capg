package Practice_capg;
import java.util.Scanner;
public class Attack {
	public static void validOrNot() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.next();
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			
		
if(ch[i] == 'A' || ch[i]=='E'|| ch[i]=='I'|| ch[i]=='O'|| ch[i]=='U' ||ch[i]=='Y') {
	
	System.out.println("Invalid");
}
else {
 
if(ch[i]!= 1 && ch[i]!= 2 && ch[i]!= 3 && ch[i]!= 4 && ch[i]!= 5 && ch[i]!= 6 && ch[i]!=7 && ch[i]!= 8 && ch[i]!= 9 ) {
	//continue;

}
	
if(ch[i] % 2==0){
	continue;
}

else 
	System.out.println("Invalid");

		 //int n= i;
		}
	//System.out.println("Valid");
	
		}
	}
	

	public static void main(String[] args) {
		validOrNot();
		
	}

}
