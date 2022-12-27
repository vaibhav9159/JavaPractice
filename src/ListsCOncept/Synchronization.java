package ListsCOncept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

import com.google.common.collect.ImmutableMap;

public class Synchronization {

	public static void main(String[] args) {
	
		float a = 2;
		float b = 4;
		
		float c = (a/b);
		System.out.println(c);
		
		// CopyOnWriteArrayList - thread safe class - no need to use explicit sync keyword anywhere
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
		System.out.println(list);
		

		Map<String, String> map1 =ImmutableMap.of("k1","v1","k2","v2");
		System.out.println(map1.get("k1"));
		
		ArrayList <String>  ar1 = new ArrayList(map1.keySet());
		
		for(String s : ar1)
		{
			System.out.println(s);
		}
		
		ArrayList <String>  ar2 = new ArrayList(map1.values());
		for(String s : ar2)
		{
			System.out.println(s);
		}
		
	}

}
