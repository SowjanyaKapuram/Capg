package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMap_Ex {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(101, "Bob");
		hashMap.put(102, "Alice");
		hashMap.put(103, "Jane");
		hashMap.put(104, "Sue");
		for ( Map.Entry  m: hashMap.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(101, "Bob");
		treeMap.put(102, "Alice");
		treeMap.put(103, "Jane");
		treeMap.put(104, "Sue");
		for (Map.Entry  t: treeMap.entrySet()) {
			System.out.println(t.getKey()+" "+t.getValue());
		}

	}

}
