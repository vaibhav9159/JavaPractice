package ListsCOncept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CompareLists {

	public static void main(String[] args) {
		
		
		 ArrayList<Integer> ar1 = new  ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,7,7,7,8,9));
		 ArrayList<Integer> ar2 = new  ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,7,7,7,9,8));
		 ArrayList<Integer> ar3 = new  ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,7,7,7,9,10));
		 // remove duplicate elements
		List<Integer> distList =  ar1.stream().distinct().collect(Collectors.toList());
		System.out.println(distList);
		
		// compare two lists - first sort then compare
		Collections.sort(ar1);
		Collections.sort(ar2);
		System.out.println(ar1.equals(ar2));
		
		// find the additional or diff element
//		ar2.removeAll(ar3);
//		System.out.println(ar2);
		
//		ar3.removeAll(ar2);
//		System.out.println(ar3);
		
		
		//common elements 
		ar3.retainAll(ar2);
		System.out.println(ar3);
		
		
	}
	
	// another way is to send the list into constructor of  linkedhashset object and then store the object into new array list constructor 

	

}
