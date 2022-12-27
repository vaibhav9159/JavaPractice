package HashMapConcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.google.common.collect.ImmutableMap;

//convert hashmap into array list 

public class HashMapConversion {

	public static void main(String[] args) {
		
		HashMap <String,Integer> map1 = new HashMap <String,Integer>();
		map1.put("Shiva", 108);
		map1.put("Shakti", 112);

		Iterator it = map1.entrySet().iterator();
		
		while(it.hasNext())
		{
		Map.Entry pairs	= (Map.Entry)it.next();
		System.out.println("1st via iterator = "+pairs.getKey());
		pairs.getValue();
		}
		
		
		//convert hashmap key and values into array lists
		
		ArrayList<String> key = new ArrayList<String>(map1.keySet());
		for(String e: key)
		{
			System.out.println(e);
		}
		
		ArrayList<Integer> value = new ArrayList<Integer>(map1.values());
		for(Integer v: value)
		{
			System.out.println(v);
		}
	
		
		// WITH GUAVA - MUCH EASIER 
		Map<String, String> map2= ImmutableMap.of("k1","v1","k2","v2","k3","v3","k4","v4");
		
		ArrayList<String> guava = new ArrayList<String>(map2.keySet());
		for(String g: guava)
		{
			System.out.println(g);
		}
		
		ArrayList<String> guavaValue = new ArrayList<String>(map2.values());
		for(String v: guavaValue)
		{
			System.out.println(v);
		}
		
		
	}

}
