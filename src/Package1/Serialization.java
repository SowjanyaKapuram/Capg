package Package1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import oops.Student1;

public class Serialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 student1= new Student1();
		student1.setName("Sowjanya");
		student1.setRoll(123);
		student1.setFees(50000);
try {
	FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Vjit\\Desktop\\Program\\Demo3.txt");
	ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
	
	objectOutputStream.writeObject(student1);
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

		System.out.println("Done");
		
	}

}
