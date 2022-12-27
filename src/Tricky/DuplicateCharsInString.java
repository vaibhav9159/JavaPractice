package Tricky;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.IntStream;

public class DuplicateCharsInString {

	public static void getDuplicateWordsAndCount(String inputText)
	{
		getDuplicateChars("ShivaShambhu");
		getDuplicateChars(null);
		getDuplicateChars("a");
		
	} 	
	
	
	public static void getDuplicateChars(String str)
	{
		if(str==null)
		{
			System.out.println("NULL");
			return;
		}
	   if(str.length()==1)
		{
			System.out.println("Single Char");
			return;
		}
		
	   // convert string to char
	  char words[]= str.toCharArray();
	  HashMap<Character,Integer> map = new  HashMap<Character,Integer>();
	  for(Character ch:words)
	  {
		  if(map.containsKey(ch))
		  {
			  map.put(ch, map.get(ch)+1);
		  }
		  else
		  {
			  map.put(ch, 1);
		  }
	  }
	   
	  //print duplicaet values 
	  
	  Set<Entry<Character,Integer>> entrySet = map.entrySet();
	  for(Entry<Character,Integer>entry:entrySet)
	  {
		  if(entry.getValue()>1)
		  {
			  System.out.println(entry.getKey() + " " + entry.getValue());
		  }
	  }
	   
	}

}
