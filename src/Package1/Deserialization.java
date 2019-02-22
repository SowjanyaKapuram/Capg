package Package1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import oops.Student1;

public class Deserialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
try {
	FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Vjit\\Desktop\\Program\\Demo3.txt");
	ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
	
	Student1 s = (Student1)objectInputStream.readObject();
	System.out.println(s.getName() +" "+ s.getRoll()+" "+s.getFees());
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

		 
		
	}

}
 