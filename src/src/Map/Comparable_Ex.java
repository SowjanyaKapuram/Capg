package Map;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.Collections;

//import com.bank.model.User;
public class Comparable_Ex {

	public static void main(String[] args) {
		ArrayList<Student> a= new ArrayList<>();
		a.add(new Student("Sowjanya",123,24));
		a.add(new Student("Lavanya",124,21));
		a.add(new Student("Sowjany",124,27));
		
		Collections.sort(a);
		for(Student st:a) {
			System.out.println(st.name+ " " +st.rollno+ " "+st.age);
		}
		
		
	}

}
