package Collections_Pac;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import oops.Student1;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
		 
try {
	FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Vjit\\Desktop\\Program\\Demo.txt");
	ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
	
	ArrayList<Integer> al= new ArrayList<>();
	int i;
	//int a[] = new int[];
	
	/*ile((i=fileInputStream.read()) != -1) {
		if(i!='-') {
			
		 al.add(i);
		}
		//i++;
		 System.out.println(al);
	}*/
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
