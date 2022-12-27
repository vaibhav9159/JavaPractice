package OOPSConcept;

public class MethodOverloading {

	public static void main(String[] args) {

		MethodOverloading m = new MethodOverloading();
		m.test();
		m.test(1);
		m.test(3, 7);
	}
	
	//same methodname with diff arguments types or diff count of  arguments.
	public void test()
	{
		
		int i = 13;
	}
	public void test(int i)
	{
		
		
	}
	public void test(int j, int k)
	{
		
		int i = 13;
	}
	public void test(String i)
	{
		
		 i = "shiva";
	}
	

}
