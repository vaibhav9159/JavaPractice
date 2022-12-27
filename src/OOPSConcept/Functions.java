package OOPSConcept;

public class Functions {

	public static void main(String[] args) {
	//main method is void because we never write return statement inside it, never returns a value
		// to access non static methods need to create class object 
		Functions f = new Functions();
		f.r15();
		f.r15v2();
		System.out.println(f.r15v3(10, 5));

	}
		
	public void r15()
	{
		System.out.println("no input, no output");
	}
	
	public int r15v2()
	{
		int cc = 150;
		int bc = 100;
		System.out.println("no input, some output");
		return cc;	
	}

	public int r15v3(int x, int y)
	{
		
		System.out.println("with input, some output ");
		int d = x/y;
		return d;	
	}
	
	
	
}
