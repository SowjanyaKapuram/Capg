package Collections_Pac;

import java.util.ArrayList;

public class ArrayList_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<Integer> al= new ArrayList();
     al.add(123);
     al.add(34);
     al.add(null);
     System.out.println(al);
     ArrayList<Integer> al1= new ArrayList();
     al1.add(234);
     al1.add(546);
     
     System.out.println(al1);
     
     al.addAll(2,al1);
     System.out.println(al);
     
	}

}
