package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class HMap_HSet {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(101, "Bob");
		hashMap.put(102, "Alice");
		
		for ( HashMap.Entry  m: hashMap.entrySet()) {
			System.out.println( m.getValue());
		}
		
           HashSet<String> hashSet = new HashSet<String>(hashMap.values());
           
           System.out.println(hashSet);
}
}
