package Practice_capg;
import Basics.Student;
public class ObjectPassingDemo {
	Student s = new Student();
	
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		 ObjectPassingDemo obj = new  ObjectPassingDemo();
		 Student s1 = new Student();
		 s1= obj.accept(s);
		 obj.display(s1);
		 
		 
	}
	public Student accept() {
		
		
		System.out.println("Enter name:");
		s.setName(sc.next());
		System.out.println("Enter name:");
		s.setroll(sc.nextInt());
		System.out.println("Enter name:");
        s.setFees(sc.nextDouble());
          return s;
		
	}
	
	public Student display() {
		System.out.println(s.getName());
		System.out.println(s.getRoll());
		System.out.println(s.getFees());
	}
}
