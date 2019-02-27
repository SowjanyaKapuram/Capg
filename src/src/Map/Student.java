package Map;

public class Student implements Comparable<Student>{
	int rollno;
	String name;
	int age;
	Student(String name,int rollno,int age){
		this.name=name;
		this.rollno=rollno;
		this.age= age;
	}
public int compareTo(Student st) {
	if(age==st.age)
		return 0;
	else if(age>st.age)
		return 1;
	else return -1;
	
}
}
