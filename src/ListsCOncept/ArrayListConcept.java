package ListsCOncept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {

		//non generic array list
		
		ArrayList ar = new ArrayList();  // non generic array list
		ar.add(108); //0 -> not synchronized
		ar.add("shiva");  //1 -> maintains order
		ar.add(108.234); //2 -> can contain duplicate values 
		ar.add(true); //3 - > stores value on basis of index, 
		
		ar.get(1); // 4 -> get  value bsaed on index
		
		ar.size();

			//generic array list 
		ArrayList<Integer> ar1 = new ArrayList<Integer>();  // generic integer
		ar1.add(20); 
		
		employee e1 = new employee("shiva", 108, "engg");
		employee e2 = new employee("shakti", 112, "engg");
		employee e3 = new employee("shambhu", 114, "engg");
		
		ArrayList<employee> e = new ArrayList<employee>();// this means we can store employee objects, generic = employee 
		e.add(e3);
		e.add(e2);
		e.add(e1);
		
		for(employee a:e)
		{	
			System.out.println(a.name);
			System.out.println(a.dept);
			System.out.println(a.empid);
		} 
	
/*    	Iterator<employee> it  = e.iterator(); 
		while(it.hasNext())
		{
			employee em = it.next();
			System.out.println(em.name);
			System.out.println(em.dept);
			System.out.println(em.empid);	
		} */
		
		
		//add one array list into another -> addAll method
		
		ArrayList<String> ar2 = new ArrayList();
		ar2.add("list2");
		
		ArrayList<String> ar3 = new ArrayList();
		ar3.add("list3");
		
		ar2.addAll(ar3);
	//	ar2.removeAll(ar3);
		for(String a2:ar2)
		{	
			System.out.println(a2);
		
		} 
		
		//retainALl - to print common value b/w two arrayLists
		
		ArrayList<String> ar4 = new ArrayList();
		ar4.add("listCommon");
		ar4.add("list4");
		
		ArrayList<String> ar5 = new ArrayList();
		ar5.add("listCommon");
		ar5.add("list5");
		
		ar4.retainAll(ar5);
		for(String a4:ar4)
		{	
			System.out.println(a4);
		
		} 
	}

}