package OOPSConceptPart2;

//You can't define static methods in an interface because static methods belongs to a class not to an instance of class until jdk 1.8
//FROM JDK 1.8 WE CAN ADD STATIC METHODS INSIDE INTERFACE
//WE CAN DECALRE DEFAULT METHODS ALSO INSIDE INTERFACE
//and interfaces are not Classes.
// only method declaration, no body
//abstract in nature means we can't create object if interface
// variables are static and final,  value can't be changed 
// no main method in interface
// a class can implement multiple interfaces - inheritance, is-a-relationship (relation bwtn interfaces and a class) , has a relation - class2class
public interface Banks {
	
	int min_bal = 100;
	
	public void credit();
	
	public void dedit();
	
	public void transferMoney();
	
	public static void transactionHistory()
	{
		System.out.println("Interface static method transactionHistory");
	}
	
	default void maxLimit()
	{
		System.out.println("Interface deafult method maxLimit");
	}
	
}
