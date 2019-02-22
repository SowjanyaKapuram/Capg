package Collections_Pac;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List animals= new ArrayList();
     animals.add("Harry");
     animals.add(123);
     animals.add(23.45);
     System.out.println(animals);
     System.out.println(animals.get(2));
     animals.add(2,"Elephant");
     System.out.println(animals);
     System.out.println(animals.get(2));
	}

}
