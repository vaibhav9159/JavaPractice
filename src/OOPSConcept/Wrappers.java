package OOPSConcept;

public class Wrappers {

	public static void main(String[] args) {
	
		String s = "100";
		
		int i = Integer.parseInt(s);
		System.out.println(i);
		
		String d1 = "200.2132";
		double d = Double.parseDouble(d1);
		System.out.println(d+100);
		
		String b = "true";
		Boolean.parseBoolean(b);
		
		int a = 101;
		System.out.println(a+10);
		
		String s1 = String.valueOf(a);
		System.out.println(s1+10);
		
		
	}

}
