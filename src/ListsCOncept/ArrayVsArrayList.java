package ListsCOncept;

import java.util.ArrayList;

public class ArrayVsArrayList {

	
	public static void main(String[] args) {
		
		
		int i[] = new int[3];
		
		i[3] = 100;
		i[-3] = 10;
		
		System.out.println(i[-3]);
		

		ArrayList<Object> ar = new ArrayList<Object>();  // generic array list
		ar.add(108); //0 -> not synchronized
		ar.add("shiva");  //1 -> maintains order
		ar.add(108.234); //2 -> can contain duplicate values 
		ar.add(true); //3 - > stores value on basis of index, 
		
		ar.get(1); 
		
	}
	
}

