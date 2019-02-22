package Collections_Pac;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import oops.Student1;
public class Ex4 {
	static int count=1;
	public static Student1 setInfo() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details of student"+ count);
		Student1 student1 = new Student1();
		student1.setName(sc.next());
		student1.setRoll(sc.nextInt());
		student1.setFees(sc.nextDouble());
		count++;
		return student1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student1> sa= new ArrayList<>();
		sa.add(setInfo());
		sa.add(setInfo());
		
System.out.println(sa);

try {
	FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\VJIT\\Desktop\\Program\\Demo.txt");
	ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
	//System.out.println("Enter an integer");
	//int n= sc.nextInt();
	objectOutputStream.writeObject(sa);
	
		fileOutputStream.close();
	
	
		
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}





	}

}
