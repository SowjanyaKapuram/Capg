package Practice_capg;
import java.util.Scanner;
public class Encryption {
	 
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			decrypt(encrypt("Hello-World-Java",3),3);
		}

		private static void decrypt(StringBuilder encryptMsg, int n) {
			// TODO Auto-generated method stub
			String msg=encryptMsg.toString();
			char[] letters = msg.toCharArray();
			
			StringBuilder decryptedMsg = new StringBuilder();
			
			for (int i = 0; i < letters.length; i++) {
				decryptedMsg.append((char) (byte) (letters[i] - n));
			}
			System.out.println(decryptedMsg);
			
		}

		

		private static StringBuilder encrypt(String s, int n) {
			// TODO Auto-generated method stub
			StringBuilder encryptMsg=new StringBuilder();
			
			char[] letters = s.toCharArray();
			
			for (int i = 0; i < letters.length; i++) {
				encryptMsg.append((char) (byte) (letters[i] + n));
			}
			System.out.println(encryptMsg);
			return encryptMsg;
		}

	}


