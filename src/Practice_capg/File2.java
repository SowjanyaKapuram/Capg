package Practice_capg;

//import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

 

public class File2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	 
	
		
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\VJIT\\Desktop\\Program\\Demo1.txt");
			 String s= sc.next();
			 byte[ ] b= s.getBytes();
			 fileOutputStream.write(b);
				
				fileOutputStream.close();
			
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Done");
		
		
		try {
			FileInputStream fileInputStream = new FileInputStream("C:\\Users\\VJIT\\Desktop\\Program\\Demo1.txt");
			  
			 int i;
			while((i=fileInputStream.read()) != -1) {
				System.out.print((char) i);
				
			}
				
				fileInputStream.close();
			
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
