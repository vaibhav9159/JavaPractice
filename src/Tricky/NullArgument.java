package Tricky;

public class NullArgument {

	public static void main(String[] args) {

		
		test(null);
	}

	// preference will be given to STring even though Object is the super class of string but string is more common data type

	public static void test(String s)
	{
		System.out.println("string");
	}
	
	public static void test(Object o)
	{
		System.out.println("object");
	}
	
}
