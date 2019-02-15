package oops;

public class Batch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1  s1= new Student1();
		Student1  s2= new Student1();
		Student1  s3= new Student1();
		s1.setRoll(10);
		s1.setFees(1000);
		s1.setName("bob");
		s1.setCollegename("VJIT");
		//System.out.println(s1.getRoll());
		//System.out.println(s1.getFees());
		//System.out.println(s1.getName());
		//System.out.println(s1.getCollegename());
		s2.setRoll(11);
		s2.setFees(1100);
		s2.setName("darth");
		s2.setCollegename("VJIT");
		//System.out.println(s2.getRoll());
		//System.out.println(s2.getFees());
		//System.out.println(s2.getName());
		//System.out.println(s2.getCollegename());
		s3.setRoll(101);
		s3.setFees(10001);
		s3.setName("Alice");
		s3.setCollegename("CVSR");
		//System.out.println(s3.getRoll());
		//System.out.println(s3.getFees());
		//System.out.println(s3.getName());
		System.out.println(s1.getCollegename());
		System.out.println(s2.getCollegename());
		System.out.println(s3.getCollegename());
		
	}

}
