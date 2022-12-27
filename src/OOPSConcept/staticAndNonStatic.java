package OOPSConcept;

public class staticAndNonStatic {

	int a = 11;
	static int age = 31;
	// static methods and vars have diff memory allocated in java memory other then object memory 
	//they can be accessed directly or via class object creation also
	
	public static void main(String[] args) {
	
		//call by classname
		staticAndNonStatic.teststatic();	
		//directcall
		teststatic();
		//static variable call
		System.out.println(age);
	}
	
	
	public void test()
	{
		System.out.println("non static");
	}
	
	//static methods
	public static void teststatic()
	{
		System.out.println("static");
	}
	

}
