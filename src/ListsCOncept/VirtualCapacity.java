package ListsCOncept;

import java.util.ArrayList;
import java.util.Arrays;

public class VirtualCapacity {

	
	public static void main(String[] args) {
		
		
		int i[] = new int[3];
		
		i[2] = 100;
	//	i[-3] = 10;
		
	//	System.out.println(i[-3]);
		

		ArrayList<Object> ar = new ArrayList<Object>();  // generic array list
		//by default v c = 10 
		
		ar.add(108); //0 -> not synchronized , added one value 
	
		// now vc = 9 and pc i.e physical capacity = 1
		
		// in order to change default vc , do below , add new value inside constructor
		ArrayList<Object> ar1 = new ArrayList<Object>(20); 
		
		//clone or copy same elements and create a new llist 
		ArrayList<Object> cloneList = (ArrayList<Object>) ar.clone();
		
		//to check if element exists
		ar1.contains(100);
		
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("jai hind", "vande mataram","local")); 
		System.out.println(names);
		// if an element does not exist it will not give error, it will give -1 
		System.out.println(names.lastIndexOf("abc"));
		
		// remove if oper to get odd and even nums
		ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(1,2,3,4)); 
	//	num.removeIf(s->s%2==0);
	//	System.out.println(num);
		num.removeIf(s->s%2!=0);
		System.out.println(num);
	
		
		// convert array list to array 
		Object arr[] = names.toArray();
		System.out.println(Arrays.toString(arr));
		
		for(Object o:arr)
		{
			System.out.println((String)o);
		}
		
	}
	
}

