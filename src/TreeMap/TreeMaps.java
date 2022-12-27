package TreeMap;

import java.util.TreeMap;

import com.google.common.collect.ImmutableMap;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TreeMaps {

	public static void main(String[] args) {

		//Tree map is required when we want a sorted map 
		
		TreeMap <Integer,String> map1 = new TreeMap<>();
		map1.put(300, "v1");
		map1.put(100, "v2");
		map1.put(200, "v3");
		
		map1.forEach((k,v) -> System.out.println("Key = " + k + " value =  "+v));
		
		//get key less than 300
		Set<Integer> key = map1.headMap(300).keySet();
		System.out.println(key);
		
		//get key gretr than = 100
		Set<Integer> keyG = map1.tailMap(100).keySet();
		System.out.println(keyG);
		
		
		TreeMap <Integer,String> map2 = new TreeMap<>(Comparator.reverseOrder());
		map2.put(200, "v2");
		map2.put(300, "v3");
		map2.put(100, "v1");
		
		System.out.println(map2);   
		
		ArrayList<Integer> ar1 = new ArrayList(map2.keySet());
		ArrayList<String> ar2 = new ArrayList(map2.values());
		
		for(Integer i: ar1)
		{
			System.out.println("Key = " + i);
		}
		for(String v: ar2)
		{
			System.out.println("Value = " + v);
		}
		
		 
		
		
	}

}
