package HashMapConcepts;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.google.common.collect.ImmutableMap;

public class HashMapConcept {

	// static way - 
	public static HashMap<String, Integer> map2 ;
	
	static 
	{	map2 = new HashMap<String,Integer>();
		map2.put("Shiva static", 108);
		map2.put("Shakti static", 112);
		
	}
	
	public static void main(String[] args) {
			
		// 1 hashmap class to nitialize
		HashMap<String, Integer> map1 = new HashMap<String,Integer>();
		
		// 2 static way
		System.out.println(map2.get("Shiva static"));	
		
		
		//JDK 1.8
		// 3 using streams and lambda 
		
		Map<String, String> map3 = Stream.of(new String[][]
     {
			{"name1" , "100"}, {"name2" , "200"}
				}).collect(Collectors.toMap(data->data[0], data->data[1]));
		
		System.out.println(map3.get("name1"));
		
		
		//JDK1.9
		// Empty map 
		
		Map<String, Integer> map4 = Map.of();
		System.out.println(map4);
		
		//SIngleValue map 
		Map<String, String> map5 = Map.of("singleValue" , "112");
		System.out.println(map5.get("singleValue"));
	//	map5.put(null, null) // unsupported action
		
		
		//Multi Map - max 10 pairs are allowed
		Map<String, String> map6 = Map.of("MultiValue" , "114" , "k2" , "v2");
		System.out.println(map6.get("MultiValue"));
		
		// no limitations on pairs
		
		Map<String, Integer> map7  = Map.ofEntries( new AbstractMap.SimpleEntry<>("A", 100),new AbstractMap.SimpleEntry<>("B", 200));
		System.out.println(map7.get("A"));
		
		// using guava  - comes from guava not jdk 
		Map<String, String> map8 = 	ImmutableMap.of("Google" ,"Google bharat", "Amazon" , "Amazon Bharat", "Flipkart", "Flipkart Bharat");
		System.out.println(map8.get("Google"));

	}

}
