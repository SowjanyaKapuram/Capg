package Practice_capg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\VJIT\\Desktop\\Program\\Demo.txt");
			System.out.println("Enter an integer");
			int n= sc.nextInt();
			fileOutputStream.write(n);
			
				fileOutputStream.close();
			
			
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileInputStream fileInputStream = new FileInputStream("C:\\Users\\VJIT\\Desktop\\Program\\Demo.txt");
			//System.out.println("Enter an integer");
			//int n= sc.nextInt();
			System.out.println(fileInputStream.read());
			
				fileInputStream.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	}
