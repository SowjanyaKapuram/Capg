package exampleofsuper;

public class Subchild extends Child{
String name="Alice";
public Subchild() {
	System.out.println(super.name);
	super.show();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subchild s=new Subchild();
		s.show();
		s.run();
		System.out.println(s.name);
		
	}

}
