package Practice_capg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Encryption1 {
	public static class CaesorCypher {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try {
				FileInputStream fileInputStream1 = new FileInputStream("C:\\Users\\VJIT\\Desktop\\Program\\Demo.txt");
				//System.out.println("Enter an integer");
				//int n= sc.nextInt();
				//System.out.println(fileInputStream.read());
				
					fileInputStream1.close();
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				FileInputStream fileInputStream2 = new FileInputStream("C:\\Users\\VJIT\\Desktop\\Program\\Demo.txt");
				//System.out.println("Enter an integer");
				//int n= sc.nextInt();
				//System.out.println(fileInputStream2.read());
				
					fileInputStream2.close();
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			decrypt(encrypt("fileInputStream2.read() ","fileInputStream1.read()"),"fileInputStream1.read()");
		}

		private static void decrypt() {
			// TODO Auto-generated method stub
			String msg=encryptMsg.toString();
			char[] letters = msg.toCharArray();
			
			StringBuilder decryptedMsg = new StringBuilder();
			
			for (int i = 0; i < letters.length; i++) {
				decryptedMsg.append((char) (byte) (letters[i] - s));
			}
			System.out.println(decryptedMsg);
			
		}

		

		private static StringBuilder encrypt() {
			// TODO Auto-generated method stub
			StringBuilder encryptMsg=new StringBuilder();
			try {
				FileInputStream fileInputStream1 = new FileInputStream("C:\\Users\\VJIT\\Desktop\\Program\\Demo.txt");
				//System.out.println("Enter an integer");
				//int n= sc.nextInt();
			     int n= fileInputStream1.read();
				
					fileInputStream1.close();
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				FileInputStream fileInputStream2 = new FileInputStream("C:\\Users\\VJIT\\Desktop\\Program\\Demo.txt");
				//System.out.println("Enter an integer");
				//int n= sc.nextInt();
				int i;
				while((i=fileInputStream2.read()) != -1) {
					char[k] letters = i;
					
				}

					fileInputStream2.close();
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

			char[] letters = (char() s).toCharArray();
			
			for (int i = 0; i < letters.length; i++) {
				encryptMsg.append((char) (byte) (letters[i] + n ));
			}
			return encryptMsg;
		}

	}


}
