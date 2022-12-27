package HashMapConcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class MissingKeyInHashMap {

	public static void main(String[] args) {
	
		
		HashMap<Integer,String> map1 = new HashMap<Integer,String>();
		HashMap<Integer,String> map2 = new HashMap<Integer,String>();
		HashMap<Integer,String> map3 = new HashMap<Integer,String>();
		
		map1.put(1, "a");
		map1.put(2, "b");
		map1.put(3, "c");
		
		map2.put(3, "c");
		map2.put(1, "a");
		map2.put(2, "b");
		
		map3.put(3, "c");
		map3.put(1, "a");
		map3.put(2, "b");
		map3.put(4, "c");
		
		//comapre hashmaps keys and values
		System.out.println(map1.equals(map2));
		
		//comapre hashmaps keys 
		System.out.println	(	map1.keySet().equals(map2.keySet()));
		
		
		//find extra key or missing key in hashmap
		
		HashSet<Integer> combined = new HashSet(map1.keySet());
		
		combined.addAll(map3.keySet());
		combined.removeAll(map1.keySet());
		System.out.println(combined);
		
		//compare by values - when duplicates not allowed - array lits considers dupliucates 
		System.out.println(new ArrayList<>(map1.values()).equals(new ArrayList<>(map3.values())));
		
		//compare by values - when duplicates are allowed, hashet only picks unique values
		System.out.println(new HashSet<>(map1.values()).equals(new HashSet<>(map3.values())));
		

	}

}
