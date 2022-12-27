package Tricky;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import org.checkerframework.checker.units.qual.K;

public class FindDuplicateElementsInArray {

	public static void main(String[] args) {
		
		String arr[] = {"Google" , "Google", "Amazon", "Bharat","Bharat","Bharat", "Shiva","Shiva","Shiva", "Shambhu"};
		
			//brute force + hash set method
		
		HashSet<String> set1 = new HashSet<String>();
		for(int i=0;i<arr.length;i++)
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].equals(arr[j]))
				{
					set1.add(arr[j]);	
				}
			}
			System.out.println(set1);
			
			
	//only hashset , O(n) complexity		
/*			
		HashSet set3 = new HashSet<>();
		for(String name:arr)
		{
		if(set3.add(name)==false)
		{
			System.out.println("duplicate name = " +name);
		}
		
		}  */
			
		//HashMap method
			
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		for(String val:arr)
		{
			if(map.containsKey(val))
			{
				map.put(val, map.get(val)+1);
			}
			else
			{
				map.put(val, 1);
			}
		}
		
		//print dup values
		
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		for(Entry<String,Integer> entry:entrySet)
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey());
			}
		}
		
		
		// STream + hashset method 
		HashSet<String> set2 = new HashSet<String>();
		Set<String> streams = Arrays.asList(arr).stream().filter(s->!set2.add(s)).collect(Collectors.toSet());
		System.out.println(streams);
		
		
	}
	
}
