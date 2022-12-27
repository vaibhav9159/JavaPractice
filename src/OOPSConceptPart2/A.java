package OOPSConceptPart2;

public class A  {
	
	public A()
	{
		System.out.println("deafult constrc A parent");
	}
	
	public A(int i)
	{
		System.out.println("param constrc A parent " + i);
	}

	public static void main(String[] args) {
		
	//	A a1 = new A();
		Banks.transactionHistory();  // calling static method of an interface withot using implements keyword

	}

	

}
