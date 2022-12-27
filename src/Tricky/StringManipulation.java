package Tricky;

public class StringManipulation {

	public static void main(String[] args) {
		
		String s = "shiva shakti shambhu";
		
		//2nd occurence of s
		System.out.println	(s.indexOf("s", s.indexOf('s')+1));
		System.out.println(s.indexOf("s", 7));
		

		//swapped
		int x = 10;
		int y = 20;
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println	(x + " " + y);
		
		//swap strings
		
	String	s1 = "shiva";
	String s2 = "shakti";
	
	s1 = s1+s2;
	s2 = s1.substring(0,s1.length()-s2.length());
	
	s1 = s1.substring(s2.length());
	
	System.out.println(s1 + " " + s2);
	
	
		
	}

}
