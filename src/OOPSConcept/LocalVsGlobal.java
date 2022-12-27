package OOPSConcept;

public class LocalVsGlobal {

	//global variables - need to create class object to access these
	//class object has its owrn memory inside java memory 
	int i = 11;
	String bike = "Yamaha R15v4.0";
	
	public static void main(String[] args) {
		//Main has its own memory inside java memory and main memory will contain i = 17 , 
		//local variable to main method only
		int i = 17;
		
	}
	
	public void test()
	{
		//local variable to test method only
		int i = 13;
	}
}
