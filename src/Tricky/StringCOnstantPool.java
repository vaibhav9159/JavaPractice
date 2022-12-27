package Tricky;

public class StringCOnstantPool {

	public static void main(String[] args) {
	
// how many objects created ->  1 object for s1,s3 ands3 inside string ocnstant pool 
		// 1 object for n1 , 1 object for n2 , total 3
		
		String s1 = "Namaste";  // 1 object created inside string const pool , no extra object will be created in heap memory as its a literal
		String s2 = "Namaste";
		String s3=s1;
		
		String n1 = new String("Namaste"); // 1object created inside heap memory , scp has same value so no new object inside scp
		String n2 = new String("Namaste"); // 1object created inside heap memory, scp has same value so no new object inside scp
		
		System.out.println(s1==s2);
		System.out.println(n1==n2);
		System.out.println(s1==n2);
		
		
	//	Total = 3 objects created for below lines (1 String const Pool(as val is same) + 2(n1 and n2) heap memory)
		String n3 = new String("Namaskar"); // 1object created inside heap memory and  another 1object inside string const pool 
		String n4 = new String("Namaskar");// 1object created inside heap memory and  another 1object inside string const pool 
		
		

	}

}