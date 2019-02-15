package oops;

public class Child extends parent{

	public static void main(String[] args) {
		Child c=new Child();
		c.show();
		c.run();
		System.out.println("father name:"+c.name);
		System.out.println("roll number "+c.roll);
		System.out.println("age is "+c.age);
	}

}
